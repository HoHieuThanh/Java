package ex3;

public class Main {

    public static void main(String[] args) {

        Duck duck = new Duck("Vit Co");
        Fish fish = new Fish("Ca Chep");

        System.out.println("=== Duck ===");
        duck.showName();
        duck.swim();
        duck.fly();

        System.out.println("\n=== Fish ===");
        fish.showName();
        fish.swim();

        // fish.fly(); // Loi compile - Ca khong bay duoc
    }
}

