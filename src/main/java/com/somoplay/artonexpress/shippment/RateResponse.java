package com.somoplay.artonexpress.shippment;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by lmy on 7/8/2017.
 */
public class RateResponse {
    private String company;
    private String name;
    private String code;
    private BigDecimal price;
    private String expectedDeliveryDate;
    private String expectedTransitTime;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(String expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public String getExpectedTransitTime() {
        return expectedTransitTime;
    }

    public void setExpectedTransitTime(String expectedTransitTime) {
        this.expectedTransitTime = expectedTransitTime;
    }
}
