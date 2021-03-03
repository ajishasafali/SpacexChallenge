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
        "material",
        "size_meters",
        "temp_degrees",
        "dev_partner"
})
public class HeatShield {

    @JsonProperty("material")
    private String material;
    @JsonProperty("size_meters")
    private Double sizeMeters;
    @JsonProperty("temp_degrees")
    private Integer tempDegrees;
    @JsonProperty("dev_partner")
    private String devPartner;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("material")
    public String getMaterial() {
        return material;
    }

    @JsonProperty("material")
    public void setMaterial(String material) {
        this.material = material;
    }

    @JsonProperty("size_meters")
    public Double getSizeMeters() {
        return sizeMeters;
    }

    @JsonProperty("size_meters")
    public void setSizeMeters(Double sizeMeters) {
        this.sizeMeters = sizeMeters;
    }

    @JsonProperty("temp_degrees")
    public Integer getTempDegrees() {
        return tempDegrees;
    }

    @JsonProperty("temp_degrees")
    public void setTempDegrees(Integer tempDegrees) {
        this.tempDegrees = tempDegrees;
    }

    @JsonProperty("dev_partner")
    public String getDevPartner() {
        return devPartner;
    }

    @JsonProperty("dev_partner")
    public void setDevPartner(String devPartner) {
        this.devPartner = devPartner;
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