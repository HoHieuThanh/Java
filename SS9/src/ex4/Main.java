package ex4;

import ex2.Animal;
import ex2.Dog;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.sound();
        //animal.action();  Lỗi biên dịch do Animal không có action();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.action();
        }
    }
}

