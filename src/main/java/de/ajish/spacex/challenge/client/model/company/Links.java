package de.ajish.spacex.challenge.client.model.company;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "website",
        "flickr",
        "twitter",
        "elon_twitter"
})
public class Links {

    @JsonProperty("website")
    private String website;
    @JsonProperty("flickr")
    private String flickr;
    @JsonProperty("twitter")
    private String twitter;
    @JsonProperty("elon_twitter")
    private String elonTwitter;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    @JsonProperty("flickr")
    public String getFlickr() {
        return flickr;
    }

    @JsonProperty("flickr")
    public void setFlickr(String flickr) {
        this.flickr = flickr;
    }

    @JsonProperty("twitter")
    public String getTwitter() {
        return twitter;
    }

    @JsonProperty("twitter")
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    @JsonProperty("elon_twitter")
    public String getElonTwitter() {
        return elonTwitter;
    }

    @JsonProperty("elon_twitter")
    public void setElonTwitter(String elonTwitter) {
        this.elonTwitter = elonTwitter;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}