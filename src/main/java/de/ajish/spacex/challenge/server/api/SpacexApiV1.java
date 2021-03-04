package de.ajish.spacex.challenge.server.api;

import de.ajish.spacex.challenge.client.SpacexAccessClient;
import de.ajish.spacex.challenge.client.model.company.Company;
import de.ajish.spacex.challenge.server.model.dragons.DragonsDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/v1")
public class SpacexApiV1 {
    private static final Logger logger = LogManager.getLogger(SpacexApiV1.class);
    private SpacexAccessClient spacexAccessClient = new SpacexAccessClient();

    @GET
    @Produces("application/json")
    @Path("/crew-details")
    public String getSpacexCrewDetails() {
        logger.debug("Incoming request for fetching spacex crew details.");
        return spacexAccessClient.getCrewDetails();
    }

    @GET
    @Path("/company-info")
    @Produces("application/json")
    public Company getSpacexCompanyInfo() {
        return spacexAccessClient.getCompanyInfo();

    }

    @GET
    @Path("/dragons-details")
    @Produces("application/json")
    public DragonsDetails getSpacexDragonInfo() {
        return spacexAccessClient.getDragonsDetails();

    }
}