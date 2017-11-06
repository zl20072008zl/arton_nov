package com.somoplay.artonexpress.canadapost;

import ca.canadapost.cpcdp.shipping.generated.messages.Messages;
import ca.canadapost.cpcdp.shipping.generated.shipment.ShipmentRefundRequest;
import ca.canadapost.cpcdp.shipping.generated.shipment.ShipmentRefundRequestInfo;
import com.somoplay.artonexpress.shippment.CpRefundRequest;
import com.somoplay.artonexpress.shippment.CpRefundResponse;
import com.sun.jersey.api.client.ClientResponse;

import javax.xml.bind.JAXBContext;
import java.io.InputStream;
import java.util.Iterator;

/**
 * Created by lmy on 7/8/2017.
 */
public class CpContractRefund {
    private CpService cpService = new CpService();
    private CpRefundResponse cpRefundResponse = new CpRefundResponse();

    public void contract_refund (CpRefundRequest cpRefundRequest) {
        // Create XML Request Object
        ShipmentRefundRequest shipmentRefundRequest = new ShipmentRefundRequest();
        shipmentRefundRequest.setEmail(cpRefundRequest.getUserEmail());

        ClientResponse resp = cpService.createShipmentRefundRequest(shipmentRefundRequest, cpRefundRequest.getTrackingNumber());
        InputStream respIS = resp.getEntityInputStream();

        // Example of using JAXB to parse xml response
        JAXBContext jc;
        try {
            jc = JAXBContext.newInstance(ShipmentRefundRequestInfo.class, Messages.class);
            Object entity = jc.createUnmarshaller().unmarshal(respIS);
            // Determine whether response data matches CreateShipmentInfo schema.
            if (entity instanceof ShipmentRefundRequestInfo) {
                ShipmentRefundRequestInfo shipmentRefundRequestInfo = (ShipmentRefundRequestInfo) entity;
                cpRefundResponse.setServiceTicketId(shipmentRefundRequestInfo.getServiceTicketId());
                cpRefundResponse.setServiceTicketDate(shipmentRefundRequestInfo.getServiceTicketDate().toGregorianCalendar().getTime());
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
