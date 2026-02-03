package HN_KS24_CNTT2_HoHieuThanh;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Student[] students = new Student[100];
    static int countStudent = 0;

    public static boolean isValidId(String id) {
        return id.startsWith("SV")
                && id.length() == 5
                && id.substring(2).matches("\\d{3}");
    }

    public static void addStudent() {
        int n;
        System.out.println("Nhập số lượng sinh viên muốn thêm: ");
        n = Integer.parseInt(sc.nextLine());
        for (int i=0; i<n; i++) {
            System.out.printf("Sinh viên thứ %d", i);
            String id;
            do {
                System.out.println("Nhập mã sinh viên (VD: SV001):");
                id = sc.nextLine();
                if (!isValidId(id)){
                    System.out.println("Mã sinh viên không hợp lệ, vui lòng nhập lại!");
                }
            } while (!isValidId(id));

            System.out.println("Nhập tên sinh viên:");
            String name = sc.nextLine();

            System.out.println("Nhập điểm sinh viên:");
            double score = Double.parseDouble(sc.nextLine());

            students[countStudent++] = new Student(id, name, score);
            System.out.printf("Them sinh viên thứ %d thanh cong", i);
        }
    }

    public static void display(){
        if (countStudent == 0){
            System.out.println("Danh sách rỗng!");
        }
        for (int i=0; i< countStudent; i++){
            System.out.println(students[i].toStrings());
        }
    }

    public static void searchByRank() {
        System.out.println("Nhập học lục cần tìm (Gioi/Kha/Trung Binh):");
        String keyword = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < countStudent; i++) {
            if (students[i].getRank(students[i].getScore()).equalsIgnoreCase(keyword)) {
                System.out.println(students[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên");
        }
    }

    public static void sortByScoreDesc() {
        for (int i = 0; i < countStudent - 1; i++) {
            for (int j = i + 1; j < countStudent; j++) {
                if (students[i].getScore() < students[j].getScore()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        System.out.println("Sắp xếp thành công");
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("""
                    \n===== QUẢN LÝ ĐIỂM SINH VIÊN =====
                    1. Nhập danh sách sinh viên\s
                    2. Hiển thị danh sách sinh viên\s
                    3. Tìm kiếm sinh viên theo Học lực\s
                    4. Sắp xếp theo học lực giảm dần
                    5. Thoát\s
                    ==================================
                    Chọn chức năng:\s
                    """);
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    addStudent();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    searchByRank();
                    break;
                case 4:
                    sortByScoreDesc();
                    break;
                default:
                    System.out.println("Không hợp lệ!");
            }
        }while (choice != 5);
    }
}
