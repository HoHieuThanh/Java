package ex3;

abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("Ten: " + name);
    }
}

