package de.ajish.spacex.challenge.client.model.dragon;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * generated using json schema.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "amount",
        "pods",
        "fuel_1",
        "fuel_2",
        "isp",
        "thrust"
})
public class Thruster {

    @JsonProperty("type")
    private String type;
    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("pods")
    private Integer pods;
    @JsonProperty("fuel_1")
    private String fuel1;
    @JsonProperty("fuel_2")
    private String fuel2;
    @JsonProperty("isp")
    private Integer isp;
    @JsonProperty("thrust")
    private Thrust thrust;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @JsonProperty("pods")
    public Integer getPods() {
        return pods;
    }

    @JsonProperty("pods")
    public void setPods(Integer pods) {
        this.pods = pods;
    }

    @JsonProperty("fuel_1")
    public String getFuel1() {
        return fuel1;
    }

    @JsonProperty("fuel_1")
    public void setFuel1(String fuel1) {
        this.fuel1 = fuel1;
    }

    @JsonProperty("fuel_2")
    public String getFuel2() {
        return fuel2;
    }

    @JsonProperty("fuel_2")
    public void setFuel2(String fuel2) {
        this.fuel2 = fuel2;
    }

    @JsonProperty("isp")
    public Integer getIsp() {
        return isp;
    }

    @JsonProperty("isp")
    public void setIsp(Integer isp) {
        this.isp = isp;
    }

    @JsonProperty("thrust")
    public Thrust getThrust() {
        return thrust;
    }

    @JsonProperty("thrust")
    public void setThrust(Thrust thrust) {
        this.thrust = thrust;
    }

}