package de.ajish.spacex.challenge.client.model.dragon;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * generated using json schema.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "meters",
        "feet"
})
public class HeightWTrunk {

    @JsonProperty("meters")
    private Double meters;
    @JsonProperty("feet")
    private Double feet;

    @JsonProperty("meters")
    public Double getMeters() {
        return meters;
    }

    @JsonProperty("meters")
    public void setMeters(Double meters) {
        this.meters = meters;
    }

    @JsonProperty("feet")
    public Double getFeet() {
        return feet;
    }

    @JsonProperty("feet")
    public void setFeet(Double feet) {
        this.feet = feet;
    }

}