package de.ajish.spacex.challenge.client.util.request;

/**
 * internal model used for body of request can be extended if required
 */
public class Query {
    private String agency;

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

}