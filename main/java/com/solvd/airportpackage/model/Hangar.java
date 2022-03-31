package java.com.solvd.airportpackage.model;

public class Hangar {
    private boolean isFull;
    private int numberOfPlanes;

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

    @Override
    public String toString() {
        return "Hangar{" +
                "isFull=" + isFull +
                ", numberOfPlanes=" + numberOfPlanes +
                '}';
    }
}
