package de.ajish.spacex.challenge.client;

import de.ajish.spacex.challenge.client.util.TrustAllHostNameVerifier;
import de.ajish.spacex.challenge.client.util.TrustAllTrustManager;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.net.ssl.SSLContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class SpacexAccessClient {

    private final String restAPIBaseUrl = "https://api.spacexdata.com/v4/";
    Client client = createClient();
    private Response getSpaceXData(final String urlEndpoint) {
        final String restAPIUrl = restAPIBaseUrl + urlEndpoint;
        return client
                .target(restAPIUrl)
                .request()
                .get();
    }
    public String getSpacexCrew() {
        Response response = getSpaceXData("crew");

        return response.readEntity(String.class);
    }


    private Client createClient() {
        SSLContext ctx = null;
        try {
            ctx = SSLContext.getInstance("SSL");
            ctx.init(null, TrustAllTrustManager.get(), new SecureRandom());
        } catch (KeyManagementException | NoSuchAlgorithmException ex) {

            System.err.println("could not initialize SSL Context for trusting all certs");
        }

        ClientBuilder builder = ClientBuilder.newBuilder().hostnameVerifier(new TrustAllHostNameVerifier());
        if (ctx != null) {
            builder = builder.sslContext(ctx);
        }

        Client client = builder.build();

        return client;
    }
}
