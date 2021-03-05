package de.ajish.spacex.challenge.client.mapper.crew;

import de.ajish.spacex.challenge.client.model.crew.CrewMember;
import de.ajish.spacex.challenge.client.model.crew.CrewQueryResponse;
import de.ajish.spacex.challenge.client.model.dragon.Dragon;
import de.ajish.spacex.challenge.server.model.crew.AgencyStrength;
import de.ajish.spacex.challenge.server.model.crew.CrewDetails;
import de.ajish.spacex.challenge.server.model.dragons.DragonsDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CrewMapper {

    private static final Logger logger = LogManager.getLogger(CrewMapper.class);
    /**
     * Hide constructor
     */
    private CrewMapper(){}

    /**
     * maps the crew response from spacexApi v4 to internal model
     * @param crewQueryResponse
     * @return
     */
    public static CrewDetails mapCrewToCrewDetails(final CrewQueryResponse crewQueryResponse){
        List<CrewMember> crewMembers = crewQueryResponse.getDocs();
        if( crewMembers!=null && !crewMembers.isEmpty()){
           CrewDetails crewDetails = new CrewDetails();
           crewDetails.setCrewMembers(crewMembers);
           mapCrewFacts(crewDetails);
           return crewDetails;
        }else{
            return null;
        }
    }

    private static void mapCrewFacts(CrewDetails crewDetails){
        HashMap<String, Integer> numberOfCrewMembersMap = new HashMap();
        int numberOfActiveCrewMembers = 0;
        for (CrewMember crewMember: crewDetails.getCrewMembers()) {
            if("active".equalsIgnoreCase(crewMember.getStatus())){
                numberOfActiveCrewMembers++;
            }
            String agencyname = crewMember.getAgency();
            if(numberOfCrewMembersMap.containsKey(agencyname)){
                int currentValue = numberOfCrewMembersMap.get(agencyname);
                numberOfCrewMembersMap.replace(agencyname, currentValue + 1);
            }else{
                numberOfCrewMembersMap.put(agencyname, 1);
            }
        }
        List<AgencyStrength> agencyStrengthList = new ArrayList<>();
        if(!numberOfCrewMembersMap.isEmpty()){
            for (Map.Entry<String, Integer> agencyStrengthPair: numberOfCrewMembersMap.entrySet()) {
                AgencyStrength agencyStrength = new AgencyStrength(agencyStrengthPair.getKey(), agencyStrengthPair.getValue());
                agencyStrengthList.add(agencyStrength);
            }
        }
        crewDetails.setAgencyStrengths(agencyStrengthList);
        crewDetails.setActiveCrewFromList(numberOfActiveCrewMembers);
    }
}
