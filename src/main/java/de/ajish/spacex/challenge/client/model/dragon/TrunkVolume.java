package de.ajish.spacex.challenge.client.model.dragon;

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
        "cubic_meters",
        "cubic_feet"
})
public class TrunkVolume {

    @JsonProperty("cubic_meters")
    private Integer cubicMeters;
    @JsonProperty("cubic_feet")
    private Integer cubicFeet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cubic_meters")
    public Integer getCubicMeters() {
        return cubicMeters;
    }

    @JsonProperty("cubic_meters")
    public void setCubicMeters(Integer cubicMeters) {
        this.cubicMeters = cubicMeters;
    }

    @JsonProperty("cubic_feet")
    public Integer getCubicFeet() {
        return cubicFeet;
    }

    @JsonProperty("cubic_feet")
    public void setCubicFeet(Integer cubicFeet) {
        this.cubicFeet = cubicFeet;
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