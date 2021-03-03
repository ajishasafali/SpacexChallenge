package de.ajish.spacex.challenge.client.model.company;

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
        "headquarters",
        "links",
        "name",
        "founder",
        "founded",
        "employees",
        "vehicles",
        "launch_sites",
        "test_sites",
        "ceo",
        "cto",
        "coo",
        "cto_propulsion",
        "valuation",
        "summary",
        "id"
})
public class Company {

    @JsonProperty("headquarters")
    private Headquarters headquarters;
    @JsonProperty("links")
    private Links links;
    @JsonProperty("name")
    private String name;
    @JsonProperty("founder")
    private String founder;
    @JsonProperty("founded")
    private Integer founded;
    @JsonProperty("employees")
    private Integer employees;
    @JsonProperty("vehicles")
    private Integer vehicles;
    @JsonProperty("launch_sites")
    private Integer launchSites;
    @JsonProperty("test_sites")
    private Integer testSites;
    @JsonProperty("ceo")
    private String ceo;
    @JsonProperty("cto")
    private String cto;
    @JsonProperty("coo")
    private String coo;
    @JsonProperty("cto_propulsion")
    private String ctoPropulsion;
    @JsonProperty("valuation")
    private Double valuation;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("headquarters")
    public Headquarters getHeadquarters() {
        return headquarters;
    }

    @JsonProperty("headquarters")
    public void setHeadquarters(Headquarters headquarters) {
        this.headquarters = headquarters;
    }

    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("founder")
    public String getFounder() {
        return founder;
    }

    @JsonProperty("founder")
    public void setFounder(String founder) {
        this.founder = founder;
    }

    @JsonProperty("founded")
    public Integer getFounded() {
        return founded;
    }

    @JsonProperty("founded")
    public void setFounded(Integer founded) {
        this.founded = founded;
    }

    @JsonProperty("employees")
    public Integer getEmployees() {
        return employees;
    }

    @JsonProperty("employees")
    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @JsonProperty("vehicles")
    public Integer getVehicles() {
        return vehicles;
    }

    @JsonProperty("vehicles")
    public void setVehicles(Integer vehicles) {
        this.vehicles = vehicles;
    }

    @JsonProperty("launch_sites")
    public Integer getLaunchSites() {
        return launchSites;
    }

    @JsonProperty("launch_sites")
    public void setLaunchSites(Integer launchSites) {
        this.launchSites = launchSites;
    }

    @JsonProperty("test_sites")
    public Integer getTestSites() {
        return testSites;
    }

    @JsonProperty("test_sites")
    public void setTestSites(Integer testSites) {
        this.testSites = testSites;
    }

    @JsonProperty("ceo")
    public String getCeo() {
        return ceo;
    }

    @JsonProperty("ceo")
    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    @JsonProperty("cto")
    public String getCto() {
        return cto;
    }

    @JsonProperty("cto")
    public void setCto(String cto) {
        this.cto = cto;
    }

    @JsonProperty("coo")
    public String getCoo() {
        return coo;
    }

    @JsonProperty("coo")
    public void setCoo(String coo) {
        this.coo = coo;
    }

    @JsonProperty("cto_propulsion")
    public String getCtoPropulsion() {
        return ctoPropulsion;
    }

    @JsonProperty("cto_propulsion")
    public void setCtoPropulsion(String ctoPropulsion) {
        this.ctoPropulsion = ctoPropulsion;
    }

    @JsonProperty("valuation")
    public Double getValuation() {
        return valuation;
    }

    @JsonProperty("valuation")
    public void setValuation(Double valuation) {
        this.valuation = valuation;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
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