package ex6;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(3),
                new Rectangle(4, 5),
                new Circle(),
                new Rectangle(6)
        };

        double totalArea = 0;

        for (Shape s : shapes) {
            double a = s.area();
            totalArea += a;
            System.out.println("Dien tich: " + a);
        }

        System.out.println("Tong dien tich: " + totalArea);
    }
}
