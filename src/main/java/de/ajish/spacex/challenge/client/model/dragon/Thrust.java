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
        "kN",
        "lbf"
})
public class Thrust {

    @JsonProperty("kN")
    private Integer kN;
    @JsonProperty("lbf")
    private Integer lbf;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("kN")
    public Integer getKN() {
        return kN;
    }

    @JsonProperty("kN")
    public void setKN(Integer kN) {
        this.kN = kN;
    }

    @JsonProperty("lbf")
    public Integer getLbf() {
        return lbf;
    }

    @JsonProperty("lbf")
    public void setLbf(Integer lbf) {
        this.lbf = lbf;
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