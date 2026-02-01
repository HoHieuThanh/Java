package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(9.23, 2000, "SV01", "Nguyễn Văn A");
        Student s2 = new Student(4.3, 2001, "SV02", "Nguyễn Văn B");
        s1.display();
        s2.display();
    }
}
