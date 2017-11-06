package com.somoplay.artonexpress.canadapost;

import ca.canadapost.cpcdp.shipping.generated.messages.Messages;
import ca.canadapost.cpcdp.shipping.generated.shipment.*;
import com.somoplay.artonexpress.shippment.ShipmentRequest;
import com.somoplay.artonexpress.shippment.ShipmentResponse;
import com.sun.jersey.api.client.ClientResponse;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Iterator;

/**
 * Created by lmy on 7/8/2017.
 */
public class CpContractShipping {
    private CpService cpService = new CpService();
    private ShipmentResponse shipmentResponse = new ShipmentResponse();

    public void contract_shipping (ShipmentRequest shipmentRequest) {

        // Create CreateShipment XML Request Object
        Shipment shipment = new Shipment();

        JAXBElement<String> groupId = new JAXBElement<String>(new QName("http://www.canadapost.ca/ws/shipment-v8", "group-id"), String.class, shipmentRequest.getUser().getId().toString());
        JAXBElement<Boolean> transmitShipment = new JAXBElement<Boolean>(new QName("http://www.canadapost.ca/ws/shipment-v8", "transmit-shipment"), Boolean.class, Boolean.TRUE);

        //1. regular shipment
        shipment.setGroupIdOrTransmitShipment(groupId);

        //2. no manifest shipment
        //shipment.setGroupIdOrTransmitShipment(transmitShipment);

        shipment.setRequestedShippingPoint(shipmentRequest.getSender().getPostalCode().replaceAll(" ", "").toUpperCase());
        shipment.setCpcPickupIndicator(true);

//        GregorianCalendar mailingDate = new GregorianCalendar();
//        mailingDate.set(new Date().getYear(), new Date().getMonth(), new Date().getDate() + 1);
//
//        XMLGregorianCalendar XmlMailingDate = null;
//        try {
//            XmlMailingDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(mailingDate);
//        } catch (DatatypeConfigurationException e) {
//            e.printStackTrace(System.out);
//        }
//        shipment.setExpectedMailingDate(XmlMailingDate);

        AddressDetailsType senderAddress = new AddressDetailsType();
        senderAddress.setAddressLine1(shipmentRequest.getSender().getAddress1());
        senderAddress.setAddressLine2(shipmentRequest.getSender().getAddress2());
        senderAddress.setCity(shipmentRequest.getSender().getCity());
        senderAddress.setProvState(shipmentRequest.getSender().getProvince());
        senderAddress.setCountryCode(shipmentRequest.getSender().getCountryCode());
        senderAddress.setPostalZipCode(shipmentRequest.getSender().getPostalCode().replaceAll(" ", "").toUpperCase());

        SenderType sender = new SenderType();
        sender.setName(shipmentRequest.getSender().getName());
        sender.setCompany(shipmentRequest.getSender().getName());

        sender.setContactPhone(shipmentRequest.getSender().getPhone());
        sender.setAddressDetails(senderAddress);

        DestinationAddressDetailsType destinationAddress = new DestinationAddressDetailsType();
        destinationAddress.setAddressLine1(shipmentRequest.getRecipient().getAddress1());
        destinationAddress.setAddressLine2(shipmentRequest.getRecipient().getAddress2());
        destinationAddress.setCity(shipmentRequest.getRecipient().getCity());
        destinationAddress.setProvState(shipmentRequest.getRecipient().getProvince());
        destinationAddress.setCountryCode(shipmentRequest.getRecipient().getCountryCode());
        destinationAddress.setPostalZipCode(shipmentRequest.getRecipient().getPostalCode().replaceAll(" ", "").toUpperCase());

        DestinationType destination = new DestinationType();
        destination.setName(shipmentRequest.getRecipient().getName());
        destination.setCompany(shipmentRequest.getRecipient().getName());

        destination.setClientVoiceNumber(shipmentRequest.getRecipient().getPhone());
        destination.setAddressDetails(destinationAddress);

        DeliverySpecType.Options options = new DeliverySpecType.Options();

        OptionType option1 = new OptionType();
        option1.setOptionCode("DC");

        options.getOptions().add(option1);

        if (shipmentRequest.getParcel().getValue() != null && shipmentRequest.getParcel().getValue().compareTo(BigDecimal.ZERO) > 0) {
            OptionType option2 = new OptionType();
            option2.setOptionCode("COV");
            option2.setOptionAmount(shipmentRequest.getParcel().getValue());
            options.getOptions().add(option2);
        }

//        ParcelCharacteristicsType.Dimensions parcelDimension = new ParcelCharacteristicsType.Dimensions();
//        parcelDimension.setHeight(shipmentRequest.getParcel().getHeight());
//        parcelDimension.setLength(shipmentRequest.getParcel().getLength());
//        parcelDimension.setWidth(shipmentRequest.getParcel().getWidth());

        ParcelCharacteristicsType characteristics = new ParcelCharacteristicsType();
        characteristics.setWeight(shipmentRequest.getParcel().getWeight());
//        characteristics.setDimensions(parcelDimension);

        NotificationType notification = new NotificationType();
        notification.setEmail(shipmentRequest.getUser().getEmail());
        notification.setOnDelivery(true);
        notification.setOnException(false);
        notification.setOnShipment(true);

        PrintPreferencesType printPreferences = new PrintPreferencesType();
        printPreferences.setOutputFormat("8.5x11");

        PreferencesType preferences = new PreferencesType();
        preferences.setShowInsuredValue(true);
        preferences.setShowPackingInstructions(false);
        preferences.setShowPostageRate(true);

//        ReferencesType references = new ReferencesType();
//        references.setCostCentre("costCentre");
//        references.setCustomerRef1("custRef1");
//        references.setCustomerRef2("custRef2");

        SettlementInfoType settlementInfo = new SettlementInfoType();
        settlementInfo.setContractId(cpService.getContract_id());
        settlementInfo.setIntendedMethodOfPayment("Account");

        DeliverySpecType deliverySpec = new DeliverySpecType();
        deliverySpec.setServiceCode(shipmentRequest.getService().getCode());

//        CustomsType customsType = new CustomsType();
//        customsType.setCurrency("CAD");
//        deliverySpec.setCustoms(customsType);

        deliverySpec.setSender(sender);
        deliverySpec.setDestination(destination);
        deliverySpec.setOptions(options);
        deliverySpec.setParcelCharacteristics(characteristics);
        deliverySpec.setNotification(notification);
        deliverySpec.setPrintPreferences(printPreferences);
        deliverySpec.setPreferences(preferences);
//        deliverySpec.setReferences(references);
        deliverySpec.setSettlementInfo(settlementInfo);

        shipment.setDeliverySpec(deliverySpec);

        ClientResponse resp = cpService.createShipment(shipment);
        InputStream respIS = resp.getEntityInputStream();

        // Example of using JAXB to parse xml response
        JAXBContext jc;
        try {
            jc = JAXBContext.newInstance(ShipmentInfo.class, Messages.class);
            Object entity = jc.createUnmarshaller().unmarshal(respIS);
            // Determine whether response data matches CreateShipmentInfo schema.
            if (entity instanceof ShipmentInfo) {
                ShipmentInfo shipmentInfo = (ShipmentInfo) entity;
                System.out.println("Error Code: " + shipmentInfo.getShipmentId());
                System.out.println("Error Code: " + shipmentInfo.getTrackingPin());

                this.shipmentResponse.setShipmentId(shipmentInfo.getShipmentId());
                this.shipmentResponse.setShipmentStatus(shipmentInfo.getShipmentStatus());
                this.shipmentResponse.setTrackingNumber(shipmentInfo.getTrackingPin());
                for (Iterator<Link> iter = shipmentInfo.getLinks().getLinks().iterator(); iter.hasNext();) {
                    Link aItem = (Link) iter.next();
                    if (aItem.getRel().toString().equalsIgnoreCase("label")) {
                        this.shipmentResponse.setLabelLink(aItem.getHref());
                    }
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

    public ShipmentResponse getShipmentResponse() {
        return this.shipmentResponse;
    }
}
