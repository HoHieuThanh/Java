package ex4;

public class Main {

    public static void main(String[] args) {

        EmergencyRoom room = new EmergencyRoom();

        room.patientCheckIn("A");

        room.patientCheckIn("B");

        room.emergencyCheckIn("C");

        room.treatPatient();

        room.treatPatient();

        room.treatPatient();
    }
}

