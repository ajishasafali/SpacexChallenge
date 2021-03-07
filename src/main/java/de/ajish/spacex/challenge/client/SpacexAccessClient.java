package de.ajish.spacex.challenge.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.ajish.spacex.challenge.client.mapper.crew.CrewMapper;
import de.ajish.spacex.challenge.client.mapper.dragon.DragonMapper;
import de.ajish.spacex.challenge.client.model.company.Company;
import de.ajish.spacex.challenge.client.model.crew.CrewQueryResponse;
import de.ajish.spacex.challenge.client.model.dragon.Dragon;
import de.ajish.spacex.challenge.client.util.cert.TrustAllHostNameVerifier;
import de.ajish.spacex.challenge.client.util.cert.TrustAllTrustManager;
import de.ajish.spacex.challenge.client.util.request.Options;
import de.ajish.spacex.challenge.client.util.request.Query;
import de.ajish.spacex.challenge.client.util.request.QueryRequestBody;
import de.ajish.spacex.challenge.server.model.crew.CrewDetails;
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
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Access client to the spacex v4 api
 */
public class SpacexAccessClient {

    private static final Logger logger = LogManager.getLogger(SpacexAccessClient.class);
    private final String restAPIBaseUrl = "https://api.spacexdata.com/v4/";
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, DeserializationFeature.FAIL_ON_INVALID_SUBTYPE);

    private final Client client = createClient();

    /**
     * Get crew info from spacex v4 api
     * @param agency
     * @return
     */
    public CrewDetails getCrewDetailsForAgency(final String agency) {
        logger.info("Fetching spacex crew details from spaceX v4 api.");

        QueryRequestBody queryRequestBody = createCrewReqBody(agency);
        Response response = postSpaceXDataQuery("crew", queryRequestBody);

        CrewDetails crewDetails = null;
        try {
            CrewQueryResponse crewQueryResponse = OBJECT_MAPPER.readValue(response.readEntity(String.class), CrewQueryResponse.class);
            crewDetails = CrewMapper.mapCrewToCrewDetails(crewQueryResponse);
        } catch (JsonProcessingException e) {
            logger.error("Exception while processing the data from crew response object: {}", e.getMessage());
        }

        return crewDetails;
    }

    /**
     * Get info about company via space x api v4
     * @return
     */
    public Company getCompanyInfo() {
        logger.info("Fetching spacex company info from spaceX v4 api.");
        Response response = getSpaceXData("company");
        Company company = null;
        try {
            company = OBJECT_MAPPER.readValue(response.readEntity(String.class), Company.class);
        } catch (JsonProcessingException e) {
            logger.error("Exception while processing the data from company response object: {}", e.getMessage());
        }
        return company;
    }

    /**
     * get dragon info from space x v4 api
     * @return
     */
    public DragonsDetails getDragonsDetails() {
        logger.info("Fetching spacex dragons details from spaceX v4 api.");
        Response response = getSpaceXData("dragons");

        DragonsDetails dragonsDetails = null;
        try {
            List<Dragon> dragons = OBJECT_MAPPER.readValue(response.readEntity(String.class), new TypeReference<List<Dragon>>() {});
            dragonsDetails = DragonMapper.mapDragonToDragonDetails(dragons);
        } catch (JsonProcessingException e) {
            logger.error("Exception while processing the data from dragon response object: {}", e.getMessage());
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

    private QueryRequestBody createCrewReqBody(final String agency){
        QueryRequestBody queryRequestBody = new QueryRequestBody();
        if(agency != null && !agency.isEmpty()){
            Query query = new Query();
            query.setAgency(agency);
            queryRequestBody.setQuery(query);
        }
        Options options = new Options();
        options.setPagination(false);
        queryRequestBody.setOptions(options);

        return queryRequestBody;
    }

    private Response getSpaceXData(final String urlEndpoint) {
        logger.debug("Get request being sent to spaceX v4 api.");
        final String restAPIUrl = restAPIBaseUrl + urlEndpoint;
        return client
                .target(restAPIUrl)
                .request()
                .get();
    }

    private Response postSpaceXDataQuery(final String urlEndpoint, final QueryRequestBody queryBody) {
        logger.debug("Post request being sent to spaceX v4 api.");
        final String query = "/query";
        final String restAPIUrl = restAPIBaseUrl + urlEndpoint + query;
        return client
                .target(restAPIUrl)
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(queryBody, MediaType.APPLICATION_JSON));
    }
}
