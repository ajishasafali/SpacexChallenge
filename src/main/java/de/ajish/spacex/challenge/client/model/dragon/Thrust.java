package de.ajish.spacex.challenge.client.model.dragon;

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

}