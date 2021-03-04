package de.ajish.spacex.challenge.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.ajish.spacex.challenge.client.mapper.dragon.DragonMapper;
import de.ajish.spacex.challenge.client.model.company.Company;
import de.ajish.spacex.challenge.client.model.dragon.Dragon;
import de.ajish.spacex.challenge.client.util.TrustAllHostNameVerifier;
import de.ajish.spacex.challenge.client.util.TrustAllTrustManager;
import de.ajish.spacex.challenge.server.model.dragons.DragonsDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;

import javax.net.ssl.SSLContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class SpacexAccessClient {

    private static final Logger logger = LogManager.getLogger(SpacexAccessClient.class);
    private final String restAPIBaseUrl = "https://api.spacexdata.com/v4/";
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, DeserializationFeature.FAIL_ON_INVALID_SUBTYPE);

    Client client = createClient();
    private Response getSpaceXData(final String urlEndpoint) {
        logger.debug("Request being sent to spaceX v4 api.");
        final String restAPIUrl = restAPIBaseUrl + urlEndpoint;
        return client
                .target(restAPIUrl)
                .request()
                .get();
    }
    public String getCrewDetails() {
        logger.debug("Fetching spacex crew details from spaceX v4 api.");
        Response response = getSpaceXData("crew");

        return response.readEntity(String.class);
    }

    public Company getCompanyInfo() {
        logger.debug("Fetching spacex company info from spaceX v4 api.");
        Response response = getSpaceXData("company");
        Company company = null;
        try {
            company = OBJECT_MAPPER.readValue(response.readEntity(String.class), Company.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return company;
    }

    public DragonsDetails getDragonsDetails() {
        logger.debug("Fetching spacex dragons details from spaceX v4 api.");
        Response response = getSpaceXData("dragons");

        DragonsDetails dragonsDetails = null;
        try {
            List<Dragon> dragons = OBJECT_MAPPER.readValue(response.readEntity(String.class), new TypeReference<List<Dragon>>() {});
            dragonsDetails = DragonMapper.mapDragonToDragonDetails(dragons);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return dragonsDetails;
    }


    private Client createClient() {
        SSLContext ctx = null;
        try {
            ctx = SSLContext.getInstance("SSL");
            ctx.init(null, TrustAllTrustManager.get(), new SecureRandom());
        } catch (KeyManagementException | NoSuchAlgorithmException ex) {
            logger.error("could not initialize SSL Context for trusting all certs");
        }

        ClientBuilder builder = ClientBuilder.newBuilder().hostnameVerifier(new TrustAllHostNameVerifier());
        if (ctx != null) {
            builder = builder.sslContext(ctx);
        }

        Client client = builder.build();

        return client;
    }
}
