package de.ajish.spacex.challenge.client.model.dragon;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * generated using json schema.
 */
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

}