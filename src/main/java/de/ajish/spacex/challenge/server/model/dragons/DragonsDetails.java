package de.ajish.spacex.challenge.server.model.dragons;

import de.ajish.spacex.challenge.client.model.dragon.Dragon;

import java.util.List;

public class DragonsDetails {

    private List<Dragon> dragons;

    private String heaviestDragon;

    private Integer heaviestDragonMassInKg;

    private String firstFlownDragon;

    private Integer totalNumberOfCrewDragons;

    private Integer totalDeliverablePayloadMassInKg;

    public List<Dragon> getDragons() {
        return dragons;
    }

    public void setDragons(List<Dragon> dragons) {
        this.dragons = dragons;
    }

    public String getHeaviestDragon() {
        return heaviestDragon;
    }

    public void setHeaviestDragon(String heaviestDragon) {
        this.heaviestDragon = heaviestDragon;
    }

    public Integer getTotalNumberOfCrewDragons() {
        return totalNumberOfCrewDragons;
    }

    public void setTotalNumberOfCrewDragons(Integer totalNumberOfCrewDragons) {
        this.totalNumberOfCrewDragons = totalNumberOfCrewDragons;
    }

    public Integer getTotalDeliverablePayloadMassInKg() {
        return totalDeliverablePayloadMassInKg;
    }

    public void setTotalDeliverablePayloadMassInKg(Integer totalDeliverablePayloadMassInKg) {
        this.totalDeliverablePayloadMassInKg = totalDeliverablePayloadMassInKg;
    }

    public String getFirstFlownDragon() {
        return firstFlownDragon;
    }

    public void setFirstFlownDragon(String firstFlownDragon) {
        this.firstFlownDragon = firstFlownDragon;
    }

    public Integer getHeaviestDragonMassInKg() {
        return heaviestDragonMassInKg;
    }

    public void setHeaviestDragonMassInKg(Integer heaviestDragonMassInKg) {
        this.heaviestDragonMassInKg = heaviestDragonMassInKg;
    }

}
