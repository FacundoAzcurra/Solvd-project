package main.java.com.solvd.airportpackage.model.person;

public class BaggageHandler extends main.java.com.solvd.airportpackage.model.person.Employee {
    private boolean isDriver;

    public BaggageHandler(int age, String sex, int document, String name, int employeeId, double wage) {
        super(age, sex, document, name, employeeId, wage);
    }

    public BaggageHandler(int age, String sex, int document, String name, int employeeId, double wage, boolean isDriver) {
        super(age, sex, document, name, employeeId, wage);
        this.isDriver = isDriver;
    }

    public boolean isDriver() {
        return isDriver;
    }

    public void setDriver(boolean driver) {
        isDriver = driver;
    }

    @Override
    public String toString() {
        return "BaggageHandler{" +
                "isDriver=" + isDriver +
                "} " + super.toString();
    }
}
