package com.somoplay.artonexpress.fedex;

import com.somoplay.artonexpress.fedex.Ship.*;
import com.somoplay.artonexpress.shippment.ShipmentRequest;
import com.somoplay.artonexpress.shippment.ShipmentResponse;
import org.apache.axis.types.NonNegativeInteger;
import org.apache.axis.types.PositiveInteger;
import org.apache.commons.codec.binary.Base64;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * Created by limingyang on 2017/11/2.
 */
public class FedexShipService {
    private ShipmentResponse shipmentResponse;
    private ProcessShipmentReply replyDetail;

    public ProcessShipmentReply getReplyDetail() {
        return replyDetail;
    }

    public void setReplyDetail(ProcessShipmentReply replyDetail) {
        this.replyDetail = replyDetail;
    }

    public ShipmentResponse getShipmentResponse() {
        return shipmentResponse;
    }

    public void ship(ShipmentRequest shipmentRequest) {
        shipmentResponse = new ShipmentResponse();

        ProcessShipmentRequest request = buildRequest(shipmentRequest); // Build a request object
        //
        try {
            // Initialize the service
            ShipServiceLocator service;
            ShipPortType port;
            //
            service = new ShipServiceLocator();
            updateEndPoint(service);
            port = service.getShipServicePort();
            //
            ProcessShipmentReply reply = port.processShipment(request); // This is the call to the ship web service passing in a request object and returning a reply object
            //
            if (isResponseOk(reply.getHighestSeverity())) // check if the call was successful
            {
                setReplyDetail(reply);
                shipmentResponse.setShipmentId(reply.getJobId());

                CompletedShipmentDetail csd = reply.getCompletedShipmentDetail();
                CompletedPackageDetail cpd = csd.getCompletedPackageDetails()[0];

                if(cpd != null){
                    shipmentResponse.setTrackingNumber(cpd.getTrackingIds(0).getTrackingNumber());

                    if(cpd.getLabel() != null){
                        ShippingDocument associatedShipmentLabel = cpd.getLabel();

                        String imageStr = Base64.encodeBase64String(associatedShipmentLabel.getParts()[0].getImage());

                        shipmentResponse.setLabelLink(imageStr);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static ProcessShipmentRequest buildRequest(ShipmentRequest shipmentRequest) {
        ProcessShipmentRequest request = new ProcessShipmentRequest(); // Build a request object

        request.setClientDetail(createClientDetail());
        request.setWebAuthenticationDetail(createWebAuthenticationDetail());
        //
        TransactionDetail transactionDetail = new TransactionDetail();
        transactionDetail.setCustomerTransactionId("java sample - International Ground Shipment"); // The client will get the same value back in the response
        request.setTransactionDetail(transactionDetail);

        //
        VersionId versionId = new VersionId("ship", 21, 0, 0);
        request.setVersion(versionId);

        //
        RequestedShipment requestedShipment = new RequestedShipment();
        requestedShipment.setShipTimestamp(Calendar.getInstance()); // Ship date and time
        requestedShipment.setDropoffType(DropoffType.REGULAR_PICKUP);

        if (shipmentRequest.getService().getCode().equalsIgnoreCase("FEDEX_GROUND")) {
            requestedShipment.setServiceType(ServiceType.FEDEX_GROUND); // Service types are STANDARD_OVERNIGHT, PRIORITY_OVERNIGHT, FEDEX_GROUND ...
        }

        requestedShipment.setPackagingType(PackagingType.YOUR_PACKAGING); // Packaging type FEDEX_BOX, FEDEX_PAK, FEDEX_TUBE, YOUR_PACKAGING, ...

        //
        requestedShipment.setShipper(addShipper(shipmentRequest)); // Sender information
        //
        requestedShipment.setRecipient(addRecipient(shipmentRequest));
        //
        requestedShipment.setShippingChargesPayment(addShippingChargesPayment());
        //
        requestedShipment.setCustomsClearanceDetail(addCustomsClearanceDetail(shipmentRequest));
        //
        requestedShipment.setLabelSpecification(addLabelSpecification());
        //
        requestedShipment.setPackageCount(new NonNegativeInteger("1"));
        //
        requestedShipment.setRequestedPackageLineItems(new RequestedPackageLineItem[] {addRequestedPackageLineItem(shipmentRequest)});
        request.setRequestedShipment(requestedShipment);
        //
        return request;
    }

    private static Party addShipper(ShipmentRequest shipmentRequest){
        Party shipperParty = new Party(); // Sender information
        Contact shipperContact = new Contact();
        shipperContact.setPersonName(shipmentRequest.getSender().getName());
        shipperContact.setCompanyName(shipmentRequest.getSender().getName());
        shipperContact.setPhoneNumber(shipmentRequest.getSender().getPhone());
        Address shipperAddress = new Address();
        if (shipmentRequest.getSender().getAddress2() != null) {
            shipperAddress.setStreetLines(new String[] {shipmentRequest.getSender().getAddress1(), shipmentRequest.getSender().getAddress2()});
        } else {
            shipperAddress.setStreetLines(new String[] {shipmentRequest.getSender().getAddress1()});
        }
        shipperAddress.setCity(shipmentRequest.getSender().getCity());
        shipperAddress.setStateOrProvinceCode(shipmentRequest.getSender().getProvinceCode());
        shipperAddress.setPostalCode(shipmentRequest.getSender().getPostalCode());
        shipperAddress.setCountryCode(shipmentRequest.getSender().getCountryCode());
        shipperParty.setContact(shipperContact);
        shipperParty.setAddress(shipperAddress);
        return shipperParty;
    }

    private static Party addRecipient(ShipmentRequest shipmentRequest){
        Party recipient = new Party(); // Recipient information
        Contact contactRecip = new Contact();
        contactRecip.setCompanyName(shipmentRequest.getRecipient().getName());
        contactRecip.setPhoneNumber(shipmentRequest.getRecipient().getPhone());
        recipient.setContact(contactRecip);
        //
        Address addressRecip = new Address();
        if (shipmentRequest.getRecipient().getAddress2() != null) {
            addressRecip.setStreetLines(new String[] { shipmentRequest.getRecipient().getAddress1(), shipmentRequest.getRecipient().getAddress2() });
        } else {
            addressRecip.setStreetLines(new String[] { shipmentRequest.getRecipient().getAddress1() });
        }
        addressRecip.setCity(shipmentRequest.getRecipient().getCity());
        addressRecip.setStateOrProvinceCode(shipmentRequest.getRecipient().getProvinceCode());
        addressRecip.setPostalCode(shipmentRequest.getRecipient().getPostalCode());
        addressRecip.setCountryCode(shipmentRequest.getRecipient().getCountryCode());
        addressRecip.setResidential(new Boolean(true));
        recipient.setAddress(addressRecip);
        return recipient;
    }

    private static Payment addShippingChargesPayment(){
        Payment payment = new Payment(); // Payment information
        payment.setPaymentType(PaymentType.SENDER);
        Payor payor = new Payor();
        Party responsibleParty = new Party();
        responsibleParty.setAccountNumber("510087160");
        Address responsiblePartyAddress = new Address();
        responsiblePartyAddress.setCountryCode("CA");
        responsibleParty.setAddress(responsiblePartyAddress);
        responsibleParty.setContact(new Contact());
        payor.setResponsibleParty(responsibleParty);
        payment.setPayor(payor);
        return payment;
    }

    private static CustomsClearanceDetail addCustomsClearanceDetail(ShipmentRequest shipmentRequest){
        CustomsClearanceDetail customs = new CustomsClearanceDetail (); // International details

        if (!shipmentRequest.getRecipient().getCountryCode().equalsIgnoreCase("CA")) {
            customs.setDutiesPayment(addShippingChargesPayment());
            customs.setCustomsValue(addMoney("CAD", shipmentRequest.getParcel().getValue().doubleValue()));
            customs.setDocumentContent(InternationalDocumentContentType.NON_DOCUMENTS);
        }

        // Set export detail - To be used for Shipments that fall under AES Compliance
        //ExportDetail exportDetail = new ExportDetail();
        //exportDetail.setExportComplianceStatement("AESX20091127123456");
        //intd.setExportDetail(exportDetail);
        customs.setCommodities(new Commodity[] {addCommodity(shipmentRequest)});// Commodity details
        return customs;
    }

    private static Money addMoney(String currency, Double value){
        Money money = new Money();
        money.setCurrency(currency);
        money.setAmount(new BigDecimal(value));
        return money;
    }

    private static Commodity addCommodity(ShipmentRequest shipmentRequest){
        Commodity commodity = new Commodity();
        commodity.setNumberOfPieces(new NonNegativeInteger("1"));
        commodity.setDescription("Customer Package");
        commodity.setCountryOfManufacture("CA");
        commodity.setWeight(new Weight());
        commodity.getWeight().setValue(shipmentRequest.getParcel().getWeight());
        if (shipmentRequest.getParcel().getUnit().equalsIgnoreCase("KGS")) {
            commodity.getWeight().setUnits(WeightUnits.KG);
        } else {
            commodity.getWeight().setUnits(WeightUnits.LB);
        }
        commodity.setQuantity(new BigDecimal("1.0"));
        commodity.setQuantityUnits("EA");
//        commodity.setUnitPrice(new Money());
//        commodity.getUnitPrice().setAmount(new java.math.BigDecimal(400.000000));
//        commodity.getUnitPrice().setCurrency("USD");
        if (shipmentRequest.getParcel().getValue() != null) {
            commodity.setCustomsValue(new Money());
            commodity.getCustomsValue().setAmount(shipmentRequest.getParcel().getValue());
            commodity.getCustomsValue().setCurrency("CAD");
            commodity.setCountryOfManufacture("CA");
        }
//        commodity.setHarmonizedCode("490199009100");
        return commodity;
    }

    private static LabelSpecification addLabelSpecification(){
        LabelSpecification labelSpecification = new LabelSpecification(); // Label specification
        labelSpecification.setImageType(ShippingDocumentImageType.PDF);// Image types PDF, PNG, DPL, ...
        labelSpecification.setLabelFormatType(LabelFormatType.COMMON2D); //LABEL_DATA_ONLY, COMMON2D
        //labelSpecification.setLabelStockType(LabelStockType.value2); // STOCK_4X6.75_LEADING_DOC_TAB
        //labelSpecification.setLabelPrintingOrientation(LabelPrintingOrientationType.TOP_EDGE_OF_TEXT_FIRST);
        return labelSpecification;
    }

    private static RequestedPackageLineItem addRequestedPackageLineItem(ShipmentRequest shipmentRequest){
        RequestedPackageLineItem requestedPackageLineItem = new RequestedPackageLineItem();
        requestedPackageLineItem.setSequenceNumber(new PositiveInteger("1"));
        requestedPackageLineItem.setGroupPackageCount(new NonNegativeInteger("1"));
        if (shipmentRequest.getParcel().getUnit().equalsIgnoreCase("KGS")) {
            requestedPackageLineItem.setWeight(addPackageWeight(shipmentRequest.getParcel().getWeight().doubleValue(), WeightUnits.KG));
        } else {
            requestedPackageLineItem.setWeight(addPackageWeight(shipmentRequest.getParcel().getWeight().doubleValue(), WeightUnits.LB));
        }
        if (shipmentRequest.getParcel().getLength() != null && shipmentRequest.getParcel().getWidth() != null && shipmentRequest.getParcel().getHeight() != null) {
            if (shipmentRequest.getParcel().getUnit().equalsIgnoreCase("KGS")) {
                requestedPackageLineItem.setDimensions(addPackageDimensions(shipmentRequest.getParcel().getLength().intValue(), shipmentRequest.getParcel().getHeight().intValue(), shipmentRequest.getParcel().getWidth().intValue(), LinearUnits.CM));
            } else {
                requestedPackageLineItem.setDimensions(addPackageDimensions(shipmentRequest.getParcel().getLength().intValue(), shipmentRequest.getParcel().getHeight().intValue(), shipmentRequest.getParcel().getWidth().intValue(), LinearUnits.IN));
            }
        }
//        requestedPackageLineItem.setCustomerReferences(new CustomerReference[]{
//            addCustomerReference(CustomerReferenceType.CUSTOMER_REFERENCE.getValue(), "CR1234"),
//            addCustomerReference(CustomerReferenceType.INVOICE_NUMBER.getValue(), "IV1234"),
//            addCustomerReference(CustomerReferenceType.P_O_NUMBER.getValue(), "PO1234"),
//        });
        //Ground COD set as a package special service.
        if (shipmentRequest.getParcel().getValue() != null) {
            requestedPackageLineItem.setSpecialServicesRequested(addPackageSpecialServicesRequested(shipmentRequest));
        }
        return requestedPackageLineItem;
    }

    private static Weight addPackageWeight(Double packageWeight, WeightUnits weightUnits){
        Weight weight = new Weight();
        weight.setUnits(weightUnits);
        weight.setValue(new BigDecimal(packageWeight));
        return weight;
    }

    private static Dimensions addPackageDimensions(Integer length, Integer height, Integer width, LinearUnits linearUnits){
        Dimensions dimensions = new Dimensions();
        dimensions.setLength(new NonNegativeInteger(length.toString()));
        dimensions.setHeight(new NonNegativeInteger(height.toString()));
        dimensions.setWidth(new NonNegativeInteger(width.toString()));
        dimensions.setUnits(linearUnits);
        return dimensions;
    }

    private static PackageSpecialServicesRequested addPackageSpecialServicesRequested(ShipmentRequest shipmentRequest){
        PackageSpecialServicesRequested packageSpecialServicesRequested = new PackageSpecialServicesRequested();
        PackageSpecialServiceType packageSpecialServiceType[] = new PackageSpecialServiceType[1];
        packageSpecialServiceType[0]=PackageSpecialServiceType.COD;
        packageSpecialServicesRequested.setSpecialServiceTypes(packageSpecialServiceType);
        CodDetail codDetail = new CodDetail();
        codDetail.setCollectionType(CodCollectionType.ANY);
        codDetail.setCodCollectionAmount(addMoney("CAD", shipmentRequest.getParcel().getValue().doubleValue()));
        packageSpecialServicesRequested.setCodDetail(codDetail);
        return packageSpecialServicesRequested;
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

    private static void updateEndPoint(ShipServiceLocator serviceLocator) {
        String endPoint = "https://wsbeta.fedex.com:443/web-services";
        if (endPoint != null) {
            serviceLocator.setShipServicePortEndpointAddress(endPoint);
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
