package com.somoplay.artonexpress.web.rest;

import com.somoplay.artonexpress.ArtonexpressApp;

import com.somoplay.artonexpress.domain.Promotion;
import com.somoplay.artonexpress.repository.PromotionRepository;
import com.somoplay.artonexpress.service.dto.PromotionDTO;
import com.somoplay.artonexpress.service.mapper.PromotionMapper;
import com.somoplay.artonexpress.web.rest.errors.ExceptionTranslator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the PromotionResource REST controller.
 *
 * @see PromotionResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArtonexpressApp.class)
public class PromotionResourceIntTest {

    private static final LocalDate DEFAULT_CREATED_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_CREATED_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_UPDATED_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_UPDATED_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_NAME = "AAAAAAAAAA";
    private static final String UPDATED_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_DESCRIPTION = "AAAAAAAAAA";
    private static final String UPDATED_DESCRIPTION = "BBBBBBBBBB";

    private static final Float DEFAULT_PERCENTAGE_OFF = 1F;
    private static final Float UPDATED_PERCENTAGE_OFF = 2F;

    private static final LocalDate DEFAULT_START_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_START_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_EXPIRED_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_EXPIRED_DATE = LocalDate.now(ZoneId.systemDefault());

    @Autowired
    private PromotionRepository promotionRepository;

    @Autowired
    private PromotionMapper promotionMapper;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    private MockMvc restPromotionMockMvc;

    private Promotion promotion;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        PromotionResource promotionResource = new PromotionResource(promotionRepository, promotionMapper);
        this.restPromotionMockMvc = MockMvcBuilders.standaloneSetup(promotionResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setMessageConverters(jacksonMessageConverter).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Promotion createEntity(EntityManager em) {
        Promotion promotion = new Promotion()
            .createdDate(DEFAULT_CREATED_DATE)
            .updatedDate(DEFAULT_UPDATED_DATE)
            .name(DEFAULT_NAME)
            .description(DEFAULT_DESCRIPTION)
            .percentageOff(DEFAULT_PERCENTAGE_OFF)
            .startDate(DEFAULT_START_DATE)
            .expiredDate(DEFAULT_EXPIRED_DATE);
        return promotion;
    }

    @Before
    public void initTest() {
        promotion = createEntity(em);
    }

    @Test
    @Transactional
    public void createPromotion() throws Exception {
        int databaseSizeBeforeCreate = promotionRepository.findAll().size();

        // Create the Promotion
        PromotionDTO promotionDTO = promotionMapper.toDto(promotion);
        restPromotionMockMvc.perform(post("/api/promotions")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(promotionDTO)))
            .andExpect(status().isCreated());

        // Validate the Promotion in the database
        List<Promotion> promotionList = promotionRepository.findAll();
        assertThat(promotionList).hasSize(databaseSizeBeforeCreate + 1);
        Promotion testPromotion = promotionList.get(promotionList.size() - 1);
        assertThat(testPromotion.getCreatedDate()).isEqualTo(DEFAULT_CREATED_DATE);
        assertThat(testPromotion.getUpdatedDate()).isEqualTo(DEFAULT_UPDATED_DATE);
        assertThat(testPromotion.getName()).isEqualTo(DEFAULT_NAME);
        assertThat(testPromotion.getDescription()).isEqualTo(DEFAULT_DESCRIPTION);
        assertThat(testPromotion.getPercentageOff()).isEqualTo(DEFAULT_PERCENTAGE_OFF);
        assertThat(testPromotion.getStartDate()).isEqualTo(DEFAULT_START_DATE);
        assertThat(testPromotion.getExpiredDate()).isEqualTo(DEFAULT_EXPIRED_DATE);
    }

    @Test
    @Transactional
    public void createPromotionWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = promotionRepository.findAll().size();

        // Create the Promotion with an existing ID
        promotion.setId(1L);
        PromotionDTO promotionDTO = promotionMapper.toDto(promotion);

        // An entity with an existing ID cannot be created, so this API call must fail
        restPromotionMockMvc.perform(post("/api/promotions")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(promotionDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Alice in the database
        List<Promotion> promotionList = promotionRepository.findAll();
        assertThat(promotionList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    public void getAllPromotions() throws Exception {
        // Initialize the database
        promotionRepository.saveAndFlush(promotion);

        // Get all the promotionList
        restPromotionMockMvc.perform(get("/api/promotions?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(promotion.getId().intValue())))
            .andExpect(jsonPath("$.[*].createdDate").value(hasItem(DEFAULT_CREATED_DATE.toString())))
            .andExpect(jsonPath("$.[*].updatedDate").value(hasItem(DEFAULT_UPDATED_DATE.toString())))
            .andExpect(jsonPath("$.[*].name").value(hasItem(DEFAULT_NAME.toString())))
            .andExpect(jsonPath("$.[*].description").value(hasItem(DEFAULT_DESCRIPTION.toString())))
            .andExpect(jsonPath("$.[*].percentageOff").value(hasItem(DEFAULT_PERCENTAGE_OFF.doubleValue())))
            .andExpect(jsonPath("$.[*].startDate").value(hasItem(DEFAULT_START_DATE.toString())))
            .andExpect(jsonPath("$.[*].expiredDate").value(hasItem(DEFAULT_EXPIRED_DATE.toString())));
    }

    @Test
    @Transactional
    public void getPromotion() throws Exception {
        // Initialize the database
        promotionRepository.saveAndFlush(promotion);

        // Get the promotion
        restPromotionMockMvc.perform(get("/api/promotions/{id}", promotion.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(promotion.getId().intValue()))
            .andExpect(jsonPath("$.createdDate").value(DEFAULT_CREATED_DATE.toString()))
            .andExpect(jsonPath("$.updatedDate").value(DEFAULT_UPDATED_DATE.toString()))
            .andExpect(jsonPath("$.name").value(DEFAULT_NAME.toString()))
            .andExpect(jsonPath("$.description").value(DEFAULT_DESCRIPTION.toString()))
            .andExpect(jsonPath("$.percentageOff").value(DEFAULT_PERCENTAGE_OFF.doubleValue()))
            .andExpect(jsonPath("$.startDate").value(DEFAULT_START_DATE.toString()))
            .andExpect(jsonPath("$.expiredDate").value(DEFAULT_EXPIRED_DATE.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingPromotion() throws Exception {
        // Get the promotion
        restPromotionMockMvc.perform(get("/api/promotions/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updatePromotion() throws Exception {
        // Initialize the database
        promotionRepository.saveAndFlush(promotion);
        int databaseSizeBeforeUpdate = promotionRepository.findAll().size();

        // Update the promotion
        Promotion updatedPromotion = promotionRepository.findOne(promotion.getId());
        updatedPromotion
            .createdDate(UPDATED_CREATED_DATE)
            .updatedDate(UPDATED_UPDATED_DATE)
            .name(UPDATED_NAME)
            .description(UPDATED_DESCRIPTION)
            .percentageOff(UPDATED_PERCENTAGE_OFF)
            .startDate(UPDATED_START_DATE)
            .expiredDate(UPDATED_EXPIRED_DATE);
        PromotionDTO promotionDTO = promotionMapper.toDto(updatedPromotion);

        restPromotionMockMvc.perform(put("/api/promotions")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(promotionDTO)))
            .andExpect(status().isOk());

        // Validate the Promotion in the database
        List<Promotion> promotionList = promotionRepository.findAll();
        assertThat(promotionList).hasSize(databaseSizeBeforeUpdate);
        Promotion testPromotion = promotionList.get(promotionList.size() - 1);
        assertThat(testPromotion.getCreatedDate()).isEqualTo(UPDATED_CREATED_DATE);
        assertThat(testPromotion.getUpdatedDate()).isEqualTo(UPDATED_UPDATED_DATE);
        assertThat(testPromotion.getName()).isEqualTo(UPDATED_NAME);
        assertThat(testPromotion.getDescription()).isEqualTo(UPDATED_DESCRIPTION);
        assertThat(testPromotion.getPercentageOff()).isEqualTo(UPDATED_PERCENTAGE_OFF);
        assertThat(testPromotion.getStartDate()).isEqualTo(UPDATED_START_DATE);
        assertThat(testPromotion.getExpiredDate()).isEqualTo(UPDATED_EXPIRED_DATE);
    }

    @Test
    @Transactional
    public void updateNonExistingPromotion() throws Exception {
        int databaseSizeBeforeUpdate = promotionRepository.findAll().size();

        // Create the Promotion
        PromotionDTO promotionDTO = promotionMapper.toDto(promotion);

        // If the entity doesn't have an ID, it will be created instead of just being updated
        restPromotionMockMvc.perform(put("/api/promotions")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(promotionDTO)))
            .andExpect(status().isCreated());

        // Validate the Promotion in the database
        List<Promotion> promotionList = promotionRepository.findAll();
        assertThat(promotionList).hasSize(databaseSizeBeforeUpdate + 1);
    }

    @Test
    @Transactional
    public void deletePromotion() throws Exception {
        // Initialize the database
        promotionRepository.saveAndFlush(promotion);
        int databaseSizeBeforeDelete = promotionRepository.findAll().size();

        // Get the promotion
        restPromotionMockMvc.perform(delete("/api/promotions/{id}", promotion.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<Promotion> promotionList = promotionRepository.findAll();
        assertThat(promotionList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Promotion.class);
        Promotion promotion1 = new Promotion();
        promotion1.setId(1L);
        Promotion promotion2 = new Promotion();
        promotion2.setId(promotion1.getId());
        assertThat(promotion1).isEqualTo(promotion2);
        promotion2.setId(2L);
        assertThat(promotion1).isNotEqualTo(promotion2);
        promotion1.setId(null);
        assertThat(promotion1).isNotEqualTo(promotion2);
    }

    @Test
    @Transactional
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(PromotionDTO.class);
        PromotionDTO promotionDTO1 = new PromotionDTO();
        promotionDTO1.setId(1L);
        PromotionDTO promotionDTO2 = new PromotionDTO();
        assertThat(promotionDTO1).isNotEqualTo(promotionDTO2);
        promotionDTO2.setId(promotionDTO1.getId());
        assertThat(promotionDTO1).isEqualTo(promotionDTO2);
        promotionDTO2.setId(2L);
        assertThat(promotionDTO1).isNotEqualTo(promotionDTO2);
        promotionDTO1.setId(null);
        assertThat(promotionDTO1).isNotEqualTo(promotionDTO2);
    }

    @Test
    @Transactional
    public void testEntityFromId() {
        assertThat(promotionMapper.fromId(42L).getId()).isEqualTo(42);
        assertThat(promotionMapper.fromId(null)).isNull();
    }
}
