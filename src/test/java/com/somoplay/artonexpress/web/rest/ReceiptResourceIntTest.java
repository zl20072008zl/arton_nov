package com.somoplay.artonexpress.web.rest;

import com.somoplay.artonexpress.ArtonexpressApp;

import com.somoplay.artonexpress.domain.Receipt;
import com.somoplay.artonexpress.repository.ReceiptRepository;
import com.somoplay.artonexpress.service.dto.ReceiptDTO;
import com.somoplay.artonexpress.service.mapper.ReceiptMapper;
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
 * Test class for the ReceiptResource REST controller.
 *
 * @see ReceiptResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArtonexpressApp.class)
public class ReceiptResourceIntTest {

    private static final LocalDate DEFAULT_CREATED_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_CREATED_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_UPDATED_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_UPDATED_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_MESSAGE = "AAAAAAAAAA";
    private static final String UPDATED_MESSAGE = "BBBBBBBBBB";

    private static final String DEFAULT_COMPLETE = "AAAAAAAAAA";
    private static final String UPDATED_COMPLETE = "BBBBBBBBBB";

    private static final String DEFAULT_CARD_TYPE = "AAAAAAAAAA";
    private static final String UPDATED_CARD_TYPE = "BBBBBBBBBB";

    private static final String DEFAULT_TXN_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_TXN_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_RECEIPT_ID = "AAAAAAAAAA";
    private static final String UPDATED_RECEIPT_ID = "BBBBBBBBBB";

    private static final String DEFAULT_CORPORATE_CARD = "AAAAAAAAAA";
    private static final String UPDATED_CORPORATE_CARD = "BBBBBBBBBB";

    private static final String DEFAULT_RECUR_SUCCESS = "AAAAAAAAAA";
    private static final String UPDATED_RECUR_SUCCESS = "BBBBBBBBBB";

    private static final String DEFAULT_ITDRESPONSE = "AAAAAAAAAA";
    private static final String UPDATED_ITDRESPONSE = "BBBBBBBBBB";

    private static final String DEFAULT_ISO = "AAAAAAAAAA";
    private static final String UPDATED_ISO = "BBBBBBBBBB";

    private static final String DEFAULT_IS_VISA_DEBIT = "AAAAAAAAAA";
    private static final String UPDATED_IS_VISA_DEBIT = "BBBBBBBBBB";

    private static final String DEFAULT_TIMED_OUT = "AAAAAAAAAA";
    private static final String UPDATED_TIMED_OUT = "BBBBBBBBBB";

    private static final String DEFAULT_MESSAGE_ID = "AAAAAAAAAA";
    private static final String UPDATED_MESSAGE_ID = "BBBBBBBBBB";

    private static final String DEFAULT_TICKET = "AAAAAAAAAA";
    private static final String UPDATED_TICKET = "BBBBBBBBBB";

    private static final String DEFAULT_TRANS_DATE = "AAAAAAAAAA";
    private static final String UPDATED_TRANS_DATE = "BBBBBBBBBB";

    private static final String DEFAULT_CAVV_RESULT_CODE = "AAAAAAAAAA";
    private static final String UPDATED_CAVV_RESULT_CODE = "BBBBBBBBBB";

    private static final String DEFAULT_RESPONSE_CODE = "AAAAAAAAAA";
    private static final String UPDATED_RESPONSE_CODE = "BBBBBBBBBB";

    private static final String DEFAULT_AUTH_CODE = "AAAAAAAAAA";
    private static final String UPDATED_AUTH_CODE = "BBBBBBBBBB";

    private static final String DEFAULT_STATUS_CODE = "AAAAAAAAAA";
    private static final String UPDATED_STATUS_CODE = "BBBBBBBBBB";

    private static final String DEFAULT_TRANS_AMOUNT = "AAAAAAAAAA";
    private static final String UPDATED_TRANS_AMOUNT = "BBBBBBBBBB";

    private static final String DEFAULT_TRANS_TYPE = "AAAAAAAAAA";
    private static final String UPDATED_TRANS_TYPE = "BBBBBBBBBB";

    private static final String DEFAULT_NEXT_RECUR_DATE = "AAAAAAAAAA";
    private static final String UPDATED_NEXT_RECUR_DATE = "BBBBBBBBBB";

    private static final String DEFAULT_AVS_RESULT_CODE = "AAAAAAAAAA";
    private static final String UPDATED_AVS_RESULT_CODE = "BBBBBBBBBB";

    private static final String DEFAULT_RECUR_END_DATE = "AAAAAAAAAA";
    private static final String UPDATED_RECUR_END_DATE = "BBBBBBBBBB";

    private static final String DEFAULT_TRANS_TIME = "AAAAAAAAAA";
    private static final String UPDATED_TRANS_TIME = "BBBBBBBBBB";

    private static final String DEFAULT_CVD_RESULT_CODE = "AAAAAAAAAA";
    private static final String UPDATED_CVD_RESULT_CODE = "BBBBBBBBBB";

    private static final String DEFAULT_BANK_TOTALS = "AAAAAAAAAA";
    private static final String UPDATED_BANK_TOTALS = "BBBBBBBBBB";

    private static final String DEFAULT_REFERENCE_NUM = "AAAAAAAAAA";
    private static final String UPDATED_REFERENCE_NUM = "BBBBBBBBBB";

    private static final String DEFAULT_STATUS_MESSAGE = "AAAAAAAAAA";
    private static final String UPDATED_STATUS_MESSAGE = "BBBBBBBBBB";

    private static final String DEFAULT_RECUR_UPDATE_SUCCESS = "AAAAAAAAAA";
    private static final String UPDATED_RECUR_UPDATE_SUCCESS = "BBBBBBBBBB";

    private static final String DEFAULT_USER = "AAAAAAAAAA";
    private static final String UPDATED_USER = "BBBBBBBBBB";

    @Autowired
    private ReceiptRepository receiptRepository;

    @Autowired
    private ReceiptMapper receiptMapper;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    private MockMvc restReceiptMockMvc;

    private Receipt receipt;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        ReceiptResource receiptResource = new ReceiptResource(receiptRepository, receiptMapper);
        this.restReceiptMockMvc = MockMvcBuilders.standaloneSetup(receiptResource)
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
    public static Receipt createEntity(EntityManager em) {
        Receipt receipt = new Receipt()
            .createdDate(DEFAULT_CREATED_DATE)
            .updatedDate(DEFAULT_UPDATED_DATE)
            .message(DEFAULT_MESSAGE)
            .complete(DEFAULT_COMPLETE)
            .cardType(DEFAULT_CARD_TYPE)
            .txnNumber(DEFAULT_TXN_NUMBER)
            .receiptId(DEFAULT_RECEIPT_ID)
            .corporateCard(DEFAULT_CORPORATE_CARD)
            .recurSuccess(DEFAULT_RECUR_SUCCESS)
            .itdresponse(DEFAULT_ITDRESPONSE)
            .iso(DEFAULT_ISO)
            .isVisaDebit(DEFAULT_IS_VISA_DEBIT)
            .timedOut(DEFAULT_TIMED_OUT)
            .messageId(DEFAULT_MESSAGE_ID)
            .ticket(DEFAULT_TICKET)
            .transDate(DEFAULT_TRANS_DATE)
            .cavvResultCode(DEFAULT_CAVV_RESULT_CODE)
            .responseCode(DEFAULT_RESPONSE_CODE)
            .authCode(DEFAULT_AUTH_CODE)
            .statusCode(DEFAULT_STATUS_CODE)
            .transAmount(DEFAULT_TRANS_AMOUNT)
            .transType(DEFAULT_TRANS_TYPE)
            .nextRecurDate(DEFAULT_NEXT_RECUR_DATE)
            .avsResultCode(DEFAULT_AVS_RESULT_CODE)
            .recurEndDate(DEFAULT_RECUR_END_DATE)
            .transTime(DEFAULT_TRANS_TIME)
            .cvdResultCode(DEFAULT_CVD_RESULT_CODE)
            .bankTotals(DEFAULT_BANK_TOTALS)
            .referenceNum(DEFAULT_REFERENCE_NUM)
            .statusMessage(DEFAULT_STATUS_MESSAGE)
            .recurUpdateSuccess(DEFAULT_RECUR_UPDATE_SUCCESS)
            .user(DEFAULT_USER);
        return receipt;
    }

    @Before
    public void initTest() {
        receipt = createEntity(em);
    }

    @Test
    @Transactional
    public void createReceipt() throws Exception {
        int databaseSizeBeforeCreate = receiptRepository.findAll().size();

        // Create the Receipt
        ReceiptDTO receiptDTO = receiptMapper.toDto(receipt);
        restReceiptMockMvc.perform(post("/api/receipts")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(receiptDTO)))
            .andExpect(status().isCreated());

        // Validate the Receipt in the database
        List<Receipt> receiptList = receiptRepository.findAll();
        assertThat(receiptList).hasSize(databaseSizeBeforeCreate + 1);
        Receipt testReceipt = receiptList.get(receiptList.size() - 1);
        assertThat(testReceipt.getCreatedDate()).isEqualTo(DEFAULT_CREATED_DATE);
        assertThat(testReceipt.getUpdatedDate()).isEqualTo(DEFAULT_UPDATED_DATE);
        assertThat(testReceipt.getMessage()).isEqualTo(DEFAULT_MESSAGE);
        assertThat(testReceipt.getComplete()).isEqualTo(DEFAULT_COMPLETE);
        assertThat(testReceipt.getCardType()).isEqualTo(DEFAULT_CARD_TYPE);
        assertThat(testReceipt.getTxnNumber()).isEqualTo(DEFAULT_TXN_NUMBER);
        assertThat(testReceipt.getReceiptId()).isEqualTo(DEFAULT_RECEIPT_ID);
        assertThat(testReceipt.getCorporateCard()).isEqualTo(DEFAULT_CORPORATE_CARD);
        assertThat(testReceipt.getRecurSuccess()).isEqualTo(DEFAULT_RECUR_SUCCESS);
        assertThat(testReceipt.getItdresponse()).isEqualTo(DEFAULT_ITDRESPONSE);
        assertThat(testReceipt.getIso()).isEqualTo(DEFAULT_ISO);
        assertThat(testReceipt.getIsVisaDebit()).isEqualTo(DEFAULT_IS_VISA_DEBIT);
        assertThat(testReceipt.getTimedOut()).isEqualTo(DEFAULT_TIMED_OUT);
        assertThat(testReceipt.getMessageId()).isEqualTo(DEFAULT_MESSAGE_ID);
        assertThat(testReceipt.getTicket()).isEqualTo(DEFAULT_TICKET);
        assertThat(testReceipt.getTransDate()).isEqualTo(DEFAULT_TRANS_DATE);
        assertThat(testReceipt.getCavvResultCode()).isEqualTo(DEFAULT_CAVV_RESULT_CODE);
        assertThat(testReceipt.getResponseCode()).isEqualTo(DEFAULT_RESPONSE_CODE);
        assertThat(testReceipt.getAuthCode()).isEqualTo(DEFAULT_AUTH_CODE);
        assertThat(testReceipt.getStatusCode()).isEqualTo(DEFAULT_STATUS_CODE);
        assertThat(testReceipt.getTransAmount()).isEqualTo(DEFAULT_TRANS_AMOUNT);
        assertThat(testReceipt.getTransType()).isEqualTo(DEFAULT_TRANS_TYPE);
        assertThat(testReceipt.getNextRecurDate()).isEqualTo(DEFAULT_NEXT_RECUR_DATE);
        assertThat(testReceipt.getAvsResultCode()).isEqualTo(DEFAULT_AVS_RESULT_CODE);
        assertThat(testReceipt.getRecurEndDate()).isEqualTo(DEFAULT_RECUR_END_DATE);
        assertThat(testReceipt.getTransTime()).isEqualTo(DEFAULT_TRANS_TIME);
        assertThat(testReceipt.getCvdResultCode()).isEqualTo(DEFAULT_CVD_RESULT_CODE);
        assertThat(testReceipt.getBankTotals()).isEqualTo(DEFAULT_BANK_TOTALS);
        assertThat(testReceipt.getReferenceNum()).isEqualTo(DEFAULT_REFERENCE_NUM);
        assertThat(testReceipt.getStatusMessage()).isEqualTo(DEFAULT_STATUS_MESSAGE);
        assertThat(testReceipt.getRecurUpdateSuccess()).isEqualTo(DEFAULT_RECUR_UPDATE_SUCCESS);
        assertThat(testReceipt.getUser()).isEqualTo(DEFAULT_USER);
    }

    @Test
    @Transactional
    public void createReceiptWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = receiptRepository.findAll().size();

        // Create the Receipt with an existing ID
        receipt.setId(1L);
        ReceiptDTO receiptDTO = receiptMapper.toDto(receipt);

        // An entity with an existing ID cannot be created, so this API call must fail
        restReceiptMockMvc.perform(post("/api/receipts")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(receiptDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Alice in the database
        List<Receipt> receiptList = receiptRepository.findAll();
        assertThat(receiptList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    public void getAllReceipts() throws Exception {
        // Initialize the database
        receiptRepository.saveAndFlush(receipt);

        // Get all the receiptList
        restReceiptMockMvc.perform(get("/api/receipts?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(receipt.getId().intValue())))
            .andExpect(jsonPath("$.[*].createdDate").value(hasItem(DEFAULT_CREATED_DATE.toString())))
            .andExpect(jsonPath("$.[*].updatedDate").value(hasItem(DEFAULT_UPDATED_DATE.toString())))
            .andExpect(jsonPath("$.[*].message").value(hasItem(DEFAULT_MESSAGE.toString())))
            .andExpect(jsonPath("$.[*].complete").value(hasItem(DEFAULT_COMPLETE.toString())))
            .andExpect(jsonPath("$.[*].cardType").value(hasItem(DEFAULT_CARD_TYPE.toString())))
            .andExpect(jsonPath("$.[*].txnNumber").value(hasItem(DEFAULT_TXN_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].receiptId").value(hasItem(DEFAULT_RECEIPT_ID.toString())))
            .andExpect(jsonPath("$.[*].corporateCard").value(hasItem(DEFAULT_CORPORATE_CARD.toString())))
            .andExpect(jsonPath("$.[*].recurSuccess").value(hasItem(DEFAULT_RECUR_SUCCESS.toString())))
            .andExpect(jsonPath("$.[*].itdresponse").value(hasItem(DEFAULT_ITDRESPONSE.toString())))
            .andExpect(jsonPath("$.[*].iso").value(hasItem(DEFAULT_ISO.toString())))
            .andExpect(jsonPath("$.[*].isVisaDebit").value(hasItem(DEFAULT_IS_VISA_DEBIT.toString())))
            .andExpect(jsonPath("$.[*].timedOut").value(hasItem(DEFAULT_TIMED_OUT.toString())))
            .andExpect(jsonPath("$.[*].messageId").value(hasItem(DEFAULT_MESSAGE_ID.toString())))
            .andExpect(jsonPath("$.[*].ticket").value(hasItem(DEFAULT_TICKET.toString())))
            .andExpect(jsonPath("$.[*].transDate").value(hasItem(DEFAULT_TRANS_DATE.toString())))
            .andExpect(jsonPath("$.[*].cavvResultCode").value(hasItem(DEFAULT_CAVV_RESULT_CODE.toString())))
            .andExpect(jsonPath("$.[*].responseCode").value(hasItem(DEFAULT_RESPONSE_CODE.toString())))
            .andExpect(jsonPath("$.[*].authCode").value(hasItem(DEFAULT_AUTH_CODE.toString())))
            .andExpect(jsonPath("$.[*].statusCode").value(hasItem(DEFAULT_STATUS_CODE.toString())))
            .andExpect(jsonPath("$.[*].transAmount").value(hasItem(DEFAULT_TRANS_AMOUNT.toString())))
            .andExpect(jsonPath("$.[*].transType").value(hasItem(DEFAULT_TRANS_TYPE.toString())))
            .andExpect(jsonPath("$.[*].nextRecurDate").value(hasItem(DEFAULT_NEXT_RECUR_DATE.toString())))
            .andExpect(jsonPath("$.[*].avsResultCode").value(hasItem(DEFAULT_AVS_RESULT_CODE.toString())))
            .andExpect(jsonPath("$.[*].recurEndDate").value(hasItem(DEFAULT_RECUR_END_DATE.toString())))
            .andExpect(jsonPath("$.[*].transTime").value(hasItem(DEFAULT_TRANS_TIME.toString())))
            .andExpect(jsonPath("$.[*].cvdResultCode").value(hasItem(DEFAULT_CVD_RESULT_CODE.toString())))
            .andExpect(jsonPath("$.[*].bankTotals").value(hasItem(DEFAULT_BANK_TOTALS.toString())))
            .andExpect(jsonPath("$.[*].referenceNum").value(hasItem(DEFAULT_REFERENCE_NUM.toString())))
            .andExpect(jsonPath("$.[*].statusMessage").value(hasItem(DEFAULT_STATUS_MESSAGE.toString())))
            .andExpect(jsonPath("$.[*].recurUpdateSuccess").value(hasItem(DEFAULT_RECUR_UPDATE_SUCCESS.toString())))
            .andExpect(jsonPath("$.[*].user").value(hasItem(DEFAULT_USER.toString())));
    }

    @Test
    @Transactional
    public void getReceipt() throws Exception {
        // Initialize the database
        receiptRepository.saveAndFlush(receipt);

        // Get the receipt
        restReceiptMockMvc.perform(get("/api/receipts/{id}", receipt.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(receipt.getId().intValue()))
            .andExpect(jsonPath("$.createdDate").value(DEFAULT_CREATED_DATE.toString()))
            .andExpect(jsonPath("$.updatedDate").value(DEFAULT_UPDATED_DATE.toString()))
            .andExpect(jsonPath("$.message").value(DEFAULT_MESSAGE.toString()))
            .andExpect(jsonPath("$.complete").value(DEFAULT_COMPLETE.toString()))
            .andExpect(jsonPath("$.cardType").value(DEFAULT_CARD_TYPE.toString()))
            .andExpect(jsonPath("$.txnNumber").value(DEFAULT_TXN_NUMBER.toString()))
            .andExpect(jsonPath("$.receiptId").value(DEFAULT_RECEIPT_ID.toString()))
            .andExpect(jsonPath("$.corporateCard").value(DEFAULT_CORPORATE_CARD.toString()))
            .andExpect(jsonPath("$.recurSuccess").value(DEFAULT_RECUR_SUCCESS.toString()))
            .andExpect(jsonPath("$.itdresponse").value(DEFAULT_ITDRESPONSE.toString()))
            .andExpect(jsonPath("$.iso").value(DEFAULT_ISO.toString()))
            .andExpect(jsonPath("$.isVisaDebit").value(DEFAULT_IS_VISA_DEBIT.toString()))
            .andExpect(jsonPath("$.timedOut").value(DEFAULT_TIMED_OUT.toString()))
            .andExpect(jsonPath("$.messageId").value(DEFAULT_MESSAGE_ID.toString()))
            .andExpect(jsonPath("$.ticket").value(DEFAULT_TICKET.toString()))
            .andExpect(jsonPath("$.transDate").value(DEFAULT_TRANS_DATE.toString()))
            .andExpect(jsonPath("$.cavvResultCode").value(DEFAULT_CAVV_RESULT_CODE.toString()))
            .andExpect(jsonPath("$.responseCode").value(DEFAULT_RESPONSE_CODE.toString()))
            .andExpect(jsonPath("$.authCode").value(DEFAULT_AUTH_CODE.toString()))
            .andExpect(jsonPath("$.statusCode").value(DEFAULT_STATUS_CODE.toString()))
            .andExpect(jsonPath("$.transAmount").value(DEFAULT_TRANS_AMOUNT.toString()))
            .andExpect(jsonPath("$.transType").value(DEFAULT_TRANS_TYPE.toString()))
            .andExpect(jsonPath("$.nextRecurDate").value(DEFAULT_NEXT_RECUR_DATE.toString()))
            .andExpect(jsonPath("$.avsResultCode").value(DEFAULT_AVS_RESULT_CODE.toString()))
            .andExpect(jsonPath("$.recurEndDate").value(DEFAULT_RECUR_END_DATE.toString()))
            .andExpect(jsonPath("$.transTime").value(DEFAULT_TRANS_TIME.toString()))
            .andExpect(jsonPath("$.cvdResultCode").value(DEFAULT_CVD_RESULT_CODE.toString()))
            .andExpect(jsonPath("$.bankTotals").value(DEFAULT_BANK_TOTALS.toString()))
            .andExpect(jsonPath("$.referenceNum").value(DEFAULT_REFERENCE_NUM.toString()))
            .andExpect(jsonPath("$.statusMessage").value(DEFAULT_STATUS_MESSAGE.toString()))
            .andExpect(jsonPath("$.recurUpdateSuccess").value(DEFAULT_RECUR_UPDATE_SUCCESS.toString()))
            .andExpect(jsonPath("$.user").value(DEFAULT_USER.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingReceipt() throws Exception {
        // Get the receipt
        restReceiptMockMvc.perform(get("/api/receipts/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateReceipt() throws Exception {
        // Initialize the database
        receiptRepository.saveAndFlush(receipt);
        int databaseSizeBeforeUpdate = receiptRepository.findAll().size();

        // Update the receipt
        Receipt updatedReceipt = receiptRepository.findOne(receipt.getId());
        updatedReceipt
            .createdDate(UPDATED_CREATED_DATE)
            .updatedDate(UPDATED_UPDATED_DATE)
            .message(UPDATED_MESSAGE)
            .complete(UPDATED_COMPLETE)
            .cardType(UPDATED_CARD_TYPE)
            .txnNumber(UPDATED_TXN_NUMBER)
            .receiptId(UPDATED_RECEIPT_ID)
            .corporateCard(UPDATED_CORPORATE_CARD)
            .recurSuccess(UPDATED_RECUR_SUCCESS)
            .itdresponse(UPDATED_ITDRESPONSE)
            .iso(UPDATED_ISO)
            .isVisaDebit(UPDATED_IS_VISA_DEBIT)
            .timedOut(UPDATED_TIMED_OUT)
            .messageId(UPDATED_MESSAGE_ID)
            .ticket(UPDATED_TICKET)
            .transDate(UPDATED_TRANS_DATE)
            .cavvResultCode(UPDATED_CAVV_RESULT_CODE)
            .responseCode(UPDATED_RESPONSE_CODE)
            .authCode(UPDATED_AUTH_CODE)
            .statusCode(UPDATED_STATUS_CODE)
            .transAmount(UPDATED_TRANS_AMOUNT)
            .transType(UPDATED_TRANS_TYPE)
            .nextRecurDate(UPDATED_NEXT_RECUR_DATE)
            .avsResultCode(UPDATED_AVS_RESULT_CODE)
            .recurEndDate(UPDATED_RECUR_END_DATE)
            .transTime(UPDATED_TRANS_TIME)
            .cvdResultCode(UPDATED_CVD_RESULT_CODE)
            .bankTotals(UPDATED_BANK_TOTALS)
            .referenceNum(UPDATED_REFERENCE_NUM)
            .statusMessage(UPDATED_STATUS_MESSAGE)
            .recurUpdateSuccess(UPDATED_RECUR_UPDATE_SUCCESS)
            .user(UPDATED_USER);
        ReceiptDTO receiptDTO = receiptMapper.toDto(updatedReceipt);

        restReceiptMockMvc.perform(put("/api/receipts")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(receiptDTO)))
            .andExpect(status().isOk());

        // Validate the Receipt in the database
        List<Receipt> receiptList = receiptRepository.findAll();
        assertThat(receiptList).hasSize(databaseSizeBeforeUpdate);
        Receipt testReceipt = receiptList.get(receiptList.size() - 1);
        assertThat(testReceipt.getCreatedDate()).isEqualTo(UPDATED_CREATED_DATE);
        assertThat(testReceipt.getUpdatedDate()).isEqualTo(UPDATED_UPDATED_DATE);
        assertThat(testReceipt.getMessage()).isEqualTo(UPDATED_MESSAGE);
        assertThat(testReceipt.getComplete()).isEqualTo(UPDATED_COMPLETE);
        assertThat(testReceipt.getCardType()).isEqualTo(UPDATED_CARD_TYPE);
        assertThat(testReceipt.getTxnNumber()).isEqualTo(UPDATED_TXN_NUMBER);
        assertThat(testReceipt.getReceiptId()).isEqualTo(UPDATED_RECEIPT_ID);
        assertThat(testReceipt.getCorporateCard()).isEqualTo(UPDATED_CORPORATE_CARD);
        assertThat(testReceipt.getRecurSuccess()).isEqualTo(UPDATED_RECUR_SUCCESS);
        assertThat(testReceipt.getItdresponse()).isEqualTo(UPDATED_ITDRESPONSE);
        assertThat(testReceipt.getIso()).isEqualTo(UPDATED_ISO);
        assertThat(testReceipt.getIsVisaDebit()).isEqualTo(UPDATED_IS_VISA_DEBIT);
        assertThat(testReceipt.getTimedOut()).isEqualTo(UPDATED_TIMED_OUT);
        assertThat(testReceipt.getMessageId()).isEqualTo(UPDATED_MESSAGE_ID);
        assertThat(testReceipt.getTicket()).isEqualTo(UPDATED_TICKET);
        assertThat(testReceipt.getTransDate()).isEqualTo(UPDATED_TRANS_DATE);
        assertThat(testReceipt.getCavvResultCode()).isEqualTo(UPDATED_CAVV_RESULT_CODE);
        assertThat(testReceipt.getResponseCode()).isEqualTo(UPDATED_RESPONSE_CODE);
        assertThat(testReceipt.getAuthCode()).isEqualTo(UPDATED_AUTH_CODE);
        assertThat(testReceipt.getStatusCode()).isEqualTo(UPDATED_STATUS_CODE);
        assertThat(testReceipt.getTransAmount()).isEqualTo(UPDATED_TRANS_AMOUNT);
        assertThat(testReceipt.getTransType()).isEqualTo(UPDATED_TRANS_TYPE);
        assertThat(testReceipt.getNextRecurDate()).isEqualTo(UPDATED_NEXT_RECUR_DATE);
        assertThat(testReceipt.getAvsResultCode()).isEqualTo(UPDATED_AVS_RESULT_CODE);
        assertThat(testReceipt.getRecurEndDate()).isEqualTo(UPDATED_RECUR_END_DATE);
        assertThat(testReceipt.getTransTime()).isEqualTo(UPDATED_TRANS_TIME);
        assertThat(testReceipt.getCvdResultCode()).isEqualTo(UPDATED_CVD_RESULT_CODE);
        assertThat(testReceipt.getBankTotals()).isEqualTo(UPDATED_BANK_TOTALS);
        assertThat(testReceipt.getReferenceNum()).isEqualTo(UPDATED_REFERENCE_NUM);
        assertThat(testReceipt.getStatusMessage()).isEqualTo(UPDATED_STATUS_MESSAGE);
        assertThat(testReceipt.getRecurUpdateSuccess()).isEqualTo(UPDATED_RECUR_UPDATE_SUCCESS);
        assertThat(testReceipt.getUser()).isEqualTo(UPDATED_USER);
    }

    @Test
    @Transactional
    public void updateNonExistingReceipt() throws Exception {
        int databaseSizeBeforeUpdate = receiptRepository.findAll().size();

        // Create the Receipt
        ReceiptDTO receiptDTO = receiptMapper.toDto(receipt);

        // If the entity doesn't have an ID, it will be created instead of just being updated
        restReceiptMockMvc.perform(put("/api/receipts")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(receiptDTO)))
            .andExpect(status().isCreated());

        // Validate the Receipt in the database
        List<Receipt> receiptList = receiptRepository.findAll();
        assertThat(receiptList).hasSize(databaseSizeBeforeUpdate + 1);
    }

    @Test
    @Transactional
    public void deleteReceipt() throws Exception {
        // Initialize the database
        receiptRepository.saveAndFlush(receipt);
        int databaseSizeBeforeDelete = receiptRepository.findAll().size();

        // Get the receipt
        restReceiptMockMvc.perform(delete("/api/receipts/{id}", receipt.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<Receipt> receiptList = receiptRepository.findAll();
        assertThat(receiptList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Receipt.class);
        Receipt receipt1 = new Receipt();
        receipt1.setId(1L);
        Receipt receipt2 = new Receipt();
        receipt2.setId(receipt1.getId());
        assertThat(receipt1).isEqualTo(receipt2);
        receipt2.setId(2L);
        assertThat(receipt1).isNotEqualTo(receipt2);
        receipt1.setId(null);
        assertThat(receipt1).isNotEqualTo(receipt2);
    }

    @Test
    @Transactional
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(ReceiptDTO.class);
        ReceiptDTO receiptDTO1 = new ReceiptDTO();
        receiptDTO1.setId(1L);
        ReceiptDTO receiptDTO2 = new ReceiptDTO();
        assertThat(receiptDTO1).isNotEqualTo(receiptDTO2);
        receiptDTO2.setId(receiptDTO1.getId());
        assertThat(receiptDTO1).isEqualTo(receiptDTO2);
        receiptDTO2.setId(2L);
        assertThat(receiptDTO1).isNotEqualTo(receiptDTO2);
        receiptDTO1.setId(null);
        assertThat(receiptDTO1).isNotEqualTo(receiptDTO2);
    }

    @Test
    @Transactional
    public void testEntityFromId() {
        assertThat(receiptMapper.fromId(42L).getId()).isEqualTo(42);
        assertThat(receiptMapper.fromId(null)).isNull();
    }
}
