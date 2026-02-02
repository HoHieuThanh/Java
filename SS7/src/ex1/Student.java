package ex1;

public class Student {
    // Bien instance (moi doi tuong co 1 ban rieng)
    private String studentId;
    private String studentName;

    // Bien static (dung chung cho tat ca doi tuong)
    public static int totalStudent = 0;

    // Constructor
    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        totalStudent++; // Moi lan tao student thi tang bien static
    }

    // Hien thi thong tin sinh vien
    public void displayInfo() {
        System.out.println("Ma SV: " + studentId);
        System.out.println("Ten SV: " + studentName);
        System.out.println("---------------------");
    }

    // Hien thi tong so sinh vien
    public static void displayTotalStudent() {
        System.out.println("Tong so sinh vien da tao: " + totalStudent);
    }
}