package com.somoplay.artonexpress.web.rest;

import com.somoplay.artonexpress.ArtonexpressApp;

import com.somoplay.artonexpress.domain.Order;
import com.somoplay.artonexpress.repository.OrderRepository;
import com.somoplay.artonexpress.service.dto.OrderDTO;
import com.somoplay.artonexpress.service.mapper.OrderMapper;
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
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the OrderResource REST controller.
 *
 * @see OrderResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArtonexpressApp.class)
public class OrderResourceIntTest {

    private static final LocalDate DEFAULT_CREATED_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_CREATED_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_UPDATED_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_UPDATED_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final BigDecimal DEFAULT_TOTAL_CHARGES = new BigDecimal(1);
    private static final BigDecimal UPDATED_TOTAL_CHARGES = new BigDecimal(2);

    private static final String DEFAULT_ORDER_ID = "AAAAAAAAAA";
    private static final String UPDATED_ORDER_ID = "BBBBBBBBBB";

    private static final String DEFAULT_TRACKING_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_TRACKING_NUMBER = "BBBBBBBBBB";

    private static final Integer DEFAULT_SHIPPER_ID = 1;
    private static final Integer UPDATED_SHIPPER_ID = 2;

    private static final Integer DEFAULT_RECIPIENT_ID = 1;
    private static final Integer UPDATED_RECIPIENT_ID = 2;

    private static final Integer DEFAULT_ITEM_ID = 1;
    private static final Integer UPDATED_ITEM_ID = 2;

    private static final Integer DEFAULT_SERVICE_ID = 1;
    private static final Integer UPDATED_SERVICE_ID = 2;

    private static final Integer DEFAULT_PROMOTION_ID = 1;
    private static final Integer UPDATED_PROMOTION_ID = 2;

    private static final String DEFAULT_USER = "AAAAAAAAAA";
    private static final String UPDATED_USER = "BBBBBBBBBB";

    private static final Integer DEFAULT_RECEIPT_ID = 1;
    private static final Integer UPDATED_RECEIPT_ID = 2;

    private static final Integer DEFAULT_LABEL_ID = 1;
    private static final Integer UPDATED_LABEL_ID = 2;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    private MockMvc restOrderMockMvc;

    private Order order;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        OrderResource orderResource = new OrderResource(orderRepository, orderMapper);
        this.restOrderMockMvc = MockMvcBuilders.standaloneSetup(orderResource)
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
    public static Order createEntity(EntityManager em) {
        Order order = new Order()
            .createdDate(DEFAULT_CREATED_DATE)
            .updatedDate(DEFAULT_UPDATED_DATE)
            .totalCharges(DEFAULT_TOTAL_CHARGES)
            .orderId(DEFAULT_ORDER_ID)
            .trackingNumber(DEFAULT_TRACKING_NUMBER)
            .shipperId(DEFAULT_SHIPPER_ID)
            .recipientId(DEFAULT_RECIPIENT_ID)
            .itemId(DEFAULT_ITEM_ID)
            .serviceId(DEFAULT_SERVICE_ID)
            .promotionId(DEFAULT_PROMOTION_ID)
            .user(DEFAULT_USER)
            .receiptId(DEFAULT_RECEIPT_ID)
            .labelId(DEFAULT_LABEL_ID);
        return order;
    }

    @Before
    public void initTest() {
        order = createEntity(em);
    }

    @Test
    @Transactional
    public void createOrder() throws Exception {
        int databaseSizeBeforeCreate = orderRepository.findAll().size();

        // Create the Order
        OrderDTO orderDTO = orderMapper.toDto(order);
        restOrderMockMvc.perform(post("/api/orders")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(orderDTO)))
            .andExpect(status().isCreated());

        // Validate the Order in the database
        List<Order> orderList = orderRepository.findAll();
        assertThat(orderList).hasSize(databaseSizeBeforeCreate + 1);
        Order testOrder = orderList.get(orderList.size() - 1);
        assertThat(testOrder.getCreatedDate()).isEqualTo(DEFAULT_CREATED_DATE);
        assertThat(testOrder.getUpdatedDate()).isEqualTo(DEFAULT_UPDATED_DATE);
        assertThat(testOrder.getTotalCharges()).isEqualTo(DEFAULT_TOTAL_CHARGES);
        assertThat(testOrder.getOrderId()).isEqualTo(DEFAULT_ORDER_ID);
        assertThat(testOrder.getTrackingNumber()).isEqualTo(DEFAULT_TRACKING_NUMBER);
        assertThat(testOrder.getShipperId()).isEqualTo(DEFAULT_SHIPPER_ID);
        assertThat(testOrder.getRecipientId()).isEqualTo(DEFAULT_RECIPIENT_ID);
        assertThat(testOrder.getItemId()).isEqualTo(DEFAULT_ITEM_ID);
        assertThat(testOrder.getServiceId()).isEqualTo(DEFAULT_SERVICE_ID);
        assertThat(testOrder.getPromotionId()).isEqualTo(DEFAULT_PROMOTION_ID);
        assertThat(testOrder.getUser()).isEqualTo(DEFAULT_USER);
        assertThat(testOrder.getReceiptId()).isEqualTo(DEFAULT_RECEIPT_ID);
        assertThat(testOrder.getLabelId()).isEqualTo(DEFAULT_LABEL_ID);
    }

    @Test
    @Transactional
    public void createOrderWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = orderRepository.findAll().size();

        // Create the Order with an existing ID
        order.setId(1L);
        OrderDTO orderDTO = orderMapper.toDto(order);

        // An entity with an existing ID cannot be created, so this API call must fail
        restOrderMockMvc.perform(post("/api/orders")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(orderDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Alice in the database
        List<Order> orderList = orderRepository.findAll();
        assertThat(orderList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    public void getAllOrders() throws Exception {
        // Initialize the database
        orderRepository.saveAndFlush(order);

        // Get all the orderList
        restOrderMockMvc.perform(get("/api/orders?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(order.getId().intValue())))
            .andExpect(jsonPath("$.[*].createdDate").value(hasItem(DEFAULT_CREATED_DATE.toString())))
            .andExpect(jsonPath("$.[*].updatedDate").value(hasItem(DEFAULT_UPDATED_DATE.toString())))
            .andExpect(jsonPath("$.[*].totalCharges").value(hasItem(DEFAULT_TOTAL_CHARGES.intValue())))
            .andExpect(jsonPath("$.[*].orderId").value(hasItem(DEFAULT_ORDER_ID.toString())))
            .andExpect(jsonPath("$.[*].trackingNumber").value(hasItem(DEFAULT_TRACKING_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].shipperId").value(hasItem(DEFAULT_SHIPPER_ID)))
            .andExpect(jsonPath("$.[*].recipientId").value(hasItem(DEFAULT_RECIPIENT_ID)))
            .andExpect(jsonPath("$.[*].itemId").value(hasItem(DEFAULT_ITEM_ID)))
            .andExpect(jsonPath("$.[*].serviceId").value(hasItem(DEFAULT_SERVICE_ID)))
            .andExpect(jsonPath("$.[*].promotionId").value(hasItem(DEFAULT_PROMOTION_ID)))
            .andExpect(jsonPath("$.[*].user").value(hasItem(DEFAULT_USER.toString())))
            .andExpect(jsonPath("$.[*].receiptId").value(hasItem(DEFAULT_RECEIPT_ID)))
            .andExpect(jsonPath("$.[*].labelId").value(hasItem(DEFAULT_LABEL_ID)));
    }

    @Test
    @Transactional
    public void getOrder() throws Exception {
        // Initialize the database
        orderRepository.saveAndFlush(order);

        // Get the order
        restOrderMockMvc.perform(get("/api/orders/{id}", order.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(order.getId().intValue()))
            .andExpect(jsonPath("$.createdDate").value(DEFAULT_CREATED_DATE.toString()))
            .andExpect(jsonPath("$.updatedDate").value(DEFAULT_UPDATED_DATE.toString()))
            .andExpect(jsonPath("$.totalCharges").value(DEFAULT_TOTAL_CHARGES.intValue()))
            .andExpect(jsonPath("$.orderId").value(DEFAULT_ORDER_ID.toString()))
            .andExpect(jsonPath("$.trackingNumber").value(DEFAULT_TRACKING_NUMBER.toString()))
            .andExpect(jsonPath("$.shipperId").value(DEFAULT_SHIPPER_ID))
            .andExpect(jsonPath("$.recipientId").value(DEFAULT_RECIPIENT_ID))
            .andExpect(jsonPath("$.itemId").value(DEFAULT_ITEM_ID))
            .andExpect(jsonPath("$.serviceId").value(DEFAULT_SERVICE_ID))
            .andExpect(jsonPath("$.promotionId").value(DEFAULT_PROMOTION_ID))
            .andExpect(jsonPath("$.user").value(DEFAULT_USER.toString()))
            .andExpect(jsonPath("$.receiptId").value(DEFAULT_RECEIPT_ID))
            .andExpect(jsonPath("$.labelId").value(DEFAULT_LABEL_ID));
    }

    @Test
    @Transactional
    public void getNonExistingOrder() throws Exception {
        // Get the order
        restOrderMockMvc.perform(get("/api/orders/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateOrder() throws Exception {
        // Initialize the database
        orderRepository.saveAndFlush(order);
        int databaseSizeBeforeUpdate = orderRepository.findAll().size();

        // Update the order
        Order updatedOrder = orderRepository.findOne(order.getId());
        updatedOrder
            .createdDate(UPDATED_CREATED_DATE)
            .updatedDate(UPDATED_UPDATED_DATE)
            .totalCharges(UPDATED_TOTAL_CHARGES)
            .orderId(UPDATED_ORDER_ID)
            .trackingNumber(UPDATED_TRACKING_NUMBER)
            .shipperId(UPDATED_SHIPPER_ID)
            .recipientId(UPDATED_RECIPIENT_ID)
            .itemId(UPDATED_ITEM_ID)
            .serviceId(UPDATED_SERVICE_ID)
            .promotionId(UPDATED_PROMOTION_ID)
            .user(UPDATED_USER)
            .receiptId(UPDATED_RECEIPT_ID)
            .labelId(UPDATED_LABEL_ID);
        OrderDTO orderDTO = orderMapper.toDto(updatedOrder);

        restOrderMockMvc.perform(put("/api/orders")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(orderDTO)))
            .andExpect(status().isOk());

        // Validate the Order in the database
        List<Order> orderList = orderRepository.findAll();
        assertThat(orderList).hasSize(databaseSizeBeforeUpdate);
        Order testOrder = orderList.get(orderList.size() - 1);
        assertThat(testOrder.getCreatedDate()).isEqualTo(UPDATED_CREATED_DATE);
        assertThat(testOrder.getUpdatedDate()).isEqualTo(UPDATED_UPDATED_DATE);
        assertThat(testOrder.getTotalCharges()).isEqualTo(UPDATED_TOTAL_CHARGES);
        assertThat(testOrder.getOrderId()).isEqualTo(UPDATED_ORDER_ID);
        assertThat(testOrder.getTrackingNumber()).isEqualTo(UPDATED_TRACKING_NUMBER);
        assertThat(testOrder.getShipperId()).isEqualTo(UPDATED_SHIPPER_ID);
        assertThat(testOrder.getRecipientId()).isEqualTo(UPDATED_RECIPIENT_ID);
        assertThat(testOrder.getItemId()).isEqualTo(UPDATED_ITEM_ID);
        assertThat(testOrder.getServiceId()).isEqualTo(UPDATED_SERVICE_ID);
        assertThat(testOrder.getPromotionId()).isEqualTo(UPDATED_PROMOTION_ID);
        assertThat(testOrder.getUser()).isEqualTo(UPDATED_USER);
        assertThat(testOrder.getReceiptId()).isEqualTo(UPDATED_RECEIPT_ID);
        assertThat(testOrder.getLabelId()).isEqualTo(UPDATED_LABEL_ID);
    }

    @Test
    @Transactional
    public void updateNonExistingOrder() throws Exception {
        int databaseSizeBeforeUpdate = orderRepository.findAll().size();

        // Create the Order
        OrderDTO orderDTO = orderMapper.toDto(order);

        // If the entity doesn't have an ID, it will be created instead of just being updated
        restOrderMockMvc.perform(put("/api/orders")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(orderDTO)))
            .andExpect(status().isCreated());

        // Validate the Order in the database
        List<Order> orderList = orderRepository.findAll();
        assertThat(orderList).hasSize(databaseSizeBeforeUpdate + 1);
    }

    @Test
    @Transactional
    public void deleteOrder() throws Exception {
        // Initialize the database
        orderRepository.saveAndFlush(order);
        int databaseSizeBeforeDelete = orderRepository.findAll().size();

        // Get the order
        restOrderMockMvc.perform(delete("/api/orders/{id}", order.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<Order> orderList = orderRepository.findAll();
        assertThat(orderList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Order.class);
        Order order1 = new Order();
        order1.setId(1L);
        Order order2 = new Order();
        order2.setId(order1.getId());
        assertThat(order1).isEqualTo(order2);
        order2.setId(2L);
        assertThat(order1).isNotEqualTo(order2);
        order1.setId(null);
        assertThat(order1).isNotEqualTo(order2);
    }

    @Test
    @Transactional
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(OrderDTO.class);
        OrderDTO orderDTO1 = new OrderDTO();
        orderDTO1.setId(1L);
        OrderDTO orderDTO2 = new OrderDTO();
        assertThat(orderDTO1).isNotEqualTo(orderDTO2);
        orderDTO2.setId(orderDTO1.getId());
        assertThat(orderDTO1).isEqualTo(orderDTO2);
        orderDTO2.setId(2L);
        assertThat(orderDTO1).isNotEqualTo(orderDTO2);
        orderDTO1.setId(null);
        assertThat(orderDTO1).isNotEqualTo(orderDTO2);
    }

    @Test
    @Transactional
    public void testEntityFromId() {
        assertThat(orderMapper.fromId(42L).getId()).isEqualTo(42);
        assertThat(orderMapper.fromId(null)).isNull();
    }
}
