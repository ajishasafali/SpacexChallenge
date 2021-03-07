package de.ajish.spacex.challenge.client.model.dragon;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * generated using json schema.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "trunk_volume",
        "cargo"
})
public class Trunk {

    @JsonProperty("trunk_volume")
    private TrunkVolume trunkVolume;
    @JsonProperty("cargo")
    private Cargo cargo;

    @JsonProperty("trunk_volume")
    public TrunkVolume getTrunkVolume() {
        return trunkVolume;
    }

    @JsonProperty("trunk_volume")
    public void setTrunkVolume(TrunkVolume trunkVolume) {
        this.trunkVolume = trunkVolume;
    }

    @JsonProperty("cargo")
    public Cargo getCargo() {
        return cargo;
    }

    @JsonProperty("cargo")
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

}