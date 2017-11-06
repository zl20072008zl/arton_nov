package com.somoplay.artonexpress.canadapost;

import ca.canadapost.cpcdp.tracking.generated.messages.Messages;
import ca.canadapost.cpcdp.tracking.generated.track.TrackingDetail;
import com.somoplay.artonexpress.shippment.CpTrackDetailResponse;
import com.sun.jersey.api.client.ClientResponse;

import javax.xml.bind.JAXBContext;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lmy on 7/8/2017.
 */
public class CpTrackDetail {
    private CpService cpService = new CpService();
    private List<CpTrackDetailResponse> track_details = new ArrayList<>();

    public void track_detail (String trackingNumber) {
        ClientResponse resp = cpService.getTrackingDetails(trackingNumber);
        InputStream respIS = resp.getEntityInputStream();

        // Example of using JAXB to parse xml response
        JAXBContext jc;
        try {
            jc = JAXBContext.newInstance(TrackingDetail.class, Messages.class);
            Object entity = jc.createUnmarshaller().unmarshal(respIS);
            // Determine whether response data matches TrackingDetails schema.
            if (entity instanceof TrackingDetail) {
                TrackingDetail trackingDetail = (TrackingDetail) entity;
               for (int i = 0; i < trackingDetail.getSignificantEvents().getOccurrences().size(); i++) {
                   CpTrackDetailResponse cpTrackDetailResponse = new CpTrackDetailResponse();
                   cpTrackDetailResponse.setCity(trackingDetail.getSignificantEvents().getOccurrences().get(i).getEventSite());
                   cpTrackDetailResponse.setProvince(trackingDetail.getSignificantEvents().getOccurrences().get(i).getEventProvince());
                   cpTrackDetailResponse.setDate(trackingDetail.getSignificantEvents().getOccurrences().get(i).getEventDate());
                   cpTrackDetailResponse.setTime(trackingDetail.getSignificantEvents().getOccurrences().get(i).getEventTime());
                   cpTrackDetailResponse.setStatus(trackingDetail.getSignificantEvents().getOccurrences().get(i).getEventDescription());
                   cpTrackDetailResponse.setSignatoryName(trackingDetail.getSignificantEvents().getOccurrences().get(i).getSignatoryName());
                   this.track_details.add(cpTrackDetailResponse);
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

    public List<CpTrackDetailResponse> getTrack_details() {
        return track_details;
    }
}
