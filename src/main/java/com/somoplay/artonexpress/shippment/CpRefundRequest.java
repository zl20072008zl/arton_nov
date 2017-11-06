package com.somoplay.artonexpress.shippment;

/**
 * Created by lmy on 7/8/2017.
 */
public class CpRefundRequest {
    private String trackingNumber;
    private String userEmail;

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
