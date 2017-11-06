package com.somoplay.artonexpress.shippment;

/**
 * Created by lmy on 7/8/2017.
 */
public class CpTrackSummeryResponse {
    private String trackingNumber;
    private String mailedOnDate;
    private String eventDescription;
    private String actualDeliveryDate;
    private String attemptedDate;
    private String destinationPostal;
    private String destinationProvince;
    private String eventDateTime;
    private String eventLocation;
    private String eventType;
    private String expectedDeliveryDate;
    private String originPostal;
    private String serviceName;
    private String signatoryName;

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getMailedOnDate() {
        return mailedOnDate;
    }

    public void setMailedOnDate(String mailedOnDate) {
        this.mailedOnDate = mailedOnDate;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    public void setActualDeliveryDate(String actualDeliveryDate) {
        this.actualDeliveryDate = actualDeliveryDate;
    }

    public String getAttemptedDate() {
        return attemptedDate;
    }

    public void setAttemptedDate(String attemptedDate) {
        this.attemptedDate = attemptedDate;
    }

    public String getDestinationPostal() {
        return destinationPostal;
    }

    public void setDestinationPostal(String destinationPostal) {
        this.destinationPostal = destinationPostal;
    }

    public String getDestinationProvince() {
        return destinationProvince;
    }

    public void setDestinationProvince(String destinationProvince) {
        this.destinationProvince = destinationProvince;
    }

    public String getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(String eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(String expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public String getOriginPostal() {
        return originPostal;
    }

    public void setOriginPostal(String originPostal) {
        this.originPostal = originPostal;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getSignatoryName() {
        return signatoryName;
    }

    public void setSignatoryName(String signatoryName) {
        this.signatoryName = signatoryName;
    }
}
