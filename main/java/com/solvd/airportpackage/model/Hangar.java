package src.main.java.com.solvd.airportpackage.model;

import java.util.Set;

public class Hangar {
    private boolean isFull;
    private int numberOfPlanes;
    private Set<src.main.java.com.solvd.airportpackage.model.Plane> planesSet;

    public Hangar() {
    }

    public Hangar(boolean isFull, int numberOfPlanes) {
        this.isFull = isFull;
        this.numberOfPlanes = numberOfPlanes;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public int getNumberOfPlanes() {
        return numberOfPlanes;
    }

    public void setNumberOfPlanes(int numberOfPlanes) {
        this.numberOfPlanes = numberOfPlanes;
    }

    public Set<com.solvd.airportpackage.model.Plane> getPlanesSet() {
        return planesSet;
    }

    public void setPlanesSet(Set<com.solvd.airportpackage.model.Plane> planesSet) {
        this.planesSet = planesSet;
    }

    public void addPlane(com.solvd.airportpackage.model.Plane plane) {
        if (isFull == false) {
            this.planesSet.add(plane);
            this.numberOfPlanes++;
        }
    }


    @Override
    public String toString() {
        return "Hangar{" +
                "isFull=" + isFull +
                ", numberOfPlanes=" + numberOfPlanes +
                '}';
    }
}
