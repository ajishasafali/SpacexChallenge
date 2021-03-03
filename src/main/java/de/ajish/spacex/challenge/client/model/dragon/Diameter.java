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
        "meters",
        "feet"
})
public class Diameter {

    @JsonProperty("meters")
    private Double meters;
    @JsonProperty("feet")
    private Integer feet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}