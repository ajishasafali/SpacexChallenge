package de.ajish.spacex.challenge.client.mapper.dragon;

import de.ajish.spacex.challenge.client.model.dragon.Dragon;
import de.ajish.spacex.challenge.server.model.dragons.DragonsDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DragonMapper {

    private static final Logger logger = LogManager.getLogger(DragonMapper.class);
    /**
     * Hide constructor
     */
    private DragonMapper(){}

    /**
     * maps the dragon response from spacexApi v4 to internal model
     * @param dragons
     * @return
     */
    public static DragonsDetails mapDragonToDragonDetails(final List<Dragon> dragons){
        if( dragons!=null && !dragons.isEmpty()){
           DragonsDetails dragonsDetails = new DragonsDetails();
           dragonsDetails.setDragons(dragons);
           mapDragonFacts(dragonsDetails);
           return dragonsDetails;
        }else{
            return null;
        }
    }

    private static void mapDragonFacts(final DragonsDetails dragonsDetails){
        Date firstFlightDay = null;
        Date tempDay = null;
        String firstFlownDragon = null;
        Integer totalDeliverableMassInKg = 0;
        Integer totalNumberOfCrewDragons = 0;
        Integer heaviestDryMass = null;
        Integer tempDryMass = null;
        String heaviestDragon = null;
        for (Dragon dragon: dragonsDetails.getDragons()) {
            tempDryMass = dragon.getDryMassKg();
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date dateWithTime = simpleDateFormat.parse(dragon.getFirstFlight());
                tempDay= simpleDateFormat.parse(simpleDateFormat.format(dateWithTime));
            } catch (ParseException e) {
                logger.error("Exception while parsing first flight date: {}", dragon.getFirstFlight());
            }
            if(firstFlightDay == null || firstFlightDay.after(tempDay)){
                firstFlightDay = tempDay;
                firstFlownDragon = dragon.getName();
            }
            if(dragon.getLaunchPayloadMass() != null && dragon.getReturnPayloadMass() != null){
                totalDeliverableMassInKg += (dragon.getLaunchPayloadMass().getKg() - dragon.getReturnPayloadMass().getKg());
            }
            if(dragon.getCrewCapacity() != null && dragon.getCrewCapacity() != 0){
                totalNumberOfCrewDragons++;
            }
            if(tempDryMass!=null && (heaviestDryMass == null || (tempDryMass > heaviestDryMass))){
                heaviestDryMass = tempDryMass;
                heaviestDragon = dragon.getName();
            }

        }
        dragonsDetails.setHeaviestDragon(heaviestDragon);
        dragonsDetails.setHeaviestDragonMassInKg(heaviestDryMass);
        dragonsDetails.setFirstFlownDragon(firstFlownDragon);
        dragonsDetails.setTotalDeliverablePayloadMassInKg(totalDeliverableMassInKg);
        dragonsDetails.setTotalNumberOfCrewDragons(totalNumberOfCrewDragons);
    }
}
