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
        "solar_array",
        "unpressurized_cargo"
})
public class Cargo {

    @JsonProperty("solar_array")
    private Integer solarArray;
    @JsonProperty("unpressurized_cargo")
    private Boolean unpressurizedCargo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("solar_array")
    public Integer getSolarArray() {
        return solarArray;
    }

    @JsonProperty("solar_array")
    public void setSolarArray(Integer solarArray) {
        this.solarArray = solarArray;
    }

    @JsonProperty("unpressurized_cargo")
    public Boolean getUnpressurizedCargo() {
        return unpressurizedCargo;
    }

    @JsonProperty("unpressurized_cargo")
    public void setUnpressurizedCargo(Boolean unpressurizedCargo) {
        this.unpressurizedCargo = unpressurizedCargo;
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