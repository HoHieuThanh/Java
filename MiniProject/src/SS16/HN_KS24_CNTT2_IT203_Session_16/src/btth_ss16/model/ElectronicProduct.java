package btth_ss16.model;

public class ElectronicProduct extends Product{
    int warrantyMonths;

    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateFinalPrice() {
        if(warrantyMonths > 12){
            return getPrice() + 1000000;
        }
        return getPrice();
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.printf(" %-5d |\n", warrantyMonths);
    }



}
