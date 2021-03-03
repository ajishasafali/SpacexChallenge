package de.ajish.spacex.challenge.client.model.dragon;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "meters",
        "feet"
})
public class Diameter {

    @JsonProperty("meters")
    private Double meters;
    @JsonProperty("feet")
    private Integer feet;

    @JsonProperty("meters")
    public Double getMeters() {
        return meters;
    }

    @JsonProperty("meters")
    public void setMeters(Double meters) {
        this.meters = meters;
    }

    @JsonProperty("feet")
    public Integer getFeet() {
        return feet;
    }

    @JsonProperty("feet")
    public void setFeet(Integer feet) {
        this.feet = feet;
    }

}