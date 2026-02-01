package Ex1;

import java.util.Date;

public class Student {
    private String id;
    private String name;
    private int birthYear;
    private double averageScore;

    public Student(double averageScore, int birthYear, String id, String name) {
        this.averageScore = averageScore;
        this.birthYear = birthYear;
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println(id + " - " + name + " - " + birthYear + " - " + averageScore);
    }
}
