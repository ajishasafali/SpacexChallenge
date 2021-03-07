package de.ajish.spacex.challenge.client.util.request;

/**
 * internal model used for request body filled with Query and Options objects
 */
public class QueryRequestBody {

    private Query query;
    private Options options;

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

}