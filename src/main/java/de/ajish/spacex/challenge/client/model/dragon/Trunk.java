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
        "trunk_volume",
        "cargo"
})
public class Trunk {

    @JsonProperty("trunk_volume")
    private TrunkVolume trunkVolume;
    @JsonProperty("cargo")
    private Cargo cargo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}