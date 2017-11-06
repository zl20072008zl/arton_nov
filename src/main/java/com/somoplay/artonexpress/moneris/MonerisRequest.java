package com.somoplay.artonexpress.moneris;

public class MonerisRequest {
    private String name;
    private String orderId;
    private String custId;
    private String amount;
    private String pan;
    private String expdate;
    private String cvd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public String getCvd() {
        return cvd;
    }

    public void setCvd(String cvd) {
        this.cvd = cvd;
    }
}
