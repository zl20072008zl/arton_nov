package com.somoplay.artonexpress.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.somoplay.artonexpress.domain.Promotion;

import com.somoplay.artonexpress.repository.PromotionRepository;
import com.somoplay.artonexpress.web.rest.util.HeaderUtil;
import com.somoplay.artonexpress.web.rest.util.PaginationUtil;
import com.somoplay.artonexpress.service.dto.PromotionDTO;
import com.somoplay.artonexpress.service.mapper.PromotionMapper;
import io.swagger.annotations.ApiParam;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing Promotion.
 */
@RestController
@RequestMapping("/api")
public class PromotionResource {

    private final Logger log = LoggerFactory.getLogger(PromotionResource.class);

    private static final String ENTITY_NAME = "promotion";

    private final PromotionRepository promotionRepository;

    private final PromotionMapper promotionMapper;

    public PromotionResource(PromotionRepository promotionRepository, PromotionMapper promotionMapper) {
        this.promotionRepository = promotionRepository;
        this.promotionMapper = promotionMapper;
    }

    /**
     * POST  /promotions : Create a new promotion.
     *
     * @param promotionDTO the promotionDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new promotionDTO, or with status 400 (Bad Request) if the promotion has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/promotions")
    @Timed
    public ResponseEntity<PromotionDTO> createPromotion(@RequestBody PromotionDTO promotionDTO) throws URISyntaxException {
        log.debug("REST request to save Promotion : {}", promotionDTO);
        if (promotionDTO.getId() != null) {
            return ResponseEntity.badRequest().headers(HeaderUtil.createFailureAlert(ENTITY_NAME, "idexists", "A new promotion cannot already have an ID")).body(null);
        }
        Promotion promotion = promotionMapper.toEntity(promotionDTO);
        promotion = promotionRepository.save(promotion);
        PromotionDTO result = promotionMapper.toDto(promotion);
        return ResponseEntity.created(new URI("/api/promotions/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /promotions : Updates an existing promotion.
     *
     * @param promotionDTO the promotionDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated promotionDTO,
     * or with status 400 (Bad Request) if the promotionDTO is not valid,
     * or with status 500 (Internal Server Error) if the promotionDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/promotions")
    @Timed
    public ResponseEntity<PromotionDTO> updatePromotion(@RequestBody PromotionDTO promotionDTO) throws URISyntaxException {
        log.debug("REST request to update Promotion : {}", promotionDTO);
        if (promotionDTO.getId() == null) {
            return createPromotion(promotionDTO);
        }
        Promotion promotion = promotionMapper.toEntity(promotionDTO);
        promotion = promotionRepository.save(promotion);
        PromotionDTO result = promotionMapper.toDto(promotion);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, promotionDTO.getId().toString()))
            .body(result);
    }

    /**
     * GET  /promotions : get all the promotions.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of promotions in body
     */
    @GetMapping("/promotions")
    @Timed
    public ResponseEntity<List<PromotionDTO>> getAllPromotions(@ApiParam Pageable pageable) {
        log.debug("REST request to get a page of Promotions");
        Page<Promotion> page = promotionRepository.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/promotions");
        return new ResponseEntity<>(promotionMapper.toDto(page.getContent()), headers, HttpStatus.OK);
    }

    /**
     * GET  /promotions/:id : get the "id" promotion.
     *
     * @param id the id of the promotionDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the promotionDTO, or with status 404 (Not Found)
     */
    @GetMapping("/promotions/{id}")
    @Timed
    public ResponseEntity<PromotionDTO> getPromotion(@PathVariable Long id) {
        log.debug("REST request to get Promotion : {}", id);
        Promotion promotion = promotionRepository.findOne(id);
        PromotionDTO promotionDTO = promotionMapper.toDto(promotion);
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(promotionDTO));
    }

    /**
     * GET  /promotions : get all the promotions.
     *
     * @param
     * @return the ResponseEntity with status 200 (OK) and the list of promotions in body
     */
    @GetMapping("/active_promotion")
    @Timed
    public List<Promotion> getAllActivePromotions() {
        List<Promotion> list = promotionRepository.findAll();
        LocalDate now = LocalDate.now();
        boolean start = false;
        boolean end = false;
        List<Promotion> promotionList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Promotion promotion = list.get(i);
            start = now.isAfter(promotion.getStartDate());
            end = now.isBefore(promotion.getExpiredDate());
            if(start && end){
                promotionList.add(promotion);
            }
        }
        return promotionList;
    }

    /**
     * DELETE  /promotions/:id : delete the "id" promotion.
     *
     * @param id the id of the promotionDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/promotions/{id}")
    @Timed
    public ResponseEntity<Void> deletePromotion(@PathVariable Long id) {
        log.debug("REST request to delete Promotion : {}", id);
        promotionRepository.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }
}
