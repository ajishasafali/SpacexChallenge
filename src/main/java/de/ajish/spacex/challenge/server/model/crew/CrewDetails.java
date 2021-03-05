package de.ajish.spacex.challenge.server.model.crew;

import de.ajish.spacex.challenge.client.model.crew.CrewMember;
import de.ajish.spacex.challenge.client.model.dragon.Dragon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CrewDetails {

    private List<CrewMember> crewMembers;

    private Integer activeCrewFromList;

    private List<AgencyStrength> agencyStrengths = new ArrayList<>();

    public List<CrewMember> getCrewMembers() {
        return crewMembers;
    }

    public void setCrewMembers(List<CrewMember> crewMembers) {
        this.crewMembers = crewMembers;
    }

    public Integer getActiveCrewFromList() {
        return activeCrewFromList;
    }

    public void setActiveCrewFromList(Integer activeCrewFromList) {
        this.activeCrewFromList = activeCrewFromList;
    }

    public List<AgencyStrength> getAgencyStrengths() {
        return agencyStrengths;
    }

    public void setAgencyStrengths(List<AgencyStrength> agencyStrengths) {
        this.agencyStrengths = agencyStrengths;
    }

}
