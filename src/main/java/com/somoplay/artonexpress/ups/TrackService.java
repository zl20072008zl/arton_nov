package com.somoplay.artonexpress.ups;

import com.somoplay.artonexpress.ups.access.AccessRequest;
import com.somoplay.artonexpress.ups.access.ObjectFactory;
import com.somoplay.artonexpress.ups.track.TrackRequest.Request;
import com.somoplay.artonexpress.ups.track.TrackRequest.TrackRequest;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.List;

/**
 * Created by limingyang on 2017/10/28.
 */
public class TrackService {
    private static final String trackUrl = "https://wwwcie.ups.com/ups.app/xml/Track";
//    private static final String trackUrl = "https://onlinetools.ups.com/rest/Track";

    private ConnectService connectService;

    private String result;

    public void track_service (String trackingNumber) {
        StringWriter strWriter = null;
        try{
            strWriter = new StringWriter();
            // Create JAXBContext and marshaller for AccessRequest object
            JAXBContext accessRequestJAXBC = JAXBContext.newInstance(AccessRequest.class.getPackage().getName());
            Marshaller accessRequestMarshaller = accessRequestJAXBC.createMarshaller();
            ObjectFactory accessRequestObjectFactory = new ObjectFactory();
            AccessRequest accessRequest = accessRequestObjectFactory.createAccessRequest();
            connectService.populateAccessRequest(accessRequest);

            accessRequestMarshaller.marshal(accessRequest, strWriter);

            TrackRequest trackRequest = populateTrackRequest(trackingNumber);
            JAXBContext trackRequestJAXBC = JAXBContext.newInstance(TrackRequest.class.getPackage().getName() );
            Marshaller trackRequestMarshaller = trackRequestJAXBC.createMarshaller();
            trackRequestMarshaller.marshal(trackRequest, strWriter);

            strWriter.flush();
            strWriter.close();

            this.result = connectService.contactService(strWriter.getBuffer().toString(), trackUrl);

        }catch (Exception e) {
            e.printStackTrace();
            this.result = e.toString();
        } finally {
            try {
                if (strWriter != null) {
                    strWriter.close();
                    strWriter = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.result = e.toString();
            }
        }
    }

    public String getResult() {
        return result;
    }

    private static TrackRequest populateTrackRequest(String trackingNumber){
        TrackRequest trackRequest = new TrackRequest();
        Request request = new Request();

        List<String> optoinsList = request.getRequestOption();
        optoinsList.add("activity"); //If the request option here is of 2 ~ 15, then Signature tracking must validate the rights to signature tracking.
        request.setRequestAction("Track");
        trackRequest.setRequest(request);
        trackRequest.setTrackingNumber(trackingNumber);
        trackRequest.setIncludeFreight("01");
        return trackRequest;
    }
}
