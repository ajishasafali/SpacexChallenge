package de.ajish.spacex.challenge.server.api;

import de.ajish.spacex.challenge.client.SpacexAccessClient;
import de.ajish.spacex.challenge.server.model.Crew;
import org.codehaus.jackson.map.ObjectMapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.io.IOException;

@Path("/v1/crew-details")
public class SpacexApiV1 {
    @GET
    @Produces("application/json")
    public String getSpacexCrewDetails() {
        final Crew crew = new Crew();
        crew.setName("Robert");
        crew.setAgency("XXX");

        final ObjectMapper obj =  new ObjectMapper();

        String jsonResponse = "";
        try{
            jsonResponse = obj.writeValueAsString(crew);
        }catch(final IOException ioException){
            ioException.printStackTrace();
        }

        SpacexAccessClient spacexAccessClient = new SpacexAccessClient();
        spacexAccessClient.getSpacexCrew();
        return spacexAccessClient.getSpacexCrew();

    }
}