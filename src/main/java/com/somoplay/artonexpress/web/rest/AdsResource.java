package com.somoplay.artonexpress.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.somoplay.artonexpress.domain.Ads;

import com.somoplay.artonexpress.repository.AdsRepository;
import com.somoplay.artonexpress.web.rest.util.HeaderUtil;
import com.somoplay.artonexpress.web.rest.util.PaginationUtil;
import com.somoplay.artonexpress.service.dto.AdsDTO;
import com.somoplay.artonexpress.service.mapper.AdsMapper;
import io.swagger.annotations.ApiParam;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * REST controller for managing Ads.
 */
@RestController
@RequestMapping("/api")
public class AdsResource {

    private final Logger log = LoggerFactory.getLogger(AdsResource.class);

    private static final String ENTITY_NAME = "ads";

    private final AdsRepository adsRepository;

    private final AdsMapper adsMapper;

    @Autowired
    ServletContext context;

    public AdsResource(AdsRepository adsRepository, AdsMapper adsMapper) {
        this.adsRepository = adsRepository;
        this.adsMapper = adsMapper;
    }

    /**
     * POST  /ads : Create a new ads.
     *
     * @param adsDTO the adsDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new adsDTO, or with status 400 (Bad Request) if the ads has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/ads")
    @Timed
    public ResponseEntity<AdsDTO> createAds(@Valid @RequestBody AdsDTO adsDTO) throws URISyntaxException {
        log.debug("REST request to save Ads : {}", adsDTO);
        if (adsDTO.getId() != null) {
            return ResponseEntity.badRequest().headers(HeaderUtil.createFailureAlert(ENTITY_NAME, "idexists", "A new ads cannot already have an ID")).body(null);
        }
        Ads ads = adsMapper.toEntity(adsDTO);
        ads = adsRepository.save(ads);
        AdsDTO result = adsMapper.toDto(ads);
        return ResponseEntity.created(new URI("/api/ads/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /ads : Updates an existing ads.
     *
     * @param adsDTO the adsDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated adsDTO,
     * or with status 400 (Bad Request) if the adsDTO is not valid,
     * or with status 500 (Internal Server Error) if the adsDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/ads")
    @Timed
    public ResponseEntity<AdsDTO> updateAds(@Valid @RequestBody AdsDTO adsDTO) throws URISyntaxException {
        log.debug("REST request to update Ads : {}", adsDTO);
        if (adsDTO.getId() == null) {
            return createAds(adsDTO);
        }
        Ads ads = adsMapper.toEntity(adsDTO);
        ads = adsRepository.save(ads);
        AdsDTO result = adsMapper.toDto(ads);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, adsDTO.getId().toString()))
            .body(result);
    }

    /**
     * GET  /ads : get all the ads.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of ads in body
     */
    @GetMapping("/ads")
    @Timed
    public ResponseEntity<List<AdsDTO>> getAllAds(@ApiParam Pageable pageable) {
        log.debug("REST request to get a page of Ads");
        Page<Ads> page = adsRepository.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/ads");
        return new ResponseEntity<>(adsMapper.toDto(page.getContent()), headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/ads/list")
    @Timed
    public List<Ads> getAllAdsList() {
        log.debug("REST request to getAllAds");
        System.out.println("===========");
        List<Ads> list = adsRepository.findAll();
        return list;
    }

    /**
     * GET  /ads/:id : get the "id" ads.
     *
     * @param id the id of the adsDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the adsDTO, or with status 404 (Not Found)
     */
    @GetMapping("/ads/{id}")
    @Timed
    public ResponseEntity<AdsDTO> getAds(@PathVariable Long id) {
        log.debug("REST request to get Ads : {}", id);
        Ads ads = adsRepository.findOne(id);
        AdsDTO adsDTO = adsMapper.toDto(ads);
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(adsDTO));
    }

    /**
     * DELETE  /ads/:id : delete the "id" ads.
     *
     * @param id the id of the adsDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/ads/{id}")
    @Timed
    public ResponseEntity<Void> deleteAds(@PathVariable Long id) {
        log.debug("REST request to delete Ads : {}", id);
        adsRepository.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }

    @RequestMapping(value="/ads/uploadImage", headers = ("content-type=multipart/*"), method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ResponseBody
    public Map<String, Object> ngUpload(@RequestParam("uploadFile") MultipartFile uploadFile,
                                        HttpServletRequest request){
        System.out.println(uploadFile.getOriginalFilename());
        Map<String, Object> resMap = new HashMap<String, Object>();

        MultipartFile file = uploadFile;
        if(file != null){
            DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
            Calendar calendar = Calendar.getInstance();
            String dateName = df.format(calendar.getTime())+file.getOriginalFilename();
//            String filePath = "/Users/leizhang/Documents/arton_nov/src/main/webapp/images/upload/" + fileName;
            String filePath = request.getSession().getServletContext().getRealPath("/images") + File.separator + dateName;
            File localFile = new File(filePath);
            System.out.println(filePath);
//            System.out.println(request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort());
            if(!localFile.getParentFile().exists()) {
                //
                localFile.getParentFile().mkdirs();
                System.out.println("parent:"+localFile.getParentFile().getPath());
            }
            //write to local file
            try {
                file.transferTo(localFile);
                resMap.put("result", "success");
                resMap.put("path","images/" + dateName);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                resMap.put("result", "error");
                resMap.put("message",e.getMessage());
                e.printStackTrace();
                return resMap;
            }
        }


        return resMap;
    }

}
