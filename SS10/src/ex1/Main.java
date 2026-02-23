package ex1;

public class Main {
    public static void main(String[] args) {

        IShape circle = new Circle(5);

        IShape rectangle = new Rectangle(4, 6);

        System.out.println("Hinh Tron");
        System.out.println("Dien tich: " + circle.getArea());
        System.out.println("Chu vi: " + circle.getPerimeter());

        System.out.println("\nHinh Chu Nhat");
        System.out.println("Dien tich: " + rectangle.getArea());
        System.out.println("Chu vi: " + rectangle.getPerimeter());
    }
}
