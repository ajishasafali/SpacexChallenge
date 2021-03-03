package de.ajish.spacex.challenge.client.model.dragon;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "heat_shield",
        "launch_payload_mass",
        "launch_payload_vol",
        "return_payload_mass",
        "return_payload_vol",
        "pressurized_capsule",
        "trunk",
        "height_w_trunk",
        "diameter",
        "first_flight",
        "flickr_images",
        "name",
        "type",
        "active",
        "crew_capacity",
        "sidewall_angle_deg",
        "orbit_duration_yr",
        "dry_mass_kg",
        "dry_mass_lb",
        "thrusters",
        "wikipedia",
        "description",
        "id"
})
public class Dragon {

    @JsonProperty("heat_shield")
    private HeatShield heatShield;
    @JsonProperty("launch_payload_mass")
    private LaunchPayloadMass launchPayloadMass;
    @JsonProperty("launch_payload_vol")
    private LaunchPayloadVol launchPayloadVol;
    @JsonProperty("return_payload_mass")
    private ReturnPayloadMass returnPayloadMass;
    @JsonProperty("return_payload_vol")
    private ReturnPayloadVol returnPayloadVol;
    @JsonProperty("pressurized_capsule")
    private PressurizedCapsule pressurizedCapsule;
    @JsonProperty("trunk")
    private Trunk trunk;
    @JsonProperty("height_w_trunk")
    private HeightWTrunk heightWTrunk;
    @JsonProperty("diameter")
    private Diameter diameter;
    @JsonProperty("first_flight")
    private String firstFlight;
    @JsonProperty("flickr_images")
    private List<String> flickrImages = new ArrayList<String>();
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("crew_capacity")
    private Integer crewCapacity;
    @JsonProperty("sidewall_angle_deg")
    private Integer sidewallAngleDeg;
    @JsonProperty("orbit_duration_yr")
    private Integer orbitDurationYr;
    @JsonProperty("dry_mass_kg")
    private Integer dryMassKg;
    @JsonProperty("dry_mass_lb")
    private Integer dryMassLb;
    @JsonProperty("thrusters")
    private List<Thruster> thrusters = new ArrayList<Thruster>();
    @JsonProperty("wikipedia")
    private String wikipedia;
    @JsonProperty("description")
    private String description;
    @JsonProperty("id")
    private String id;

    @JsonProperty("heat_shield")
    public HeatShield getHeatShield() {
        return heatShield;
    }

    @JsonProperty("heat_shield")
    public void setHeatShield(HeatShield heatShield) {
        this.heatShield = heatShield;
    }

    @JsonProperty("launch_payload_mass")
    public LaunchPayloadMass getLaunchPayloadMass() {
        return launchPayloadMass;
    }

    @JsonProperty("launch_payload_mass")
    public void setLaunchPayloadMass(LaunchPayloadMass launchPayloadMass) {
        this.launchPayloadMass = launchPayloadMass;
    }

    @JsonProperty("launch_payload_vol")
    public LaunchPayloadVol getLaunchPayloadVol() {
        return launchPayloadVol;
    }

    @JsonProperty("launch_payload_vol")
    public void setLaunchPayloadVol(LaunchPayloadVol launchPayloadVol) {
        this.launchPayloadVol = launchPayloadVol;
    }

    @JsonProperty("return_payload_mass")
    public ReturnPayloadMass getReturnPayloadMass() {
        return returnPayloadMass;
    }

    @JsonProperty("return_payload_mass")
    public void setReturnPayloadMass(ReturnPayloadMass returnPayloadMass) {
        this.returnPayloadMass = returnPayloadMass;
    }

    @JsonProperty("return_payload_vol")
    public ReturnPayloadVol getReturnPayloadVol() {
        return returnPayloadVol;
    }

    @JsonProperty("return_payload_vol")
    public void setReturnPayloadVol(ReturnPayloadVol returnPayloadVol) {
        this.returnPayloadVol = returnPayloadVol;
    }

    @JsonProperty("pressurized_capsule")
    public PressurizedCapsule getPressurizedCapsule() {
        return pressurizedCapsule;
    }

    @JsonProperty("pressurized_capsule")
    public void setPressurizedCapsule(PressurizedCapsule pressurizedCapsule) {
        this.pressurizedCapsule = pressurizedCapsule;
    }

    @JsonProperty("trunk")
    public Trunk getTrunk() {
        return trunk;
    }

    @JsonProperty("trunk")
    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }

    @JsonProperty("height_w_trunk")
    public HeightWTrunk getHeightWTrunk() {
        return heightWTrunk;
    }

    @JsonProperty("height_w_trunk")
    public void setHeightWTrunk(HeightWTrunk heightWTrunk) {
        this.heightWTrunk = heightWTrunk;
    }

    @JsonProperty("diameter")
    public Diameter getDiameter() {
        return diameter;
    }

    @JsonProperty("diameter")
    public void setDiameter(Diameter diameter) {
        this.diameter = diameter;
    }

    @JsonProperty("first_flight")
    public String getFirstFlight() {
        return firstFlight;
    }

    @JsonProperty("first_flight")
    public void setFirstFlight(String firstFlight) {
        this.firstFlight = firstFlight;
    }

    @JsonProperty("flickr_images")
    public List<String> getFlickrImages() {
        return flickrImages;
    }

    @JsonProperty("flickr_images")
    public void setFlickrImages(List<String> flickrImages) {
        this.flickrImages = flickrImages;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("crew_capacity")
    public Integer getCrewCapacity() {
        return crewCapacity;
    }

    @JsonProperty("crew_capacity")
    public void setCrewCapacity(Integer crewCapacity) {
        this.crewCapacity = crewCapacity;
    }

    @JsonProperty("sidewall_angle_deg")
    public Integer getSidewallAngleDeg() {
        return sidewallAngleDeg;
    }

    @JsonProperty("sidewall_angle_deg")
    public void setSidewallAngleDeg(Integer sidewallAngleDeg) {
        this.sidewallAngleDeg = sidewallAngleDeg;
    }

    @JsonProperty("orbit_duration_yr")
    public Integer getOrbitDurationYr() {
        return orbitDurationYr;
    }

    @JsonProperty("orbit_duration_yr")
    public void setOrbitDurationYr(Integer orbitDurationYr) {
        this.orbitDurationYr = orbitDurationYr;
    }

    @JsonProperty("dry_mass_kg")
    public Integer getDryMassKg() {
        return dryMassKg;
    }

    @JsonProperty("dry_mass_kg")
    public void setDryMassKg(Integer dryMassKg) {
        this.dryMassKg = dryMassKg;
    }

    @JsonProperty("dry_mass_lb")
    public Integer getDryMassLb() {
        return dryMassLb;
    }

    @JsonProperty("dry_mass_lb")
    public void setDryMassLb(Integer dryMassLb) {
        this.dryMassLb = dryMassLb;
    }

    @JsonProperty("thrusters")
    public List<Thruster> getThrusters() {
        return thrusters;
    }

    @JsonProperty("thrusters")
    public void setThrusters(List<Thruster> thrusters) {
        this.thrusters = thrusters;
    }

    @JsonProperty("wikipedia")
    public String getWikipedia() {
        return wikipedia;
    }

    @JsonProperty("wikipedia")
    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

}