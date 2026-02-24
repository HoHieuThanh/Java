package btth;

abstract class Drink {
    protected int id;
    protected String name;
    protected double price;

    public Drink(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

     void displayInfo(){
        System.out.println("Mã: " + id);
        System.out.println("Tên: "+ name);
        System.out.println("Giá gốc: "+ price);
    }

    abstract double calculatePrice();

}
