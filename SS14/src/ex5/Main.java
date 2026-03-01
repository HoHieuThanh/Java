package ex5;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Patient> triageQueue =
                new TreeSet<>(new PatientComparator());

        triageQueue.add(
                new Patient("Benh nhan A",3,800));

        triageQueue.add(
                new Patient("Benh nhan B",1,815));

        triageQueue.add(
                new Patient("Benh nhan C",1,805));

        triageQueue.add(
                new Patient("Benh nhan D",2,810));

        System.out.println("Thu tu xu ly cap cuu:");

        for (Patient p : triageQueue) {
            p.display();
        }
    }
}
