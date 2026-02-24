package btth;

public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee(1, "Bạc sỉu", 30000, true);
        drinks[1] = new FruitJuice(2, "Nước cam", 40000, 10);
        for (int i =0; i<3; i++){
            if (drinks[i] != null){
                drinks[i].displayInfo();
                System.out.println("Thành tiền: " + drinks[i].calculatePrice());
                if(drinks[i] instanceof FruitJuice){
                    ((FruitJuice) drinks[i]).mix();
                }
                System.out.println("\n");
            }
        }
    }
}
