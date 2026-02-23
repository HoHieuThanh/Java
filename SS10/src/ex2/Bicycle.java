package ex2;

class Bicycle extends Vehicle {

    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println(brand + "Di chuyen bang suc nguoi");
    }
}

