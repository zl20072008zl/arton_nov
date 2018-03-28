package com.somoplay.artonexpress.web.rest;

import com.somoplay.artonexpress.ArtonexpressApp;

import com.somoplay.artonexpress.domain.Ads;
import com.somoplay.artonexpress.repository.AdsRepository;
import com.somoplay.artonexpress.service.dto.AdsDTO;
import com.somoplay.artonexpress.service.mapper.AdsMapper;
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
 * Test class for the AdsResource REST controller.
 *
 * @see AdsResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArtonexpressApp.class)
public class AdsResourceIntTest {

    private static final String DEFAULT_NAME = "AAAAAAAAAA";
    private static final String UPDATED_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_IMAGE_PATH = "AAAAAAAAAA";
    private static final String UPDATED_IMAGE_PATH = "BBBBBBBBBB";

    private static final String DEFAULT_DESCRIPTION = "AAAAAAAAAA";
    private static final String UPDATED_DESCRIPTION = "BBBBBBBBBB";

    private static final Integer DEFAULT_SORT = 1;
    private static final Integer UPDATED_SORT = 2;

    private static final LocalDate DEFAULT_CREATE_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_CREATE_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_UPDATE_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_UPDATE_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final Boolean DEFAULT_ACTIVATED = false;
    private static final Boolean UPDATED_ACTIVATED = true;

    @Autowired
    private AdsRepository adsRepository;

    @Autowired
    private AdsMapper adsMapper;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    private MockMvc restAdsMockMvc;

    private Ads ads;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        AdsResource adsResource = new AdsResource(adsRepository, adsMapper);
        this.restAdsMockMvc = MockMvcBuilders.standaloneSetup(adsResource)
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
    public static Ads createEntity(EntityManager em) {
        Ads ads = new Ads()
            .name(DEFAULT_NAME)
            .imagePath(DEFAULT_IMAGE_PATH)
            .description(DEFAULT_DESCRIPTION)
            .sort(DEFAULT_SORT)
            .createDate(DEFAULT_CREATE_DATE)
            .updateDate(DEFAULT_UPDATE_DATE)
            .activated(DEFAULT_ACTIVATED);
        return ads;
    }

    @Before
    public void initTest() {
        ads = createEntity(em);
    }

    @Test
    @Transactional
    public void createAds() throws Exception {
        int databaseSizeBeforeCreate = adsRepository.findAll().size();

        // Create the Ads
        AdsDTO adsDTO = adsMapper.toDto(ads);
        restAdsMockMvc.perform(post("/api/ads")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(adsDTO)))
            .andExpect(status().isCreated());

        // Validate the Ads in the database
        List<Ads> adsList = adsRepository.findAll();
        assertThat(adsList).hasSize(databaseSizeBeforeCreate + 1);
        Ads testAds = adsList.get(adsList.size() - 1);
        assertThat(testAds.getName()).isEqualTo(DEFAULT_NAME);
        assertThat(testAds.getImagePath()).isEqualTo(DEFAULT_IMAGE_PATH);
        assertThat(testAds.getDescription()).isEqualTo(DEFAULT_DESCRIPTION);
        assertThat(testAds.getSort()).isEqualTo(DEFAULT_SORT);
        assertThat(testAds.getCreateDate()).isEqualTo(DEFAULT_CREATE_DATE);
        assertThat(testAds.getUpdateDate()).isEqualTo(DEFAULT_UPDATE_DATE);
        assertThat(testAds.isActivated()).isEqualTo(DEFAULT_ACTIVATED);
    }

    @Test
    @Transactional
    public void createAdsWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = adsRepository.findAll().size();

        // Create the Ads with an existing ID
        ads.setId(1L);
        AdsDTO adsDTO = adsMapper.toDto(ads);

        // An entity with an existing ID cannot be created, so this API call must fail
        restAdsMockMvc.perform(post("/api/ads")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(adsDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Alice in the database
        List<Ads> adsList = adsRepository.findAll();
        assertThat(adsList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    public void checkActivatedIsRequired() throws Exception {
        int databaseSizeBeforeTest = adsRepository.findAll().size();
        // set the field null
        ads.setActivated(null);

        // Create the Ads, which fails.
        AdsDTO adsDTO = adsMapper.toDto(ads);

        restAdsMockMvc.perform(post("/api/ads")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(adsDTO)))
            .andExpect(status().isBadRequest());

        List<Ads> adsList = adsRepository.findAll();
        assertThat(adsList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void getAllAds() throws Exception {
        // Initialize the database
        adsRepository.saveAndFlush(ads);

        // Get all the adsList
        restAdsMockMvc.perform(get("/api/ads?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(ads.getId().intValue())))
            .andExpect(jsonPath("$.[*].name").value(hasItem(DEFAULT_NAME.toString())))
            .andExpect(jsonPath("$.[*].imagePath").value(hasItem(DEFAULT_IMAGE_PATH.toString())))
            .andExpect(jsonPath("$.[*].description").value(hasItem(DEFAULT_DESCRIPTION.toString())))
            .andExpect(jsonPath("$.[*].sort").value(hasItem(DEFAULT_SORT)))
            .andExpect(jsonPath("$.[*].createDate").value(hasItem(DEFAULT_CREATE_DATE.toString())))
            .andExpect(jsonPath("$.[*].updateDate").value(hasItem(DEFAULT_UPDATE_DATE.toString())))
            .andExpect(jsonPath("$.[*].activated").value(hasItem(DEFAULT_ACTIVATED.booleanValue())));
    }

    @Test
    @Transactional
    public void getAds() throws Exception {
        // Initialize the database
        adsRepository.saveAndFlush(ads);

        // Get the ads
        restAdsMockMvc.perform(get("/api/ads/{id}", ads.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(ads.getId().intValue()))
            .andExpect(jsonPath("$.name").value(DEFAULT_NAME.toString()))
            .andExpect(jsonPath("$.imagePath").value(DEFAULT_IMAGE_PATH.toString()))
            .andExpect(jsonPath("$.description").value(DEFAULT_DESCRIPTION.toString()))
            .andExpect(jsonPath("$.sort").value(DEFAULT_SORT))
            .andExpect(jsonPath("$.createDate").value(DEFAULT_CREATE_DATE.toString()))
            .andExpect(jsonPath("$.updateDate").value(DEFAULT_UPDATE_DATE.toString()))
            .andExpect(jsonPath("$.activated").value(DEFAULT_ACTIVATED.booleanValue()));
    }

    @Test
    @Transactional
    public void getNonExistingAds() throws Exception {
        // Get the ads
        restAdsMockMvc.perform(get("/api/ads/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateAds() throws Exception {
        // Initialize the database
        adsRepository.saveAndFlush(ads);
        int databaseSizeBeforeUpdate = adsRepository.findAll().size();

        // Update the ads
        Ads updatedAds = adsRepository.findOne(ads.getId());
        updatedAds
            .name(UPDATED_NAME)
            .imagePath(UPDATED_IMAGE_PATH)
            .description(UPDATED_DESCRIPTION)
            .sort(UPDATED_SORT)
            .createDate(UPDATED_CREATE_DATE)
            .updateDate(UPDATED_UPDATE_DATE)
            .activated(UPDATED_ACTIVATED);
        AdsDTO adsDTO = adsMapper.toDto(updatedAds);

        restAdsMockMvc.perform(put("/api/ads")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(adsDTO)))
            .andExpect(status().isOk());

        // Validate the Ads in the database
        List<Ads> adsList = adsRepository.findAll();
        assertThat(adsList).hasSize(databaseSizeBeforeUpdate);
        Ads testAds = adsList.get(adsList.size() - 1);
        assertThat(testAds.getName()).isEqualTo(UPDATED_NAME);
        assertThat(testAds.getImagePath()).isEqualTo(UPDATED_IMAGE_PATH);
        assertThat(testAds.getDescription()).isEqualTo(UPDATED_DESCRIPTION);
        assertThat(testAds.getSort()).isEqualTo(UPDATED_SORT);
        assertThat(testAds.getCreateDate()).isEqualTo(UPDATED_CREATE_DATE);
        assertThat(testAds.getUpdateDate()).isEqualTo(UPDATED_UPDATE_DATE);
        assertThat(testAds.isActivated()).isEqualTo(UPDATED_ACTIVATED);
    }

    @Test
    @Transactional
    public void updateNonExistingAds() throws Exception {
        int databaseSizeBeforeUpdate = adsRepository.findAll().size();

        // Create the Ads
        AdsDTO adsDTO = adsMapper.toDto(ads);

        // If the entity doesn't have an ID, it will be created instead of just being updated
        restAdsMockMvc.perform(put("/api/ads")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(adsDTO)))
            .andExpect(status().isCreated());

        // Validate the Ads in the database
        List<Ads> adsList = adsRepository.findAll();
        assertThat(adsList).hasSize(databaseSizeBeforeUpdate + 1);
    }

    @Test
    @Transactional
    public void deleteAds() throws Exception {
        // Initialize the database
        adsRepository.saveAndFlush(ads);
        int databaseSizeBeforeDelete = adsRepository.findAll().size();

        // Get the ads
        restAdsMockMvc.perform(delete("/api/ads/{id}", ads.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<Ads> adsList = adsRepository.findAll();
        assertThat(adsList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Ads.class);
        Ads ads1 = new Ads();
        ads1.setId(1L);
        Ads ads2 = new Ads();
        ads2.setId(ads1.getId());
        assertThat(ads1).isEqualTo(ads2);
        ads2.setId(2L);
        assertThat(ads1).isNotEqualTo(ads2);
        ads1.setId(null);
        assertThat(ads1).isNotEqualTo(ads2);
    }

    @Test
    @Transactional
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(AdsDTO.class);
        AdsDTO adsDTO1 = new AdsDTO();
        adsDTO1.setId(1L);
        AdsDTO adsDTO2 = new AdsDTO();
        assertThat(adsDTO1).isNotEqualTo(adsDTO2);
        adsDTO2.setId(adsDTO1.getId());
        assertThat(adsDTO1).isEqualTo(adsDTO2);
        adsDTO2.setId(2L);
        assertThat(adsDTO1).isNotEqualTo(adsDTO2);
        adsDTO1.setId(null);
        assertThat(adsDTO1).isNotEqualTo(adsDTO2);
    }

    @Test
    @Transactional
    public void testEntityFromId() {
        assertThat(adsMapper.fromId(42L).getId()).isEqualTo(42);
        assertThat(adsMapper.fromId(null)).isNull();
    }
}
