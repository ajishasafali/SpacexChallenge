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
        "kg",
        "lb"
})
public class LaunchPayloadMass {

    @JsonProperty("kg")
    private Integer kg;
    @JsonProperty("lb")
    private Integer lb;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("kg")
    public Integer getKg() {
        return kg;
    }

    @JsonProperty("kg")
    public void setKg(Integer kg) {
        this.kg = kg;
    }

    @JsonProperty("lb")
    public Integer getLb() {
        return lb;
    }

    @JsonProperty("lb")
    public void setLb(Integer lb) {
        this.lb = lb;
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