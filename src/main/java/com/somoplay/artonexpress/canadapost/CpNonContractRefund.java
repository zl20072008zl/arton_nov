package com.somoplay.artonexpress.canadapost;

import ca.canadapost.cpcdp.ncshipping.generated.messages.Messages;
import ca.canadapost.cpcdp.ncshipping.generated.ncshipment.NonContractShipmentRefundRequest;
import ca.canadapost.cpcdp.ncshipping.generated.ncshipment.NonContractShipmentRefundRequestInfo;
import com.somoplay.artonexpress.shippment.CpRefundRequest;
import com.somoplay.artonexpress.shippment.CpRefundResponse;
import com.sun.jersey.api.client.ClientResponse;

import javax.xml.bind.JAXBContext;
import java.io.InputStream;
import java.util.Iterator;

/**
 * Created by lmy on 7/8/2017.
 */
public class CpNonContractRefund {
    private CpService cpService = new CpService();
    private CpRefundResponse cpRefundResponse = new CpRefundResponse();

    public void non_contract_refund (CpRefundRequest cpRefundRequest) {
        NonContractShipmentRefundRequest shipmentRefundRequest = new NonContractShipmentRefundRequest();
        shipmentRefundRequest.setEmail(cpRefundRequest.getUserEmail());

        ClientResponse resp = cpService.createNCShipmentRefundRequest(shipmentRefundRequest, cpRefundRequest.getTrackingNumber());
        InputStream respIS = resp.getEntityInputStream();

        // Example of using JAXB to parse xml response
        JAXBContext jc;
        try {
            jc = JAXBContext.newInstance(NonContractShipmentRefundRequestInfo.class, Messages.class);
            Object entity = jc.createUnmarshaller().unmarshal(respIS);
            // Determine whether response data matches CreateShipmentInfo schema.
            if (entity instanceof NonContractShipmentRefundRequestInfo) {
                NonContractShipmentRefundRequestInfo ncShipmentRefundRequestInfo = (NonContractShipmentRefundRequestInfo) entity;
                this.cpRefundResponse.setServiceTicketId(ncShipmentRefundRequestInfo.getServiceTicketId());
                this.cpRefundResponse.setServiceTicketDate(ncShipmentRefundRequestInfo.getServiceTicketDate().toGregorianCalendar().getTime());
            } else {
                // Assume Error Schema
                Messages messageData = (Messages) entity;
                for (Iterator<Messages.Message> iter = messageData.getMessage().iterator(); iter.hasNext();) {
                    Messages.Message aMessage = (Messages.Message) iter.next();
                    System.out.println("Error Code: " + aMessage.getCode());
                    System.out.println("Error Msg: " + aMessage.getDescription());
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        cpService.close();
    }

    public CpRefundResponse getCpRefundResponse() {
        return cpRefundResponse;
    }
}
