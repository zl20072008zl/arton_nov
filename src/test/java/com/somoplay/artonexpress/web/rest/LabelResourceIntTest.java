package com.somoplay.artonexpress.web.rest;

import com.somoplay.artonexpress.ArtonexpressApp;

import com.somoplay.artonexpress.domain.Label;
import com.somoplay.artonexpress.repository.LabelRepository;
import com.somoplay.artonexpress.service.dto.LabelDTO;
import com.somoplay.artonexpress.service.mapper.LabelMapper;
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
import org.springframework.util.Base64Utils;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the LabelResource REST controller.
 *
 * @see LabelResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArtonexpressApp.class)
public class LabelResourceIntTest {

    private static final LocalDate DEFAULT_CREATED_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_CREATED_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_UPDATED_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_UPDATED_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_TRACKING_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_TRACKING_NUMBER = "BBBBBBBBBB";

    private static final byte[] DEFAULT_SHIPPING_LABEL = TestUtil.createByteArray(1, "0");
    private static final byte[] UPDATED_SHIPPING_LABEL = TestUtil.createByteArray(2, "1");
    private static final String DEFAULT_SHIPPING_LABEL_CONTENT_TYPE = "image/jpg";
    private static final String UPDATED_SHIPPING_LABEL_CONTENT_TYPE = "image/png";

    private static final String DEFAULT_LINK = "AAAAAAAAAA";
    private static final String UPDATED_LINK = "BBBBBBBBBB";

    private static final String DEFAULT_SHIPMENT_ID = "AAAAAAAAAA";
    private static final String UPDATED_SHIPMENT_ID = "BBBBBBBBBB";

    private static final String DEFAULT_SHIPMENT_STATUS = "AAAAAAAAAA";
    private static final String UPDATED_SHIPMENT_STATUS = "BBBBBBBBBB";

    private static final String DEFAULT_USER = "AAAAAAAAAA";
    private static final String UPDATED_USER = "BBBBBBBBBB";

    @Autowired
    private LabelRepository labelRepository;

    @Autowired
    private LabelMapper labelMapper;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    private MockMvc restLabelMockMvc;

    private Label label;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        LabelResource labelResource = new LabelResource(labelRepository, labelMapper);
        this.restLabelMockMvc = MockMvcBuilders.standaloneSetup(labelResource)
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
    public static Label createEntity(EntityManager em) {
        Label label = new Label()
            .createdDate(DEFAULT_CREATED_DATE)
            .updatedDate(DEFAULT_UPDATED_DATE)
            .trackingNumber(DEFAULT_TRACKING_NUMBER)
            .shippingLabel(DEFAULT_SHIPPING_LABEL)
            .shippingLabelContentType(DEFAULT_SHIPPING_LABEL_CONTENT_TYPE)
            .link(DEFAULT_LINK)
            .shipmentId(DEFAULT_SHIPMENT_ID)
            .shipmentStatus(DEFAULT_SHIPMENT_STATUS)
            .user(DEFAULT_USER);
        return label;
    }

    @Before
    public void initTest() {
        label = createEntity(em);
    }

    @Test
    @Transactional
    public void createLabel() throws Exception {
        int databaseSizeBeforeCreate = labelRepository.findAll().size();

        // Create the Label
        LabelDTO labelDTO = labelMapper.toDto(label);
        restLabelMockMvc.perform(post("/api/labels")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(labelDTO)))
            .andExpect(status().isCreated());

        // Validate the Label in the database
        List<Label> labelList = labelRepository.findAll();
        assertThat(labelList).hasSize(databaseSizeBeforeCreate + 1);
        Label testLabel = labelList.get(labelList.size() - 1);
        assertThat(testLabel.getCreatedDate()).isEqualTo(DEFAULT_CREATED_DATE);
        assertThat(testLabel.getUpdatedDate()).isEqualTo(DEFAULT_UPDATED_DATE);
        assertThat(testLabel.getTrackingNumber()).isEqualTo(DEFAULT_TRACKING_NUMBER);
        assertThat(testLabel.getShippingLabel()).isEqualTo(DEFAULT_SHIPPING_LABEL);
        assertThat(testLabel.getShippingLabelContentType()).isEqualTo(DEFAULT_SHIPPING_LABEL_CONTENT_TYPE);
        assertThat(testLabel.getLink()).isEqualTo(DEFAULT_LINK);
        assertThat(testLabel.getShipmentId()).isEqualTo(DEFAULT_SHIPMENT_ID);
        assertThat(testLabel.getShipmentStatus()).isEqualTo(DEFAULT_SHIPMENT_STATUS);
        assertThat(testLabel.getUser()).isEqualTo(DEFAULT_USER);
    }

    @Test
    @Transactional
    public void createLabelWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = labelRepository.findAll().size();

        // Create the Label with an existing ID
        label.setId(1L);
        LabelDTO labelDTO = labelMapper.toDto(label);

        // An entity with an existing ID cannot be created, so this API call must fail
        restLabelMockMvc.perform(post("/api/labels")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(labelDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Alice in the database
        List<Label> labelList = labelRepository.findAll();
        assertThat(labelList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    public void getAllLabels() throws Exception {
        // Initialize the database
        labelRepository.saveAndFlush(label);

        // Get all the labelList
        restLabelMockMvc.perform(get("/api/labels?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(label.getId().intValue())))
            .andExpect(jsonPath("$.[*].createdDate").value(hasItem(DEFAULT_CREATED_DATE.toString())))
            .andExpect(jsonPath("$.[*].updatedDate").value(hasItem(DEFAULT_UPDATED_DATE.toString())))
            .andExpect(jsonPath("$.[*].trackingNumber").value(hasItem(DEFAULT_TRACKING_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].shippingLabelContentType").value(hasItem(DEFAULT_SHIPPING_LABEL_CONTENT_TYPE)))
            .andExpect(jsonPath("$.[*].shippingLabel").value(hasItem(Base64Utils.encodeToString(DEFAULT_SHIPPING_LABEL))))
            .andExpect(jsonPath("$.[*].link").value(hasItem(DEFAULT_LINK.toString())))
            .andExpect(jsonPath("$.[*].shipmentId").value(hasItem(DEFAULT_SHIPMENT_ID.toString())))
            .andExpect(jsonPath("$.[*].shipmentStatus").value(hasItem(DEFAULT_SHIPMENT_STATUS.toString())))
            .andExpect(jsonPath("$.[*].user").value(hasItem(DEFAULT_USER.toString())));
    }

    @Test
    @Transactional
    public void getLabel() throws Exception {
        // Initialize the database
        labelRepository.saveAndFlush(label);

        // Get the label
        restLabelMockMvc.perform(get("/api/labels/{id}", label.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(label.getId().intValue()))
            .andExpect(jsonPath("$.createdDate").value(DEFAULT_CREATED_DATE.toString()))
            .andExpect(jsonPath("$.updatedDate").value(DEFAULT_UPDATED_DATE.toString()))
            .andExpect(jsonPath("$.trackingNumber").value(DEFAULT_TRACKING_NUMBER.toString()))
            .andExpect(jsonPath("$.shippingLabelContentType").value(DEFAULT_SHIPPING_LABEL_CONTENT_TYPE))
            .andExpect(jsonPath("$.shippingLabel").value(Base64Utils.encodeToString(DEFAULT_SHIPPING_LABEL)))
            .andExpect(jsonPath("$.link").value(DEFAULT_LINK.toString()))
            .andExpect(jsonPath("$.shipmentId").value(DEFAULT_SHIPMENT_ID.toString()))
            .andExpect(jsonPath("$.shipmentStatus").value(DEFAULT_SHIPMENT_STATUS.toString()))
            .andExpect(jsonPath("$.user").value(DEFAULT_USER.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingLabel() throws Exception {
        // Get the label
        restLabelMockMvc.perform(get("/api/labels/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateLabel() throws Exception {
        // Initialize the database
        labelRepository.saveAndFlush(label);
        int databaseSizeBeforeUpdate = labelRepository.findAll().size();

        // Update the label
        Label updatedLabel = labelRepository.findOne(label.getId());
        updatedLabel
            .createdDate(UPDATED_CREATED_DATE)
            .updatedDate(UPDATED_UPDATED_DATE)
            .trackingNumber(UPDATED_TRACKING_NUMBER)
            .shippingLabel(UPDATED_SHIPPING_LABEL)
            .shippingLabelContentType(UPDATED_SHIPPING_LABEL_CONTENT_TYPE)
            .link(UPDATED_LINK)
            .shipmentId(UPDATED_SHIPMENT_ID)
            .shipmentStatus(UPDATED_SHIPMENT_STATUS)
            .user(UPDATED_USER);
        LabelDTO labelDTO = labelMapper.toDto(updatedLabel);

        restLabelMockMvc.perform(put("/api/labels")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(labelDTO)))
            .andExpect(status().isOk());

        // Validate the Label in the database
        List<Label> labelList = labelRepository.findAll();
        assertThat(labelList).hasSize(databaseSizeBeforeUpdate);
        Label testLabel = labelList.get(labelList.size() - 1);
        assertThat(testLabel.getCreatedDate()).isEqualTo(UPDATED_CREATED_DATE);
        assertThat(testLabel.getUpdatedDate()).isEqualTo(UPDATED_UPDATED_DATE);
        assertThat(testLabel.getTrackingNumber()).isEqualTo(UPDATED_TRACKING_NUMBER);
        assertThat(testLabel.getShippingLabel()).isEqualTo(UPDATED_SHIPPING_LABEL);
        assertThat(testLabel.getShippingLabelContentType()).isEqualTo(UPDATED_SHIPPING_LABEL_CONTENT_TYPE);
        assertThat(testLabel.getLink()).isEqualTo(UPDATED_LINK);
        assertThat(testLabel.getShipmentId()).isEqualTo(UPDATED_SHIPMENT_ID);
        assertThat(testLabel.getShipmentStatus()).isEqualTo(UPDATED_SHIPMENT_STATUS);
        assertThat(testLabel.getUser()).isEqualTo(UPDATED_USER);
    }

    @Test
    @Transactional
    public void updateNonExistingLabel() throws Exception {
        int databaseSizeBeforeUpdate = labelRepository.findAll().size();

        // Create the Label
        LabelDTO labelDTO = labelMapper.toDto(label);

        // If the entity doesn't have an ID, it will be created instead of just being updated
        restLabelMockMvc.perform(put("/api/labels")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(labelDTO)))
            .andExpect(status().isCreated());

        // Validate the Label in the database
        List<Label> labelList = labelRepository.findAll();
        assertThat(labelList).hasSize(databaseSizeBeforeUpdate + 1);
    }

    @Test
    @Transactional
    public void deleteLabel() throws Exception {
        // Initialize the database
        labelRepository.saveAndFlush(label);
        int databaseSizeBeforeDelete = labelRepository.findAll().size();

        // Get the label
        restLabelMockMvc.perform(delete("/api/labels/{id}", label.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<Label> labelList = labelRepository.findAll();
        assertThat(labelList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Label.class);
        Label label1 = new Label();
        label1.setId(1L);
        Label label2 = new Label();
        label2.setId(label1.getId());
        assertThat(label1).isEqualTo(label2);
        label2.setId(2L);
        assertThat(label1).isNotEqualTo(label2);
        label1.setId(null);
        assertThat(label1).isNotEqualTo(label2);
    }

    @Test
    @Transactional
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(LabelDTO.class);
        LabelDTO labelDTO1 = new LabelDTO();
        labelDTO1.setId(1L);
        LabelDTO labelDTO2 = new LabelDTO();
        assertThat(labelDTO1).isNotEqualTo(labelDTO2);
        labelDTO2.setId(labelDTO1.getId());
        assertThat(labelDTO1).isEqualTo(labelDTO2);
        labelDTO2.setId(2L);
        assertThat(labelDTO1).isNotEqualTo(labelDTO2);
        labelDTO1.setId(null);
        assertThat(labelDTO1).isNotEqualTo(labelDTO2);
    }

    @Test
    @Transactional
    public void testEntityFromId() {
        assertThat(labelMapper.fromId(42L).getId()).isEqualTo(42);
        assertThat(labelMapper.fromId(null)).isNull();
    }
}
