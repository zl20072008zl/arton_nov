package com.somoplay.artonexpress.shippment;

/**
 * Created by lmy on 7/8/2017.
 */
public class ShipmentResponse {
    private String shipmentId;
    private String shipmentStatus;
    private String trackingNumber;
    private String labelLink;

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

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getLabelLink() {
        return labelLink;
    }

    public void setLabelLink(String labelLink) {
        this.labelLink = labelLink;
    }
}
