package com.somoplay.artonexpress.fedex;

import com.somoplay.artonexpress.canadapost.CpTrackSummery;
import com.somoplay.artonexpress.fedex.Track.*;
import com.somoplay.artonexpress.shippment.CpTrackDetailResponse;
import com.somoplay.artonexpress.shippment.CpTrackSummeryResponse;
import com.somoplay.artonexpress.shippment.FedexTrackingResponse;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TrackService {
    private FedexTrackingResponse fedexTrackingResponse;
    private TrackReply trackReply;

    public TrackReply getTrackReply() {
        return trackReply;
    }

    public void setTrackReply(TrackReply trackReply) {
        this.trackReply = trackReply;
    }

    public FedexTrackingResponse getFedexTrackingResponse() {
        return fedexTrackingResponse;
    }

    public void setFedexTrackingResponse(FedexTrackingResponse fedexTrackingResponse) {
        this.fedexTrackingResponse = fedexTrackingResponse;
    }

    public void track(String trackingNumber) throws Exception {

        //
        TrackRequest request = new TrackRequest();

        request.setClientDetail(createClientDetail());
        request.setWebAuthenticationDetail(createWebAuthenticationDetail());
        //
        TransactionDetail transactionDetail = new TransactionDetail();
        transactionDetail.setCustomerTransactionId("java sample - Tracking Request"); //This is a reference field for the customer.  Any value can be used and will be provided in the response.
        request.setTransactionDetail(transactionDetail);

        //
        VersionId versionId = new VersionId("trck", 14, 0, 0);
        request.setVersion(versionId);
        //
        TrackSelectionDetail selectionDetail=new TrackSelectionDetail();
        TrackPackageIdentifier packageIdentifier=new TrackPackageIdentifier();
        packageIdentifier.setType(TrackIdentifierType.TRACKING_NUMBER_OR_DOORTAG);
        packageIdentifier.setValue(trackingNumber); // tracking number
        selectionDetail.setPackageIdentifier(packageIdentifier);
        request.setSelectionDetails(new TrackSelectionDetail[] {selectionDetail});
        TrackRequestProcessingOptionType processingOption=TrackRequestProcessingOptionType.INCLUDE_DETAILED_SCANS;
        request.setProcessingOptions(new TrackRequestProcessingOptionType[]{processingOption});

        //
        try {
            // Initializing the service
            TrackServiceLocator service;
            TrackPortType port;
            //
            service = new TrackServiceLocator();
            updateEndPoint(service);
            port = service.getTrackServicePort();
            //
            TrackReply reply = port.track(request); // This is the call to the web service passing in a request object and returning a reply object
            setTrackReply(reply);

//            if (
//                reply.getHighestSeverity().equals(NotificationSeverityType.WARNING) ||
//                reply.getHighestSeverity().equals(NotificationSeverityType.NOTE)    ||
//                reply.getHighestSeverity().equals(NotificationSeverityType.SUCCESS)
//                ) {
//                if (reply.getCompletedTrackDetails()[0].getNotifications() != null) {
//                    TrackDetail trackDetail = reply.getCompletedTrackDetails()[0].getTrackDetails()[0];
//                    String location = "";
//
//                    if (trackDetail.getDestinationAddress() != null) {
//                        if (trackDetail.getDestinationAddress().getPostalCode() != null) {
//                            fedexTrackingResponse.getCpTrackSummeryResponse().setDestinationPostal(trackDetail.getDestinationAddress().getPostalCode());
//                        }
//                        if (trackDetail.getDestinationAddress().getStateOrProvinceCode() != null) {
//                            fedexTrackingResponse.getCpTrackSummeryResponse().setDestinationProvince(trackDetail.getDestinationAddress().getStateOrProvinceCode());
//                        }
//                    }
//                    if (trackDetail.getStatusDetail() != null) {
//                        if (trackDetail.getStatusDetail().getCreationTime() != null) {
//                            fedexTrackingResponse.getCpTrackSummeryResponse().setEventDateTime(trackDetail.getStatusDetail().getCreationTime().toString());
//                        }
//                        if (trackDetail.getStatusDetail().getDescription() != null){
//                            fedexTrackingResponse.getCpTrackSummeryResponse().setEventDescription(trackDetail.getStatusDetail().getDescription());
//                        }
//                        if (trackDetail.getStatusDetail().getCode() != null) {
//                            fedexTrackingResponse.getCpTrackSummeryResponse().setEventType(trackDetail.getStatusDetail().getCode());
//                        }
//                        if (trackDetail.getStatusDetail().getLocation() != null) {
//                            if (trackDetail.getStatusDetail().getLocation().getCity() != null) {
//                                location = trackDetail.getStatusDetail().getLocation().getCity();
//                            }
//                            if (trackDetail.getStatusDetail().getLocation().getStateOrProvinceCode() != null) {
//                                location = location + ", " + trackDetail.getStatusDetail().getLocation().getStateOrProvinceCode();
//                            }
//                            if (trackDetail.getStatusDetail().getLocation().getCountryCode() != null) {
//                                location = location + ", " +  trackDetail.getStatusDetail().getLocation().getCountryCode();
//                            }
//                        }
//                    }
//
//                    if (!location.equalsIgnoreCase("")) {
//                        fedexTrackingResponse.getCpTrackSummeryResponse().setEventLocation(location);
//                    }
//
//                    for (int i=0; i<trackDetail.getDatesOrTimes().length; i++) {
//                        if (trackDetail.getDatesOrTimes()[i].getType().getValue().equals("ACTUAL_DELIVERY")) {
//                            fedexTrackingResponse.getCpTrackSummeryResponse().setActualDeliveryDate(trackDetail.getDatesOrTimes()[i].getDateOrTimestamp());
//                        }
//                        if (trackDetail.getDatesOrTimes()[i].getType().getValue().equals("ACTUAL_PICKUP")) {
//                        }
//                        if (trackDetail.getDatesOrTimes()[i].getType().getValue().equals("SHIP")) {
//                        }
//                    }
//                    if (trackDetail.getShipperAddress().getPostalCode() != null) {
//                        fedexTrackingResponse.getCpTrackSummeryResponse().setOriginPostal(trackDetail.getShipperAddress().getPostalCode());
//                    }
//                    if (trackDetail.getService().getDescription() != null) {
//                        fedexTrackingResponse.getCpTrackSummeryResponse().setServiceName(trackDetail.getService().getDescription());
//                    }
//                    if (trackDetail.getSignature() != null) {
//                        fedexTrackingResponse.getCpTrackSummeryResponse().setSignatoryName(trackDetail.getSignature().toString());
//                    }
//                    if (trackDetail.getTrackingNumber() != null) {
//                        fedexTrackingResponse.getCpTrackSummeryResponse().setTrackingNumber(trackDetail.getTrackingNumber());
//                    }
//
//                    for (int i=0; i<trackDetail.getEvents().length; i++) {
//                        CpTrackDetailResponse cpTrackDetailResponse = new CpTrackDetailResponse();
//
//                        if (trackDetail.getEvents()[i].getTimestamp() != null) {
//                            cpTrackDetailResponse.setDate(trackDetail.getEvents()[i].getTimestamp().toString().split("T")[0]);
//                            cpTrackDetailResponse.setTime(trackDetail.getEvents()[i].getTimestamp().toString().split("T")[1].split(".")[0]);
//                        }
//                        if (trackDetail.getEvents()[i].getAddress() != null) {
//                            if (trackDetail.getEvents()[i].getAddress().getCity() != null) {
//                                cpTrackDetailResponse.setCity(trackDetail.getEvents()[i].getAddress().getCity());
//                            }
//                            if (trackDetail.getEvents()[i].getAddress().getStateOrProvinceCode() != null) {
//                                cpTrackDetailResponse.setProvince(trackDetail.getEvents()[i].getAddress().getStateOrProvinceCode());
//                            }
//                            if (trackDetail.getEvents()[i].getEventDescription() != null) {
//                                cpTrackDetailResponse.setStatus(trackDetail.getEvents()[i].getEventDescription());
//                            }
//                        }
//
//                        fedexTrackingResponse.getCpTrackDetailResponseList().add(cpTrackDetailResponse);
//                    }
//                }
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ClientDetail createClientDetail() {
        ClientDetail clientDetail = new ClientDetail();
        String accountNumber = System.getProperty("accountNumber");
        String meterNumber = System.getProperty("meterNumber");

        //
        // See if the accountNumber and meterNumber properties are set,
        // if set use those values, otherwise default them to "XXX"
        //
        if (accountNumber == null) {
            accountNumber = "510087160"; // Replace "XXX" with clients account number
        }
        if (meterNumber == null) {
            meterNumber = "118957890"; // Replace "XXX" with clients meter number
        }
        clientDetail.setAccountNumber(accountNumber);
        clientDetail.setMeterNumber(meterNumber);
        return clientDetail;
    }

    private static WebAuthenticationDetail createWebAuthenticationDetail() {
        WebAuthenticationCredential userCredential = new WebAuthenticationCredential();
        String key = System.getProperty("key");
        String password = System.getProperty("password");
        //
        // See if the key and password properties are set,
        // if set use those values, otherwise default them to "XXX"
        //
        if (key == null) {
            key = "iU0dmSf2rmknzSfm"; // Replace "XXX" with clients key
        }
        if (password == null) {
            password = "QRQSs0XXr91pYXJcWiQwQOovL"; // Replace "XXX" with clients password
        }
        userCredential.setKey(key);
        userCredential.setPassword(password);

        WebAuthenticationCredential parentCredential = null;
        Boolean useParentCredential=false; //Set this value to true is using a parent credential
        if(useParentCredential){

            String parentKey = System.getProperty("parentkey");
            String parentPassword = System.getProperty("parentpassword");
            //
            // See if the parentkey and parentpassword properties are set,
            // if set use those values, otherwise default them to "XXX"
            //
            if (parentKey == null) {
                parentKey = "XXX"; // Replace "XXX" with clients parent key
            }
            if (parentPassword == null) {
                parentPassword = "XXX"; // Replace "XXX" with clients parent password
            }
            parentCredential = new WebAuthenticationCredential();
            parentCredential.setKey(parentKey);
            parentCredential.setPassword(parentPassword);
        }
        return new WebAuthenticationDetail(parentCredential, userCredential);
    }

    private static void updateEndPoint(TrackServiceLocator serviceLocator) {
        String endPoint = "https://wsbeta.fedex.com:443/web-services";
        if (endPoint != null) {
            serviceLocator.setTrackServicePortEndpointAddress(endPoint);
        }
    }
}
