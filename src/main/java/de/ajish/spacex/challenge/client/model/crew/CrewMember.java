package de.ajish.spacex.challenge.client.model.crew;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "agency",
        "image",
        "wikipedia",
        "launches",
        "status",
        "id"
})
public class CrewMember {

    @JsonProperty("name")
    private String name;
    @JsonProperty("agency")
    private String agency;
    @JsonProperty("image")
    private String image;
    @JsonProperty("wikipedia")
    private String wikipedia;
    @JsonProperty("launches")
    private List<String> launches = new ArrayList<String>();
    @JsonProperty("status")
    private String status;
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("agency")
    public String getAgency() {
        return agency;
    }

    @JsonProperty("agency")
    public void setAgency(String agency) {
        this.agency = agency;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("wikipedia")
    public String getWikipedia() {
        return wikipedia;
    }

    @JsonProperty("wikipedia")
    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    @JsonProperty("launches")
    public List<String> getLaunches() {
        return launches;
    }

    @JsonProperty("launches")
    public void setLaunches(List<String> launches) {
        this.launches = launches;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

}