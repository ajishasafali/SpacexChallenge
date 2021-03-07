package de.ajish.spacex.challenge.client.model.dragon;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * generated using json schema.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "kg",
        "lb"
})
public class ReturnPayloadMass {

    @JsonProperty("kg")
    private Integer kg;
    @JsonProperty("lb")
    private Integer lb;

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

}