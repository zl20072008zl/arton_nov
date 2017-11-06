package com.somoplay.artonexpress.canadapost;

import ca.canadapost.cpcdp.tracking.generated.messages.Messages;
import ca.canadapost.cpcdp.tracking.generated.track.PinSummary;
import ca.canadapost.cpcdp.tracking.generated.track.TrackingSummary;
import com.somoplay.artonexpress.shippment.CpTrackSummeryResponse;
import com.sun.jersey.api.client.ClientResponse;

import javax.xml.bind.JAXBContext;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lmy on 7/8/2017.
 */
public class CpTrackSummery {
    private CpService cpService = new CpService();
    private List<CpTrackSummeryResponse> track_summeries = new ArrayList<>();

    public void track_summery (String trackingNumber) {
        ClientResponse resp = cpService.getTrackingSummary(trackingNumber);
        InputStream respIS = resp.getEntityInputStream();

        // Example of using JAXB to parse xml response
        JAXBContext jc;
        try {
            jc = JAXBContext.newInstance(TrackingSummary.class, Messages.class);
            Object entity = jc.createUnmarshaller().unmarshal(respIS);
            // Determine whether response data matches TrackingSummary schema.
            if (entity instanceof TrackingSummary) {
                TrackingSummary trackingSummary = (TrackingSummary) entity;
                for (Iterator<PinSummary> iter = trackingSummary.getPinSummaries().iterator(); iter.hasNext();) {
                    PinSummary pinSummary = (PinSummary) iter.next();
                    CpTrackSummeryResponse cpTrackSummeryResponse = new CpTrackSummeryResponse();
                    cpTrackSummeryResponse.setTrackingNumber(pinSummary.getPin());
                    cpTrackSummeryResponse.setMailedOnDate(pinSummary.getMailedOnDate());
                    cpTrackSummeryResponse.setEventDescription(pinSummary.getEventDescription());
                    cpTrackSummeryResponse.setActualDeliveryDate(pinSummary.getActualDeliveryDate());
                    cpTrackSummeryResponse.setAttemptedDate(pinSummary.getAttemptedDate());
                    cpTrackSummeryResponse.setDestinationPostal(pinSummary.getDestinationPostalId());
                    cpTrackSummeryResponse.setDestinationProvince(pinSummary.getDestinationProvince());
                    cpTrackSummeryResponse.setEventDateTime(pinSummary.getEventDateTime());
                    cpTrackSummeryResponse.setEventLocation(pinSummary.getEventLocation());
                    cpTrackSummeryResponse.setEventType(pinSummary.getEventType());
                    cpTrackSummeryResponse.setExpectedDeliveryDate(pinSummary.getExpectedDeliveryDate());
                    cpTrackSummeryResponse.setOriginPostal(pinSummary.getOriginPostalId());
                    cpTrackSummeryResponse.setServiceName(pinSummary.getServiceName());
                    cpTrackSummeryResponse.setSignatoryName(pinSummary.getSignatoryName());

                    track_summeries.add(cpTrackSummeryResponse);
                }
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

    public List<CpTrackSummeryResponse> getTrack_summeries() {
        return track_summeries;
    }
}
