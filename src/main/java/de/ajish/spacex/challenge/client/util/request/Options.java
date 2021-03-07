package de.ajish.spacex.challenge.client.util.request;

/**
 * internal model used for body of request can be extended if required
 */
public class Options {

    private Boolean pagination;

    public Boolean getPagination() {
        return pagination;
    }

    public void setPagination(Boolean pagination) {
        this.pagination = pagination;
    }

}