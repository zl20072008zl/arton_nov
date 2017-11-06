package com.somoplay.artonexpress.canadapost;

import ca.canadapost.cpcdp.shipping.generated.messages.Messages;
import com.sun.jersey.api.client.ClientResponse;

import javax.xml.bind.JAXBContext;
import java.io.InputStream;
import java.util.Iterator;

/**
 * Created by lmy on 7/8/2017.
 */
public class CpVoid {
    private CpService cpService = new CpService();
    private String status;

    public void cp_void (String trackingNumber) {
        ClientResponse resp = cpService.voidShipment(trackingNumber);
        InputStream respIS = resp.getEntityInputStream();

        try {
            if ( resp.getStatus() == 204 ) {
                // If server returns HTTP status code 204 then delete is successful.
                this.status = "Shipment successfully deleted.";
            } else {
                // Example of using JAXB to parse xml error response
                JAXBContext jc;
                jc = JAXBContext.newInstance(Messages.class);
                Object entity = jc.createUnmarshaller().unmarshal(respIS);
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

    public String getStatus() {
        return status;
    }
}
