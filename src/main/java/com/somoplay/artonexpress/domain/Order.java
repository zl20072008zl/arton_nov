package com.somoplay.artonexpress.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A Order.
 */
@Entity
@Table(name = "jhi_order")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "updated_date")
    private LocalDate updatedDate;

    @Column(name = "total_charges", precision=10, scale=2)
    private BigDecimal totalCharges;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "tracking_number")
    private String trackingNumber;

    @Column(name = "shipper_id")
    private Integer shipperId;

    @Column(name = "recipient_id")
    private Integer recipientId;

    @Column(name = "item_id")
    private Integer itemId;

    @Column(name = "service_id")
    private Integer serviceId;

    @Column(name = "promotion_id")
    private Integer promotionId;

    @Column(name = "jhi_user")
    private String user;

    @Column(name = "receipt_id")
    private Integer receiptId;

    @Column(name = "label_id")
    private Integer labelId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public Order createdDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public Order updatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
        return this;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    public BigDecimal getTotalCharges() {
        return totalCharges;
    }

    public Order totalCharges(BigDecimal totalCharges) {
        this.totalCharges = totalCharges;
        return this;
    }

    public void setTotalCharges(BigDecimal totalCharges) {
        this.totalCharges = totalCharges;
    }

    public String getOrderId() {
        return orderId;
    }

    public Order orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public Order trackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Integer getShipperId() {
        return shipperId;
    }

    public Order shipperId(Integer shipperId) {
        this.shipperId = shipperId;
        return this;
    }

    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }

    public Integer getRecipientId() {
        return recipientId;
    }

    public Order recipientId(Integer recipientId) {
        this.recipientId = recipientId;
        return this;
    }

    public void setRecipientId(Integer recipientId) {
        this.recipientId = recipientId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public Order itemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public Order serviceId(Integer serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getPromotionId() {
        return promotionId;
    }

    public Order promotionId(Integer promotionId) {
        this.promotionId = promotionId;
        return this;
    }

    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public String getUser() {
        return user;
    }

    public Order user(String user) {
        this.user = user;
        return this;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getReceiptId() {
        return receiptId;
    }

    public Order receiptId(Integer receiptId) {
        this.receiptId = receiptId;
        return this;
    }

    public void setReceiptId(Integer receiptId) {
        this.receiptId = receiptId;
    }

    public Integer getLabelId() {
        return labelId;
    }

    public Order labelId(Integer labelId) {
        this.labelId = labelId;
        return this;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        if (order.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), order.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Order{" +
            "id=" + getId() +
            ", createdDate='" + getCreatedDate() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            ", totalCharges='" + getTotalCharges() + "'" +
            ", orderId='" + getOrderId() + "'" +
            ", trackingNumber='" + getTrackingNumber() + "'" +
            ", shipperId='" + getShipperId() + "'" +
            ", recipientId='" + getRecipientId() + "'" +
            ", itemId='" + getItemId() + "'" +
            ", serviceId='" + getServiceId() + "'" +
            ", promotionId='" + getPromotionId() + "'" +
            ", user='" + getUser() + "'" +
            ", receiptId='" + getReceiptId() + "'" +
            ", labelId='" + getLabelId() + "'" +
            "}";
    }
}
