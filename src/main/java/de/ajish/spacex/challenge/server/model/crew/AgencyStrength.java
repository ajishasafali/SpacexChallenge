package de.ajish.spacex.challenge.server.model.crew;

/**
 * Internal model for Agency strength used in crew info
 */
public class AgencyStrength {

    public AgencyStrength(final String agencyName, final Integer numberOfCrew) {
        this.agencyName =  agencyName;
        this.numberOfCrew =  numberOfCrew;
    }

    private String agencyName;

    private Integer numberOfCrew;

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public Integer getNumberOfCrew() {
        return numberOfCrew;
    }

    public void setNumberOfCrew(Integer numberOfCrew) {
        this.numberOfCrew = numberOfCrew;
    }

}
