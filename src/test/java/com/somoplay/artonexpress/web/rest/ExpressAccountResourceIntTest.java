package com.somoplay.artonexpress.web.rest;

import com.somoplay.artonexpress.ArtonexpressApp;

import com.somoplay.artonexpress.domain.ExpressAccount;
import com.somoplay.artonexpress.repository.ExpressAccountRepository;
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
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the ExpressAccountResource REST controller.
 *
 * @see ExpressAccountResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArtonexpressApp.class)
public class ExpressAccountResourceIntTest {

    private static final String DEFAULT_CP_USER_NAME = "AAAAAAAAAA";
    private static final String UPDATED_CP_USER_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_CP_PASSWORD = "AAAAAAAAAA";
    private static final String UPDATED_CP_PASSWORD = "BBBBBBBBBB";

    private static final String DEFAULT_CP_MAILED_BY = "AAAAAAAAAA";
    private static final String UPDATED_CP_MAILED_BY = "BBBBBBBBBB";

    private static final String DEFAULT_CP_CONTRACT_ID = "AAAAAAAAAA";
    private static final String UPDATED_CP_CONTRACT_ID = "BBBBBBBBBB";

    private static final String DEFAULT_UPS_USER_NAME = "AAAAAAAAAA";
    private static final String UPDATED_UPS_USER_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_UPS_PASSWORD = "AAAAAAAAAA";
    private static final String UPDATED_UPS_PASSWORD = "BBBBBBBBBB";

    private static final String DEFAULT_UPS_ACCESS_LICENSE_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_UPS_ACCESS_LICENSE_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_UPS_ACCOUNT_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_UPS_ACCOUNT_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_FEDEX_ACCOUNT_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_FEDEX_ACCOUNT_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_FEDEX_METER_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_FEDEX_METER_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_FEDEX_KEY = "AAAAAAAAAA";
    private static final String UPDATED_FEDEX_KEY = "BBBBBBBBBB";

    private static final String DEFAULT_FEDEX_PASSWORD = "AAAAAAAAAA";
    private static final String UPDATED_FEDEX_PASSWORD = "BBBBBBBBBB";

    @Autowired
    private ExpressAccountRepository expressAccountRepository;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    private MockMvc restExpressAccountMockMvc;

    private ExpressAccount expressAccount;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        ExpressAccountResource expressAccountResource = new ExpressAccountResource(expressAccountRepository);
        this.restExpressAccountMockMvc = MockMvcBuilders.standaloneSetup(expressAccountResource)
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
    public static ExpressAccount createEntity(EntityManager em) {
        ExpressAccount expressAccount = new ExpressAccount()
            .cpUserName(DEFAULT_CP_USER_NAME)
            .cpPassword(DEFAULT_CP_PASSWORD)
            .cpMailedBy(DEFAULT_CP_MAILED_BY)
            .cpContractId(DEFAULT_CP_CONTRACT_ID)
            .upsUserName(DEFAULT_UPS_USER_NAME)
            .upsPassword(DEFAULT_UPS_PASSWORD)
            .upsAccessLicenseNumber(DEFAULT_UPS_ACCESS_LICENSE_NUMBER)
            .upsAccountNumber(DEFAULT_UPS_ACCOUNT_NUMBER)
            .fedexAccountNumber(DEFAULT_FEDEX_ACCOUNT_NUMBER)
            .fedexMeterNumber(DEFAULT_FEDEX_METER_NUMBER)
            .fedexKey(DEFAULT_FEDEX_KEY)
            .fedexPassword(DEFAULT_FEDEX_PASSWORD);
        return expressAccount;
    }

    @Before
    public void initTest() {
        expressAccount = createEntity(em);
    }

    @Test
    @Transactional
    public void createExpressAccount() throws Exception {
        int databaseSizeBeforeCreate = expressAccountRepository.findAll().size();

        // Create the ExpressAccount
        restExpressAccountMockMvc.perform(post("/api/express-accounts")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(expressAccount)))
            .andExpect(status().isCreated());

        // Validate the ExpressAccount in the database
        List<ExpressAccount> expressAccountList = expressAccountRepository.findAll();
        assertThat(expressAccountList).hasSize(databaseSizeBeforeCreate + 1);
        ExpressAccount testExpressAccount = expressAccountList.get(expressAccountList.size() - 1);
        assertThat(testExpressAccount.getCpUserName()).isEqualTo(DEFAULT_CP_USER_NAME);
        assertThat(testExpressAccount.getCpPassword()).isEqualTo(DEFAULT_CP_PASSWORD);
        assertThat(testExpressAccount.getCpMailedBy()).isEqualTo(DEFAULT_CP_MAILED_BY);
        assertThat(testExpressAccount.getCpContractId()).isEqualTo(DEFAULT_CP_CONTRACT_ID);
        assertThat(testExpressAccount.getUpsUserName()).isEqualTo(DEFAULT_UPS_USER_NAME);
        assertThat(testExpressAccount.getUpsPassword()).isEqualTo(DEFAULT_UPS_PASSWORD);
        assertThat(testExpressAccount.getUpsAccessLicenseNumber()).isEqualTo(DEFAULT_UPS_ACCESS_LICENSE_NUMBER);
        assertThat(testExpressAccount.getUpsAccountNumber()).isEqualTo(DEFAULT_UPS_ACCOUNT_NUMBER);
        assertThat(testExpressAccount.getFedexAccountNumber()).isEqualTo(DEFAULT_FEDEX_ACCOUNT_NUMBER);
        assertThat(testExpressAccount.getFedexMeterNumber()).isEqualTo(DEFAULT_FEDEX_METER_NUMBER);
        assertThat(testExpressAccount.getFedexKey()).isEqualTo(DEFAULT_FEDEX_KEY);
        assertThat(testExpressAccount.getFedexPassword()).isEqualTo(DEFAULT_FEDEX_PASSWORD);
    }

    @Test
    @Transactional
    public void createExpressAccountWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = expressAccountRepository.findAll().size();

        // Create the ExpressAccount with an existing ID
        expressAccount.setId(1L);

        // An entity with an existing ID cannot be created, so this API call must fail
        restExpressAccountMockMvc.perform(post("/api/express-accounts")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(expressAccount)))
            .andExpect(status().isBadRequest());

        // Validate the Alice in the database
        List<ExpressAccount> expressAccountList = expressAccountRepository.findAll();
        assertThat(expressAccountList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    public void getAllExpressAccounts() throws Exception {
        // Initialize the database
        expressAccountRepository.saveAndFlush(expressAccount);

        // Get all the expressAccountList
        restExpressAccountMockMvc.perform(get("/api/express-accounts?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(expressAccount.getId().intValue())))
            .andExpect(jsonPath("$.[*].cpUserName").value(hasItem(DEFAULT_CP_USER_NAME.toString())))
            .andExpect(jsonPath("$.[*].cpPassword").value(hasItem(DEFAULT_CP_PASSWORD.toString())))
            .andExpect(jsonPath("$.[*].cpMailedBy").value(hasItem(DEFAULT_CP_MAILED_BY.toString())))
            .andExpect(jsonPath("$.[*].cpContractId").value(hasItem(DEFAULT_CP_CONTRACT_ID.toString())))
            .andExpect(jsonPath("$.[*].upsUserName").value(hasItem(DEFAULT_UPS_USER_NAME.toString())))
            .andExpect(jsonPath("$.[*].upsPassword").value(hasItem(DEFAULT_UPS_PASSWORD.toString())))
            .andExpect(jsonPath("$.[*].upsAccessLicenseNumber").value(hasItem(DEFAULT_UPS_ACCESS_LICENSE_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].upsAccountNumber").value(hasItem(DEFAULT_UPS_ACCOUNT_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].fedexAccountNumber").value(hasItem(DEFAULT_FEDEX_ACCOUNT_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].fedexMeterNumber").value(hasItem(DEFAULT_FEDEX_METER_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].fedexKey").value(hasItem(DEFAULT_FEDEX_KEY.toString())))
            .andExpect(jsonPath("$.[*].fedexPassword").value(hasItem(DEFAULT_FEDEX_PASSWORD.toString())));
    }

    @Test
    @Transactional
    public void getExpressAccount() throws Exception {
        // Initialize the database
        expressAccountRepository.saveAndFlush(expressAccount);

        // Get the expressAccount
        restExpressAccountMockMvc.perform(get("/api/express-accounts/{id}", expressAccount.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(expressAccount.getId().intValue()))
            .andExpect(jsonPath("$.cpUserName").value(DEFAULT_CP_USER_NAME.toString()))
            .andExpect(jsonPath("$.cpPassword").value(DEFAULT_CP_PASSWORD.toString()))
            .andExpect(jsonPath("$.cpMailedBy").value(DEFAULT_CP_MAILED_BY.toString()))
            .andExpect(jsonPath("$.cpContractId").value(DEFAULT_CP_CONTRACT_ID.toString()))
            .andExpect(jsonPath("$.upsUserName").value(DEFAULT_UPS_USER_NAME.toString()))
            .andExpect(jsonPath("$.upsPassword").value(DEFAULT_UPS_PASSWORD.toString()))
            .andExpect(jsonPath("$.upsAccessLicenseNumber").value(DEFAULT_UPS_ACCESS_LICENSE_NUMBER.toString()))
            .andExpect(jsonPath("$.upsAccountNumber").value(DEFAULT_UPS_ACCOUNT_NUMBER.toString()))
            .andExpect(jsonPath("$.fedexAccountNumber").value(DEFAULT_FEDEX_ACCOUNT_NUMBER.toString()))
            .andExpect(jsonPath("$.fedexMeterNumber").value(DEFAULT_FEDEX_METER_NUMBER.toString()))
            .andExpect(jsonPath("$.fedexKey").value(DEFAULT_FEDEX_KEY.toString()))
            .andExpect(jsonPath("$.fedexPassword").value(DEFAULT_FEDEX_PASSWORD.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingExpressAccount() throws Exception {
        // Get the expressAccount
        restExpressAccountMockMvc.perform(get("/api/express-accounts/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateExpressAccount() throws Exception {
        // Initialize the database
        expressAccountRepository.saveAndFlush(expressAccount);
        int databaseSizeBeforeUpdate = expressAccountRepository.findAll().size();

        // Update the expressAccount
        ExpressAccount updatedExpressAccount = expressAccountRepository.findOne(expressAccount.getId());
        updatedExpressAccount
            .cpUserName(UPDATED_CP_USER_NAME)
            .cpPassword(UPDATED_CP_PASSWORD)
            .cpMailedBy(UPDATED_CP_MAILED_BY)
            .cpContractId(UPDATED_CP_CONTRACT_ID)
            .upsUserName(UPDATED_UPS_USER_NAME)
            .upsPassword(UPDATED_UPS_PASSWORD)
            .upsAccessLicenseNumber(UPDATED_UPS_ACCESS_LICENSE_NUMBER)
            .upsAccountNumber(UPDATED_UPS_ACCOUNT_NUMBER)
            .fedexAccountNumber(UPDATED_FEDEX_ACCOUNT_NUMBER)
            .fedexMeterNumber(UPDATED_FEDEX_METER_NUMBER)
            .fedexKey(UPDATED_FEDEX_KEY)
            .fedexPassword(UPDATED_FEDEX_PASSWORD);

        restExpressAccountMockMvc.perform(put("/api/express-accounts")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(updatedExpressAccount)))
            .andExpect(status().isOk());

        // Validate the ExpressAccount in the database
        List<ExpressAccount> expressAccountList = expressAccountRepository.findAll();
        assertThat(expressAccountList).hasSize(databaseSizeBeforeUpdate);
        ExpressAccount testExpressAccount = expressAccountList.get(expressAccountList.size() - 1);
        assertThat(testExpressAccount.getCpUserName()).isEqualTo(UPDATED_CP_USER_NAME);
        assertThat(testExpressAccount.getCpPassword()).isEqualTo(UPDATED_CP_PASSWORD);
        assertThat(testExpressAccount.getCpMailedBy()).isEqualTo(UPDATED_CP_MAILED_BY);
        assertThat(testExpressAccount.getCpContractId()).isEqualTo(UPDATED_CP_CONTRACT_ID);
        assertThat(testExpressAccount.getUpsUserName()).isEqualTo(UPDATED_UPS_USER_NAME);
        assertThat(testExpressAccount.getUpsPassword()).isEqualTo(UPDATED_UPS_PASSWORD);
        assertThat(testExpressAccount.getUpsAccessLicenseNumber()).isEqualTo(UPDATED_UPS_ACCESS_LICENSE_NUMBER);
        assertThat(testExpressAccount.getUpsAccountNumber()).isEqualTo(UPDATED_UPS_ACCOUNT_NUMBER);
        assertThat(testExpressAccount.getFedexAccountNumber()).isEqualTo(UPDATED_FEDEX_ACCOUNT_NUMBER);
        assertThat(testExpressAccount.getFedexMeterNumber()).isEqualTo(UPDATED_FEDEX_METER_NUMBER);
        assertThat(testExpressAccount.getFedexKey()).isEqualTo(UPDATED_FEDEX_KEY);
        assertThat(testExpressAccount.getFedexPassword()).isEqualTo(UPDATED_FEDEX_PASSWORD);
    }

    @Test
    @Transactional
    public void updateNonExistingExpressAccount() throws Exception {
        int databaseSizeBeforeUpdate = expressAccountRepository.findAll().size();

        // Create the ExpressAccount

        // If the entity doesn't have an ID, it will be created instead of just being updated
        restExpressAccountMockMvc.perform(put("/api/express-accounts")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(expressAccount)))
            .andExpect(status().isCreated());

        // Validate the ExpressAccount in the database
        List<ExpressAccount> expressAccountList = expressAccountRepository.findAll();
        assertThat(expressAccountList).hasSize(databaseSizeBeforeUpdate + 1);
    }

    @Test
    @Transactional
    public void deleteExpressAccount() throws Exception {
        // Initialize the database
        expressAccountRepository.saveAndFlush(expressAccount);
        int databaseSizeBeforeDelete = expressAccountRepository.findAll().size();

        // Get the expressAccount
        restExpressAccountMockMvc.perform(delete("/api/express-accounts/{id}", expressAccount.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<ExpressAccount> expressAccountList = expressAccountRepository.findAll();
        assertThat(expressAccountList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(ExpressAccount.class);
        ExpressAccount expressAccount1 = new ExpressAccount();
        expressAccount1.setId(1L);
        ExpressAccount expressAccount2 = new ExpressAccount();
        expressAccount2.setId(expressAccount1.getId());
        assertThat(expressAccount1).isEqualTo(expressAccount2);
        expressAccount2.setId(2L);
        assertThat(expressAccount1).isNotEqualTo(expressAccount2);
        expressAccount1.setId(null);
        assertThat(expressAccount1).isNotEqualTo(expressAccount2);
    }
}
