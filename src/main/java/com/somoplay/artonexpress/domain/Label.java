package com.somoplay.artonexpress.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A Label.
 */
@Entity
@Table(name = "label")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Label implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "updated_date")
    private LocalDate updatedDate;

    @Column(name = "tracking_number")
    private String trackingNumber;

    @Lob
    @Column(name = "shipping_label")
    private byte[] shippingLabel;

    @Column(name = "shipping_label_content_type")
    private String shippingLabelContentType;

    @Column(name = "jhi_link")
    private String link;

    @Column(name = "shipment_id")
    private String shipmentId;

    @Column(name = "shipment_status")
    private String shipmentStatus;

    @Column(name = "jhi_user")
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

    public Label createdDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public Label updatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
        return this;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public Label trackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public byte[] getShippingLabel() {
        return shippingLabel;
    }

    public Label shippingLabel(byte[] shippingLabel) {
        this.shippingLabel = shippingLabel;
        return this;
    }

    public void setShippingLabel(byte[] shippingLabel) {
        this.shippingLabel = shippingLabel;
    }

    public String getShippingLabelContentType() {
        return shippingLabelContentType;
    }

    public Label shippingLabelContentType(String shippingLabelContentType) {
        this.shippingLabelContentType = shippingLabelContentType;
        return this;
    }

    public void setShippingLabelContentType(String shippingLabelContentType) {
        this.shippingLabelContentType = shippingLabelContentType;
    }

    public String getLink() {
        return link;
    }

    public Label link(String link) {
        this.link = link;
        return this;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public Label shipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getShipmentStatus() {
        return shipmentStatus;
    }

    public Label shipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
        return this;
    }

    public void setShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    public String getUser() {
        return user;
    }

    public Label user(String user) {
        this.user = user;
        return this;
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
        Label label = (Label) o;
        if (label.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), label.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Label{" +
            "id=" + getId() +
            ", createdDate='" + getCreatedDate() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            ", trackingNumber='" + getTrackingNumber() + "'" +
            ", shippingLabel='" + getShippingLabel() + "'" +
            ", shippingLabelContentType='" + shippingLabelContentType + "'" +
            ", link='" + getLink() + "'" +
            ", shipmentId='" + getShipmentId() + "'" +
            ", shipmentStatus='" + getShipmentStatus() + "'" +
            ", user='" + getUser() + "'" +
            "}";
    }
}
