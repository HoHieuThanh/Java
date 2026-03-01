package ex5;

public class Patient {

    private String name;
    private int severity;
    private int arrivalTime;

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void display() {
        System.out.println(
                name +
                        " (Muc " + severity +
                        " - Den luc " + arrivalTime + ")"
        );
    }
}
