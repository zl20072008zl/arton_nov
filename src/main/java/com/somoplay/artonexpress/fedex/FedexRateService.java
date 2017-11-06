package com.somoplay.artonexpress.fedex;

import com.somoplay.artonexpress.fedex.Rate.*;
import com.somoplay.artonexpress.shippment.RateResponse;
import com.somoplay.artonexpress.shippment.ShipmentRequest;
import org.apache.axis.types.NonNegativeInteger;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by limingyang on 2017/11/1.
 */
public class FedexRateService {

    private List<RateResponse> rateResponseList;
    private RateReplyDetail[] rateReplyDetails;

    public RateReplyDetail[] getRateReplyDetails() {
        return rateReplyDetails;
    }

    public void setRateReplyDetails(RateReplyDetail[] rateReplyDetails) {
        this.rateReplyDetails = rateReplyDetails;
    }

    public List<RateResponse> getRateResponseList() {
        return rateResponseList;
    }

    public void ship(ShipmentRequest shipmentRequest) {
        rateResponseList = new ArrayList<>();

        // Build a RateRequest request object
        boolean getAllRatesFlag = true; // set to true to get the rates for different service types
        RateRequest request = new RateRequest();
        request.setClientDetail(createClientDetail());
        request.setWebAuthenticationDetail(createWebAuthenticationDetail());
        request.setReturnTransitAndCommit(true);
        //
        TransactionDetail transactionDetail = new TransactionDetail();
        transactionDetail.setCustomerTransactionId("java sample - Rate Request"); // The client will get the same value back in the response
        request.setTransactionDetail(transactionDetail);

        //
        VersionId versionId = new VersionId("crs", 22, 0, 0);

        request.setVersion(versionId);

        //
        RequestedShipment requestedShipment = new RequestedShipment();

        requestedShipment.setShipTimestamp(Calendar.getInstance());
        requestedShipment.setDropoffType(DropoffType.REGULAR_PICKUP);
        if (! getAllRatesFlag) {
            requestedShipment.setServiceType(ServiceType.PRIORITY_OVERNIGHT);
            requestedShipment.setPackagingType(PackagingType.YOUR_PACKAGING);
        }


        Party shipper = new Party();
        Address shipperAddress = new Address(); // Origin information
        if (shipmentRequest.getSender().getAddress2() != null) {
            shipperAddress.setStreetLines(new String[] {shipmentRequest.getSender().getAddress1(), shipmentRequest.getSender().getAddress2()});
        } else {
            shipperAddress.setStreetLines(new String[] {shipmentRequest.getSender().getAddress1()});
        }
        shipperAddress.setCity(shipmentRequest.getSender().getCity());
        shipperAddress.setStateOrProvinceCode(shipmentRequest.getSender().getProvinceCode());
        shipperAddress.setPostalCode(shipmentRequest.getSender().getPostalCode());
        shipperAddress.setCountryCode(shipmentRequest.getSender().getCountryCode());
        shipper.setAddress(shipperAddress);
        requestedShipment.setShipper(shipper);

        //
        Party recipient = new Party();
        Address recipientAddress = new Address(); // Destination information
        if (shipmentRequest.getRecipient().getAddress2() != null) {
            recipientAddress.setStreetLines(new String[] {shipmentRequest.getRecipient().getAddress1(), shipmentRequest.getRecipient().getAddress2()});
        } else {
            recipientAddress.setStreetLines(new String[] {shipmentRequest.getRecipient().getAddress1()});
        }
        recipientAddress.setCity(shipmentRequest.getRecipient().getCity());
        recipientAddress.setStateOrProvinceCode(shipmentRequest.getRecipient().getProvinceCode());
        recipientAddress.setPostalCode(shipmentRequest.getRecipient().getPostalCode());
        recipientAddress.setCountryCode(shipmentRequest.getRecipient().getCountryCode());
        recipient.setAddress(recipientAddress);
        requestedShipment.setRecipient(recipient);

        //
        Payment shippingChargesPayment = new Payment();
        shippingChargesPayment.setPaymentType(PaymentType.SENDER);
        requestedShipment.setShippingChargesPayment(shippingChargesPayment);

        RequestedPackageLineItem rp = new RequestedPackageLineItem();
        rp.setGroupPackageCount(new NonNegativeInteger("1"));
        if (shipmentRequest.getParcel().getUnit().equalsIgnoreCase("KGS")) {
            rp.setWeight(new Weight(WeightUnits.KG, new BigDecimal(shipmentRequest.getParcel().getWeight().toString())));
        } else {
            rp.setWeight(new Weight(WeightUnits.LB, new BigDecimal(shipmentRequest.getParcel().getWeight().toString())));
        }
        //
        if (shipmentRequest.getParcel().getValue() != null && shipmentRequest.getParcel().getValue().compareTo(BigDecimal.ZERO) > 0) {
            rp.setInsuredValue(new Money("CAD", new BigDecimal(shipmentRequest.getParcel().getValue().toString())));
        }
        //
        if (shipmentRequest.getParcel().getLength() != null && shipmentRequest.getParcel().getWeight() != null && shipmentRequest.getParcel().getHeight() != null) {
            if (shipmentRequest.getParcel().getUnit().equalsIgnoreCase("KGS")) {
                rp.setDimensions(new Dimensions(new NonNegativeInteger(shipmentRequest.getParcel().getLength().toString()), new NonNegativeInteger(shipmentRequest.getParcel().getWeight().toString()), new NonNegativeInteger(shipmentRequest.getParcel().getHeight().toString()), LinearUnits.CM));
            }
        }
        PackageSpecialServicesRequested pssr = new PackageSpecialServicesRequested();
        rp.setSpecialServicesRequested(pssr);
        requestedShipment.setRequestedPackageLineItems(new RequestedPackageLineItem[] {rp});


        requestedShipment.setPackageCount(new NonNegativeInteger("1"));
        request.setRequestedShipment(requestedShipment);

        //
        try {
            // Initialize the service
            RateServiceLocator service;
            RatePortType port;
            //
            service = new RateServiceLocator();
            updateEndPoint(service);
            port = service.getRateServicePort();
            // This is the call to the web service passing in a RateRequest and returning a RateReply
            RateReply reply = port.getRates(request); // Service call
            if (isResponseOk(reply.getHighestSeverity())) {
                RateReplyDetail[] rrds = reply.getRateReplyDetails();
                setRateReplyDetails(rrds);
                RateResponse rateResponse = new RateResponse();
                rateResponse.setCompany("Fedex");
                for (int i = 0; i < rrds.length; i++) {
                    RateReplyDetail rrd = rrds[i];

                    if (rrd.getTransitTime() != null && rrd.getTransitTime().getValue() != null) {
                        rateResponse.setExpectedTransitTime(rrd.getTransitTime().getValue());
                    }
                    rateResponse.setCode(rrd.getServiceType().getValue());
                    rateResponse.setName(rrd.getServiceType().getValue());

                    if(rrd.getDeliveryDayOfWeek() != null){
                        int month = rrd.getDeliveryTimestamp().get(Calendar.MONTH)+1;
                        int date = rrd.getDeliveryTimestamp().get(Calendar.DAY_OF_MONTH);
                        int year = rrd.getDeliveryTimestamp().get(Calendar.YEAR);
                        String delDate = new String(month + "/" + date + "/" + year);
                        rateResponse.setExpectedDeliveryDate(delDate);
                    }

                    RatedShipmentDetail[] rsds = rrd.getRatedShipmentDetails();
                    for (int j = 0; j < rsds.length; j++) {
                        RatedShipmentDetail rsd = rsds[j];
                        ShipmentRateDetail srd = rsd.getShipmentRateDetail();
                        rateResponse.setPrice(srd.getTotalNetCharge().getAmount());
                    }
                    rateResponseList.add(rateResponse);
                }
            }

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

    private static void updateEndPoint(RateServiceLocator serviceLocator) {
        String endPoint = "https://wsbeta.fedex.com:443/web-services";
        if (endPoint != null) {
            serviceLocator.setRateServicePortEndpointAddress(endPoint);
        }
    }

    private static boolean isResponseOk(NotificationSeverityType notificationSeverityType) {
        if (notificationSeverityType == null) {
            return false;
        }
        if (notificationSeverityType.equals(NotificationSeverityType.WARNING) ||
            notificationSeverityType.equals(NotificationSeverityType.NOTE)    ||
            notificationSeverityType.equals(NotificationSeverityType.SUCCESS)) {
            return true;
        }
        return false;
    }
}
