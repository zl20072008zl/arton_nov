package com.somoplay.artonexpress.canadapost;

import ca.canadapost.cpcdp.rating.generated.messages.Messages;
import ca.canadapost.cpcdp.rating.generated.rating.MailingScenario;
import ca.canadapost.cpcdp.rating.generated.rating.PriceQuotes;
import com.somoplay.artonexpress.shippment.RateResponse;
import com.somoplay.artonexpress.shippment.ShipmentRequest;
import com.sun.jersey.api.client.ClientResponse;

import javax.xml.bind.JAXBContext;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lmy on 7/8/2017.
 */
public class CpRate {
    private CpService cpService = new CpService();
    private List<RateResponse> rates = new ArrayList<>();

    public void rate (ShipmentRequest cpRateRequest) {

        MailingScenario mailingScenario = new MailingScenario();

        mailingScenario.setCustomerNumber(cpService.getMailedBy());

        MailingScenario.ParcelCharacteristics parcelCharacteristics = new MailingScenario.ParcelCharacteristics();
        parcelCharacteristics.setWeight(cpRateRequest.getParcel().getWeight());
        mailingScenario.setParcelCharacteristics(parcelCharacteristics);

        mailingScenario.setOriginPostalCode(cpRateRequest.getSender().getPostalCode().replaceAll(" ", "").toUpperCase());

        MailingScenario.Destination destination = new MailingScenario.Destination();

        switch (cpRateRequest.getRecipient().getCountry()) {
            case "Canada" :
            case "CA" :
                MailingScenario.Destination.Domestic domestic = new MailingScenario.Destination.Domestic();
                domestic.setPostalCode(cpRateRequest.getRecipient().getPostalCode().replaceAll(" ", "").toUpperCase());
                destination.setDomestic(domestic);
                break;
            case "USA" :
            case "United States" :
            case "US" :
                MailingScenario.Destination.UnitedStates unitedStates = new MailingScenario.Destination.UnitedStates();
                unitedStates.setZipCode(cpRateRequest.getRecipient().getPostalCode());
                destination.setUnitedStates(unitedStates);
                break;
            default :
                MailingScenario.Destination.International international = new MailingScenario.Destination.International();
                international.setCountryCode(cpRateRequest.getRecipient().getCountryCode());
                destination.setInternational(international);
                break;
        }
        mailingScenario.setDestination(destination);

        MailingScenario.Options options = new MailingScenario.Options();

        MailingScenario.Options.Option option1 = new MailingScenario.Options.Option();
        option1.setOptionCode("DC");
        options.getOptions().add(option1);

        if (cpRateRequest.getParcel().getValue() != null && cpRateRequest.getParcel().getValue().compareTo(BigDecimal.ZERO) > 0) {
            MailingScenario.Options.Option option2 = new MailingScenario.Options.Option();
            option2.setOptionCode("COV");
            option2.setOptionAmount(cpRateRequest.getParcel().getValue());
            options.getOptions().add(option2);
        }

        mailingScenario.setOptions(options);

        ClientResponse resp = cpService.createMailingScenario(mailingScenario);
        InputStream respIS = resp.getEntityInputStream();

        // Example of using JAXB to parse xml response
        JAXBContext jc;
        try {
            jc = JAXBContext.newInstance(PriceQuotes.class, Messages.class);
            Object entity = jc.createUnmarshaller().unmarshal(respIS);
            // Determine whether response data matches GetRatesInfo schema.
            if (entity instanceof PriceQuotes) {
                PriceQuotes priceQuotes = (PriceQuotes) entity;
                for (Iterator<PriceQuotes.PriceQuote> iter = priceQuotes.getPriceQuotes().iterator(); iter.hasNext();) {
                    PriceQuotes.PriceQuote aPriceQuote = (PriceQuotes.PriceQuote) iter.next();
                    RateResponse rateResponse = new RateResponse();
                    rateResponse.setCompany("Canada Post");
                    rateResponse.setName(aPriceQuote.getServiceName());
                    rateResponse.setCode(aPriceQuote.getServiceCode());
                    rateResponse.setPrice(aPriceQuote.getPriceDetails().getDue());
                    rateResponse.setExpectedDeliveryDate(aPriceQuote.getServiceStandard().getExpectedDeliveryDate().toGregorianCalendar().getTime().toString());
                    rateResponse.setExpectedTransitTime(aPriceQuote.getServiceStandard().getExpectedTransitTime().toString());
                    this.rates.add(rateResponse);
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

    public List<RateResponse> getRates() {
        return rates;
    }
}
