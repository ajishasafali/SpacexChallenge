package de.ajish.spacex.challenge.client.mapper.dragon;

import de.ajish.spacex.challenge.client.model.dragon.Dragon;
import de.ajish.spacex.challenge.server.model.dragons.DragonsDetails;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DragonMapper {

    /**
     * Hide constructor
     */
    private DragonMapper(){}

    public static DragonsDetails mapDragonToDragonDetails(final List<Dragon> dragons){
        if( dragons!=null && !dragons.isEmpty()){
           DragonsDetails dragonsDetails = new DragonsDetails();
           dragonsDetails.setDragons(dragons);
           dragonsDetails.setFirstLaunchedDragon(mapFirstLaunchDate(dragons));
           return dragonsDetails;
        }else{
            return null;
        }
    }
    private static Date mapFirstLaunchDate(final List<Dragon> dragons){
        Date firstDate = null;
        Date tempDate = null;
        for (Dragon dragon: dragons) {
            try {
                tempDate = new SimpleDateFormat("yyyy-MM-dd").parse(dragon.getFirstFlight());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if(firstDate == null || firstDate.after(tempDate)){
                firstDate = tempDate;
            }
        }
        return firstDate;
    }
}
