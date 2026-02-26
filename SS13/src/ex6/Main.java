package ex6;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    // tìm thuốc theo ID
    public static Medicine findMedicine(
            List<Medicine> list,
            String id){

        for (Medicine m : list){
            if (m.getDrugId().equals(id)){
                return m;
            }
        }
        return null;
    }


    // thêm thuốc
    public static void addMedicine(List<Medicine> list){

        System.out.println("Nhap ma thuoc:");
        String id = sc.nextLine();

        Medicine exist = findMedicine(list,id);

        System.out.println("Nhap ten thuoc:");
        String name = sc.nextLine();

        System.out.println("Nhap don gia:");
        double price = sc.nextDouble();

        System.out.println("Nhap so luong:");
        int quantity = sc.nextInt();
        sc.nextLine();

        if (exist != null){

            exist.addQuantity(quantity);

            System.out.println(
                    "Da cong don so luong!"
            );

        }else{

            list.add(
                    new Medicine(
                            id,name,price,quantity
                    )
            );

            System.out.println("Them moi thanh cong!");
        }
    }


    // chỉnh số lượng
    public static void adjustQuantity(
            List<Medicine> list){

        System.out.println("Nhap ma thuoc:");
        String id = sc.nextLine();

        Medicine m = findMedicine(list,id);

        if (m == null){

            System.out.println("Khong tim thay!");
            return;
        }

        System.out.println("Nhap so luong moi:");

        int newQuantity = sc.nextInt();
        sc.nextLine();

        if (newQuantity == 0){

            list.remove(m);

            System.out.println("Da xoa thuoc!");

        }else{

            m.setQuantity(newQuantity);

            System.out.println("Cap nhat thanh cong!");
        }
    }


    // xoá thuốc
    public static void removeMedicine(
            List<Medicine> list){

        System.out.println("Nhap ma thuoc:");
        String id = sc.nextLine();

        Medicine m = findMedicine(list,id);

        if (m == null){

            System.out.println("Khong tim thay!");
            return;
        }

        list.remove(m);

        System.out.println("Da xoa!");
    }


    // in hoá đơn
    public static void printInvoice(
            List<Medicine> list){

        if (list.isEmpty()){

            System.out.println("Don thuoc rong!");
            return;
        }

        double total = 0;

        System.out.println(
                "-----------------------------------------------------");

        System.out.printf(
                "%-8s %-15s %-10s %-8s %-10s\n",
                "Ma","Ten","Gia","SL","Thanh tien");

        System.out.println(
                "-----------------------------------------------------");

        for (Medicine m : list){

            double money = m.getTotalPrice();

            total += money;

            System.out.printf(
                    "%-8s %-15s %-10.0f %-8d %-10.0f\n",
                    m.getDrugId(),
                    m.getDrugName(),
                    m.getUnitPrice(),
                    m.getQuantity(),
                    money
            );
        }

        System.out.println(
                "-----------------------------------------------------");

        System.out.printf(
                "Tong tien: %.0f VND\n",
                total);

        // clear đơn sau khi in
        list.clear();

        System.out.println(
                "Don thuoc da duoc reset.");
    }



    // tìm thuốc rẻ
    public static void cheapMedicine(
            List<Medicine> list){

        boolean found = false;

        for (Medicine m : list){

            if (m.getUnitPrice() < 50000){

                System.out.println(
                        m.getDrugId() + " - "
                                + m.getDrugName()
                                + " : "
                                + m.getUnitPrice()
                );

                found = true;
            }
        }

        if (!found){

            System.out.println(
                    "Khong co thuoc re.");
        }
    }



    public static void main(String[] args) {

        List<Medicine> medicines =
                new ArrayList<>();

        while (true){

            System.out.println("\n===== MENU =====");

            System.out.println("1. Them thuoc");
            System.out.println("2. Dieu chinh so luong");
            System.out.println("3. Xoa thuoc");
            System.out.println("4. In hoa don");
            System.out.println("5. Tim thuoc gia re");
            System.out.println("0. Thoat");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){

                case 1:
                    addMedicine(medicines);
                    break;

                case 2:
                    adjustQuantity(medicines);
                    break;

                case 3:
                    removeMedicine(medicines);
                    break;

                case 4:
                    printInvoice(medicines);
                    break;

                case 5:
                    cheapMedicine(medicines);
                    break;

                case 0:
                    System.out.println("Tam biet!");
                    return;

                default:
                    System.out.println("Lua chon sai!");
            }
        }
    }
}
