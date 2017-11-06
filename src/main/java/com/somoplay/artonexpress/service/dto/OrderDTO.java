package com.somoplay.artonexpress.service.dto;


import java.time.LocalDate;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * A DTO for the Order entity.
 */
public class OrderDTO implements Serializable {

    private Long id;

    private LocalDate createdDate;

    private LocalDate updatedDate;

    private BigDecimal totalCharges;

    private String orderId;

    private String trackingNumber;

    private Integer shipperId;

    private Integer recipientId;

    private Integer itemId;

    private Integer serviceId;

    private Integer promotionId;

    private String user;

    private Integer receiptId;

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

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    public BigDecimal getTotalCharges() {
        return totalCharges;
    }

    public void setTotalCharges(BigDecimal totalCharges) {
        this.totalCharges = totalCharges;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Integer getShipperId() {
        return shipperId;
    }

    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }

    public Integer getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Integer recipientId) {
        this.recipientId = recipientId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Integer receiptId) {
        this.receiptId = receiptId;
    }

    public Integer getLabelId() {
        return labelId;
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

        OrderDTO orderDTO = (OrderDTO) o;
        if(orderDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), orderDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
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
