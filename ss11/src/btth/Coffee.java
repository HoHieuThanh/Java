package btth;

public class Coffee extends Drink{
    boolean hasMilk;

    public Coffee(int id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    @Override
    double calculatePrice(){
        if (hasMilk){
            return price + 5000;
        }
        return 0;
    };
    @Override
    void displayInfo(){
        displayInfo();
        if (hasMilk){
            System.out.println("Có sữa");
        }else System.out.println("Không sữa");
    };
}
