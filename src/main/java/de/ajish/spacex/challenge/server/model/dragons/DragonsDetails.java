package de.ajish.spacex.challenge.server.model.dragons;

import de.ajish.spacex.challenge.client.model.dragon.Dragon;

import java.util.Date;
import java.util.List;

public class DragonsDetails {

    private List<Dragon> dragons;

    private Date firstLaunchedDragon;

    public List<Dragon> getDragons() {
        return dragons;
    }

    public void setDragons(List<Dragon> dragons) {
        this.dragons = dragons;
    }

    public Date getFirstLaunchedDragon() {
        return firstLaunchedDragon;
    }

    public void setFirstLaunchedDragon(Date firstLaunchedDragon) {
        this.firstLaunchedDragon = firstLaunchedDragon;
    }

}
