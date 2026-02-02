package com.rikkeiedu.management;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Student[] students = new Student[100];
    static int countStudent = 0;

    public static void addStudent() {
        System.out.println("Nhap ten sinh vien:");
        String fullName = sc.nextLine();

        System.out.println("Nhap diem:");
        double score = Double.parseDouble(sc.nextLine());

        System.out.println("Nhap lop:");
        String className = sc.nextLine();

        students[countStudent++] = new Student(fullName, score, className);
        System.out.println("Them thanh cong");
    }

    public static void listStudent() {
        if (countStudent == 0) {
            System.out.println("Danh sach rong");
            return;
        }
        for (int i = 0; i < countStudent; i++) {
            students[i].display();
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("""
                    1. Them sinh vien
                    2. Hien thi danh sach
                    3. Tinh diem trung binh
                    0. Thoat
                    """);
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    listStudent();
                    break;
                case 3:
                    double avg = Student.avgScore(students, countStudent);
                    System.out.println("Diem trung binh: " + avg);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Khong hop le");
            }
        } while (choice != 0);
    }
}
