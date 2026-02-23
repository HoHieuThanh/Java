package ex6;

import java.util.*;

// Lop Product
class Product {

    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // hien thi thong tin
    public void showInfo() {
        System.out.println(name + " - " + price);
    }
}

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 20000000));
        products.add(new Product("Phone", 10000000));
        products.add(new Product("Mouse", 300000));
        products.add(new Product("Keyboard", 800000));

        // 1. Anonymous Class - Sap xep theo gia tang dan

        Collections.sort(products, new Comparator<Product>() {

            /*
             Anonymous Class bat buoc dung khi:

             - Can tao them bien noi bo.
             - Can viet nhieu method.
             - Can giu trang thai rieng.

             Lambda KHONG cho phep khai bao field rieng.
            */

            private int compareCount = 0; // vi du co thuoc tinh noi bo

            @Override
            public int compare(Product p1, Product p2) {

                compareCount++; // theo doi so lan so sanh

                return Double.compare(p1.price, p2.price);
            }
        });

        System.out.println("=== Sap xep theo gia (Anonymous Class) ===");

        for (Product p : products) {
            p.showInfo();
        }


        // 2. Lambda Expression - Sap xep theo ten A -> Z

        Collections.sort(products,
                (p1, p2) -> p1.name.compareTo(p2.name)
        );

        System.out.println("\n=== Sap xep theo ten A-Z (Lambda) ===");

        products.forEach(p -> p.showInfo());

    }
}
