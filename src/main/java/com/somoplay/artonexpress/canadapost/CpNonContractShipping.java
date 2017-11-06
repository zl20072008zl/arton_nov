package com.somoplay.artonexpress.canadapost;

import ca.canadapost.cpcdp.ncshipping.generated.messages.Messages;
import ca.canadapost.cpcdp.ncshipping.generated.ncshipment.*;
import com.somoplay.artonexpress.shippment.ShipmentRequest;
import com.somoplay.artonexpress.shippment.ShipmentResponse;
import com.sun.jersey.api.client.ClientResponse;

import javax.xml.bind.JAXBContext;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Iterator;

/**
 * Created by lmy on 7/8/2017.
 */
public class CpNonContractShipping {
    private CpService cpService = new CpService();
    private ShipmentResponse shipmentResponse = new ShipmentResponse();

    public void non_contract_shipping (ShipmentRequest shipmentRequest) {
        NonContractShipment shipment = new NonContractShipment();

        DomesticAddressDetailsType senderAddress = new DomesticAddressDetailsType();
        senderAddress.setAddressLine1(shipmentRequest.getSender().getAddress1());
        senderAddress.setAddressLine2(shipmentRequest.getSender().getAddress2());
        senderAddress.setCity(shipmentRequest.getSender().getCity());
        senderAddress.setProvState(shipmentRequest.getSender().getProvinceCode());
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
        destinationAddress.setProvState(shipmentRequest.getRecipient().getProvinceCode());
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

        PreferencesType preferences = new PreferencesType();
        preferences.setShowInsuredValue(true);
        preferences.setShowPackingInstructions(false);
        preferences.setShowPostageRate(true);

//        ReferencesType references = new ReferencesType();
//        references.setCostCentre("costCentre");
//        references.setCustomerRef1("custRef1");
//        references.setCustomerRef2("custRef2");

        DeliverySpecType deliverySpec = new DeliverySpecType();
        deliverySpec.setServiceCode(shipmentRequest.getService().getCode());
        deliverySpec.setSender(sender);
        deliverySpec.setDestination(destination);
        deliverySpec.setOptions(options);
        deliverySpec.setParcelCharacteristics(characteristics);
        deliverySpec.setNotification(notification);
        deliverySpec.setPreferences(preferences);
//        deliverySpec.setReferences(references);

        shipment.setRequestedShippingPoint(shipmentRequest.getSender().getPostalCode().replaceAll(" ", "").toUpperCase());
        shipment.setDeliverySpec(deliverySpec);

        ClientResponse resp = cpService.createNCShipment(shipment);
        InputStream respIS = resp.getEntityInputStream();

        // Example of using JAXB to parse xml response
        JAXBContext jc;
        try {
            jc = JAXBContext.newInstance(NonContractShipmentInfo.class, Messages.class);
            Object entity = jc.createUnmarshaller().unmarshal(respIS);
            // Determine whether response data matches CreateNCShipmentInfo schema.
            if (entity instanceof NonContractShipmentInfo) {
                NonContractShipmentInfo shipmentInfo = (NonContractShipmentInfo) entity;
                this.shipmentResponse.setShipmentId(shipmentInfo.getShipmentId());
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
        return shipmentResponse;
    }
}
