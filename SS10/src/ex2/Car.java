package ex2;

class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println(brand + "Di chuyen bang dong co");
    }
}

