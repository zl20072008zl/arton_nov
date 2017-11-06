package com.somoplay.artonexpress.shippment;

import java.util.Date;

/**
 * Created by lmy on 7/8/2017.
 */
public class CpRefundResponse {
    private String serviceTicketId;
    private Date serviceTicketDate;

    public String getServiceTicketId() {
        return serviceTicketId;
    }

    public void setServiceTicketId(String serviceTicketId) {
        this.serviceTicketId = serviceTicketId;
    }

    public Date getServiceTicketDate() {
        return serviceTicketDate;
    }

    public void setServiceTicketDate(Date serviceTicketDate) {
        this.serviceTicketDate = serviceTicketDate;
    }
}
