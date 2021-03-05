package de.ajish.spacex.challenge.client.util.request;

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