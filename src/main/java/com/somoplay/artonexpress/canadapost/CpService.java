package com.somoplay.artonexpress.canadapost;

import com.somoplay.artonexpress.domain.ExpressAccount;
import com.somoplay.artonexpress.repository.ExpressAccountRepository;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by lmy on 7/8/2017.
 */
public class CpService {
    private Client aClient;

//    private final ExpressAccountRepository expressAccountRepository = null;

//    private ExpressAccount expressAccount = expressAccountRepository.findOne((long)1);

//    private String username = expressAccount.getCpUserName();
//    private String password = expressAccount.getCpPassword();
//    private String mailedBy = expressAccount.getCpMailedBy();
//    private String contract_id = expressAccount.getCpContractId();

    private String username;
    private String password;
    private String mailedBy;
    private String contract_id;

    public CpService() {
        Properties userProps = new Properties();
        FileInputStream propInputStream;
        try {
            propInputStream = new FileInputStream("user.properties");
            userProps.load(propInputStream);
            propInputStream.close(); // better in finally block
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace(System.out);
            return;
        }
        this.username = userProps.getProperty("cp_username");
        this.password = userProps.getProperty("cp_password");
        this.mailedBy = userProps.getProperty("cp_mailedBy");
        this.contract_id = userProps.getProperty("cp_contract_id");

        ClientConfig config = new DefaultClientConfig();
        aClient = Client.create(config);
        aClient.addFilter(new com.sun.jersey.api.client.filter.HTTPBasicAuthFilter(username, password));
    }

    public ClientResponse createMailingScenario(Object xml) throws UniformInterfaceException {
        String LINK = "https://ct.soa-gw.canadapost.ca/rs/ship/price";
        WebResource aWebResource = aClient.resource(LINK);
        return aWebResource.accept("application/vnd.cpc.ship.rate-v3+xml").header("Content-Type", "application/vnd.cpc.ship.rate-v3+xml").acceptLanguage("en-CA").post(ClientResponse.class, xml);
    }

    public ClientResponse getTrackingDetails(String trackingNumber) throws UniformInterfaceException {
        // 1371134583769923
        String LINK = "https://ct.soa-gw.canadapost.ca/vis/track/pin/" + trackingNumber  + "/detail";
        WebResource aWebResource = aClient.resource(LINK);
        return aWebResource.accept("application/vnd.cpc.track+xml").acceptLanguage("en-CA").get(ClientResponse.class);
    }

    public ClientResponse getTrackingSummary(String trackingNumber) throws UniformInterfaceException {
        // 1681334332936901
        String LINK = "https://ct.soa-gw.canadapost.ca/vis/track/pin/" + trackingNumber  + "/summary";
        WebResource aWebResource = aClient.resource(LINK);
        return aWebResource.accept("application/vnd.cpc.track+xml").acceptLanguage("en-CA").get(ClientResponse.class);
    }

    public ClientResponse createShipment(Object xml) throws UniformInterfaceException {
        String LINK = "https://ct.soa-gw.canadapost.ca/rs/" + mailedBy + "/" + mailedBy + "/shipment";
        WebResource aWebResource = aClient.resource(LINK);
        return aWebResource
            .accept("application/vnd.cpc.shipment-v8+xml")
            .header("Content-Type", "application/vnd.cpc.shipment-v8+xml")
            .header("Source-App", "EXT")
            .header("Consumer-Id", "1")
            .acceptLanguage("en-CA")
            .post(ClientResponse.class, xml);
    }

    public ClientResponse createNCShipment(Object xml) throws UniformInterfaceException {
        String LINK = "https://ct.soa-gw.canadapost.ca/rs/" + mailedBy + "/ncshipment";
        WebResource aWebResource = aClient.resource(LINK);
        return aWebResource.accept("application/vnd.cpc.ncshipment-v4+xml").header("Content-Type", "application/vnd.cpc.ncshipment-v4+xml").acceptLanguage("en-CA").post(ClientResponse.class, xml);
    }

    public ClientResponse createNCShipmentRefundRequest(Object xml, String trackingNumber) throws UniformInterfaceException {
        // 340531309186521749
        String LINK = "https://ct.soa-gw.canadapost.ca/rs/" + mailedBy + "/ncshipment/" + trackingNumber + "/refund";
        WebResource aWebResource = aClient.resource(LINK);
        return aWebResource
            .accept("application/vnd.cpc.ncshipment-v4+xml")
            .header("Content-Type", "application/vnd.cpc.ncshipment-v4+xml")
            .header("Source-App", "EXT")
            .header("Consumer-Id", "1")
            .acceptLanguage("en-CA")
            .post(ClientResponse.class, xml);
    }

    public ClientResponse createShipmentRefundRequest(Object xml, String trackingNumber) throws UniformInterfaceException {
        // 340531309186521749
        String LINK = "https://ct.soa-gw.canadapost.ca/rs/" + mailedBy + "/" + mailedBy + "/shipment/" + trackingNumber + "/refund";
        WebResource aWebResource = aClient.resource(LINK);
        return aWebResource
            .accept("application/vnd.cpc.shipment-v8+xml")
            .header("Content-Type", "application/vnd.cpc.shipment-v8+xml")
            .header("Source-App", "EXT")
            .header("Consumer-Id", "1")
            .acceptLanguage("en-CA")
            .post(ClientResponse.class, xml);
    }

    public ClientResponse voidShipment(String trackingNumber) throws UniformInterfaceException {
        // 340531309186521749
        String LINK = "https://ct.soa-gw.canadapost.ca/rs/" + mailedBy + "/" + mailedBy + "/shipment/" + trackingNumber;
        WebResource aWebResource = aClient.resource(LINK);
        return aWebResource.delete(ClientResponse.class);
    }

    public ClientResponse getArtifact(String link) throws UniformInterfaceException {
        WebResource aWebResource = aClient.resource(link);
        return aWebResource.acceptLanguage("en-CA").get(ClientResponse.class);
    }

    public void close() {
        aClient.destroy();
    }

    public String getMailedBy() {
        return mailedBy;
    }

    public String getContract_id() {
        return contract_id;
    }
}
