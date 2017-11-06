package com.somoplay.artonexpress.service.dto;


import java.time.LocalDate;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Lob;

/**
 * A DTO for the Label entity.
 */
public class LabelDTO implements Serializable {

    private Long id;

    private LocalDate createdDate;

    private LocalDate updatedDate;

    private String trackingNumber;

    @Lob
    private byte[] shippingLabel;
    private String shippingLabelContentType;

    private String link;

    private String shipmentId;

    private String shipmentStatus;

    private String user;

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

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public byte[] getShippingLabel() {
        return shippingLabel;
    }

    public void setShippingLabel(byte[] shippingLabel) {
        this.shippingLabel = shippingLabel;
    }

    public String getShippingLabelContentType() {
        return shippingLabelContentType;
    }

    public void setShippingLabelContentType(String shippingLabelContentType) {
        this.shippingLabelContentType = shippingLabelContentType;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        LabelDTO labelDTO = (LabelDTO) o;
        if(labelDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), labelDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "LabelDTO{" +
            "id=" + getId() +
            ", createdDate='" + getCreatedDate() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            ", trackingNumber='" + getTrackingNumber() + "'" +
            ", shippingLabel='" + getShippingLabel() + "'" +
            ", link='" + getLink() + "'" +
            ", shipmentId='" + getShipmentId() + "'" +
            ", shipmentStatus='" + getShipmentStatus() + "'" +
            ", user='" + getUser() + "'" +
            "}";
    }
}
