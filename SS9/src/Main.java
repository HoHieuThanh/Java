import re.demo.Animal;
import re.demo.Calculater;
import re.demo.Cat;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculater.sum(1,2));
        Animal[] animals = new Animal[3];
        Animal cat = new Cat();
        Animal animal = new Animal();
        cat.makeSound();


        Cat cat1 = new Cat();
        Animal animal1 = cat1;// Ép kiểu ngầm định: con -> cha
        Cat cat2 = (Cat) animal1;// Ép kiểu tường minh: cha -> con có thể lỗi
        if(animal1 instanceof Cat){
            Cat cat3 = (Cat) animal1;
        }
    }
}