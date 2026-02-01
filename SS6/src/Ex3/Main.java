package Ex3;

public class Main {
    public static void main(String[] args) {

        Product p = new Product("SP01", "Laptop", 15000000);
        p.displayInfo();
        p.setPrice(-5000);
        p.displayInfo();
    }
}
