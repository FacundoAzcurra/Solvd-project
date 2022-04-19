package com.solvd.airportpackage.model;

import java.util.Set;

public class Hangar {
    private boolean isFull;
    private int numberOfPlanes;
    private Set<Plane> planesSet;

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

    public Set<Plane> getPlanesSet() {
        return planesSet;
    }

    public void setPlanesSet(Set<Plane> planesSet) {
        this.planesSet = planesSet;
    }

    public void addPlane(Plane plane) {
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
