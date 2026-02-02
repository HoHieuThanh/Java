package com.rikkeiedu.management;

class Student {
    private static int autoId = 0;

    private final int id;
    private String fullName;
    private double score;
    private String className;

    public Student(String fullName, double score, String className) {
        this.id = ++autoId;
        this.fullName = fullName;
        this.score = score;
        this.className = className;
    }

    public double getScore() {
        return score;
    }

    public void display() {
        System.out.println("ID: " + id +" | Ten: " + fullName +" | Diem: " + score +" | Lop: " + className);
    }

    public static double avgScore(Student[] students, int count) {
        if (count == 0) return 0;

        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += students[i].getScore();
        }
        return sum / count;
    }
}
