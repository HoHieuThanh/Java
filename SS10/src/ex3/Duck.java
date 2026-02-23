package ex3;

class Duck extends Animal implements Swimmable, Flyable {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " dang boi tren mat nuoc");
    }

    @Override
    public void fly() {
        System.out.println(name + " dang bay tren bau troi");
    }
}
