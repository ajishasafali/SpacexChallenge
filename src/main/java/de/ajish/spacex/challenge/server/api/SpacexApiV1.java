package de.ajish.spacex.challenge.server.api;

import de.ajish.spacex.challenge.client.SpacexAccessClient;
import de.ajish.spacex.challenge.client.model.company.Company;
import de.ajish.spacex.challenge.server.model.crew.CrewDetails;
import de.ajish.spacex.challenge.server.model.dragons.DragonsDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/v1")
public class SpacexApiV1 {
    private static final Logger logger = LogManager.getLogger(SpacexApiV1.class);
    private final SpacexAccessClient spacexAccessClient = new SpacexAccessClient();

    @GET
    @Produces("application/json")
    @Path("/crew-details")
    public CrewDetails getSpacexCrewDetails(@QueryParam("agency") String agency) {
        logger.debug("Incoming request for fetching spacex crew details.");
        return spacexAccessClient.getCrewDetailsForAgency(agency);
    }

    @GET
    @Path("/company-info")
    @Produces("application/json")
    public Company getSpacexCompanyInfo() {
        logger.debug("Incoming request for fetching spacex company info.");
        return spacexAccessClient.getCompanyInfo();

    }

    @GET
    @Path("/dragons-details")
    @Produces("application/json")
    public DragonsDetails getSpacexDragonInfo() {
        logger.debug("Incoming request for fetching spacex dragon details.");
        return spacexAccessClient.getDragonsDetails();

    }
}