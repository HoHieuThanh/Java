package btth_ss16.model;

public abstract class Product {
    private String id;
    private String name;
    private  double price;

    public Product() {
    }

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateFinalPrice();

    public void displayInfo(){
        System.out.printf("| %-4s | %-20s | %-10s |", this.id, this.name, this.price);
    }
}
