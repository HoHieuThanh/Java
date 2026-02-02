package ex1;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("SV01", "Nguyen Van A");
        Student s2 = new Student("SV02", "Tran Thi B");
        Student s3 = new Student("SV03", "Le Van C");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        Student.displayTotalStudent();
    }
}
