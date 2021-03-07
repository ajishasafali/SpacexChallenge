package de.ajish.spacex.challenge.client.model.dragon;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * generated using json schema.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "payload_volume"
})
public class PressurizedCapsule {

    @JsonProperty("payload_volume")
    private PayloadVolume payloadVolume;

    @JsonProperty("payload_volume")
    public PayloadVolume getPayloadVolume() {
        return payloadVolume;
    }

    @JsonProperty("payload_volume")
    public void setPayloadVolume(PayloadVolume payloadVolume) {
        this.payloadVolume = payloadVolume;
    }

}