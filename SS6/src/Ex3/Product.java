package Ex3;

public class Product {
    private String productId;
    private String productName;
    private double price;

    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        setPrice(price);
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Gia khong hop le! Gia phai > 0");
        }
    }

    public void displayInfo() {
        System.out.println("Ma SP: " + productId);
        System.out.println("Ten SP: " + productName);
        System.out.println("Gia ban: " + price);
    }
}
