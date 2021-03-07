package de.ajish.spacex.challenge.server.api;

import de.ajish.spacex.challenge.client.SpacexAccessClient;
import de.ajish.spacex.challenge.client.model.company.Company;
import de.ajish.spacex.challenge.server.model.crew.CrewDetails;
import de.ajish.spacex.challenge.server.model.dragons.DragonsDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.*;

/**
 * version 1 rest endpoint
 */
@Path("/v1")
public class SpacexApiV1 {
    private static final Logger logger = LogManager.getLogger(SpacexApiV1.class);
    private final SpacexAccessClient spacexAccessClient = new SpacexAccessClient();

    /**
     * rest end point to access crew details
     * @param agency
     * @return
     */
    @GET
    @Produces("application/json")
    @Path("/crew-details")
    public CrewDetails getSpacexCrewDetails(@QueryParam("agency") String agency) {
        logger.debug("Incoming request for fetching spacex crew details.");
        return spacexAccessClient.getCrewDetailsForAgency(agency);
    }

    /**
     * rest end point to access company info
     * @return
     */
    @GET
    @Path("/company-info")
    @Produces("application/json")
    public Company getSpacexCompanyInfo() {
        logger.debug("Incoming request for fetching spacex company info.");
        return spacexAccessClient.getCompanyInfo();

    }

    /**
     * rest end point to access dragon details
     * @return
     */
    @GET
    @Path("/dragons-details")
    @Produces("application/json")
    public DragonsDetails getSpacexDragonInfo() {
        logger.debug("Incoming request for fetching spacex dragon details.");
        return spacexAccessClient.getDragonsDetails();

    }
}