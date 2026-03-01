package ex5;
import java.util.Comparator;

public class PatientComparator
        implements Comparator<Patient> {

    @Override
    public int compare(Patient p1, Patient p2) {

        if (p1.getSeverity() != p2.getSeverity()) {
            return p1.getSeverity()
                    - p2.getSeverity();
        }

        return p1.getArrivalTime()
                - p2.getArrivalTime();
    }
}
