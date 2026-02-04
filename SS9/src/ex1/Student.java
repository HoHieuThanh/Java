package ex1;

public class Student extends Person {
    private String studentId;
    private double gpa;

    public Student(String fullName, int age, String studentId, double gpa) {
        super(fullName, age); // Goi constructor cha
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ma sinh vien: " + studentId);
        System.out.println("Diem trung binh: " + gpa);
    }
}
