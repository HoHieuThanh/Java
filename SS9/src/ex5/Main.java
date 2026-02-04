package ex5;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new OfficeEmployee("An", 500000, 22),
                new ProductionEmployee("Binh", 120, 30000),
                new OfficeEmployee("Cuong", 600000, 20),
                new ProductionEmployee("Dung", 150, 28000)
        };

        double totalSalary = 0;

        for (Employee e : employees) {
            double salary = e.calculateSalary(); // Runtime goi dung class
            totalSalary += salary;

            System.out.println(
                    e.getName() + " - Luong: " + salary
            );
        }

        System.out.println("Tong luong cong ty: " + totalSalary);
    }
}
