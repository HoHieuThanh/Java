package ex5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    // kiểm tra ID trùng
    public static boolean isExist(ArrayList<Patient> list , String id){

        for (Patient p : list){
            if (p.getId().equals(id)){
                return true;
            }
        }
        return false;
    }


    // tìm bệnh nhân theo ID
    public static Patient findPatient(ArrayList<Patient> list , String id){

        for (Patient p : list){
            if (p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }


    // hiển thị danh sách
    public static void display(ArrayList<Patient> list){

        if (list.isEmpty()){
            System.out.println("Danh sach rong.");
            return;
        }

        for (Patient p : list){
            System.out.println(p);
        }
    }


    public static void main(String[] args) {

        ArrayList<Patient> patients = new ArrayList<>();
        while (true){
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tiep nhan benh nhan");
            System.out.println("2. Cap nhat chan doan");
            System.out.println("3. Xuat vien");
            System.out.println("4. Sap xep danh sach");
            System.out.println("5. Hien thi danh sach");
            System.out.println("0. Thoat");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:

                    System.out.println("Nhap ID:");
                    String id = sc.nextLine();

                    if (isExist(patients , id)){
                        System.out.println("ID da ton tai!");
                        break;
                    }

                    System.out.println("Nhap ten:");
                    String name = sc.nextLine();

                    System.out.println("Nhap tuoi:");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nhap chan doan:");
                    String diagnosis = sc.nextLine();

                    patients.add(
                            new Patient(id,name,age,diagnosis)
                    );

                    System.out.println("Them thanh cong!");
                    break;


                case 2:

                    System.out.println("Nhap ID can sua:");
                    String updateID = sc.nextLine();

                    Patient updatePatient =
                            findPatient(patients , updateID);

                    if (updatePatient == null){
                        System.out.println("Khong tim thay!");
                    }
                    else{
                        System.out.println("Nhap chan doan moi:");
                        String newDiagnosis = sc.nextLine();

                        updatePatient.setDiagnosis(newDiagnosis);

                        System.out.println("Cap nhat thanh cong!");
                    }
                    break;

                    case 3:
                    System.out.println("Nhap ID xuat vien:");
                    String deleteID = sc.nextLine();
                    Patient deletePatient =
                            findPatient(patients , deleteID);
                    if (deletePatient == null){
                        System.out.println("Khong tim thay!");
                    }
                    else{
                        patients.remove(deletePatient);
                        System.out.println("Da xuat vien!");
                    }
                    break;
                case 4:
                    patients.sort(new Comparator<Patient>() {

                        @Override
                        public int compare(Patient p1, Patient p2) {
                            // tuổi giảm dần
                            if (p1.getAge() != p2.getAge()){
                                return p2.getAge() - p1.getAge();
                            }

                            return p1.getFullName()
                                    .compareToIgnoreCase(
                                            p2.getFullName()
                                    );
                        }
                    });
                    System.out.println("Sap xep thanh cong!");
                    break;
                case 5:
                    display(patients);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}

