package ex5;

// Interface tinh thuong KPI
interface BonusCalculator {

    double getBonus();
}

// Abstract class Employee
abstract class Employee {

    protected String name;
    protected double baseSalary;

    // constructor
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // phuong thuc truu tuong
    abstract double calculateSalary();

    // phuong thuc thong thuong (tai su dung)
    public void showInfo() {
        System.out.println("Nhan vien: " + name);
    }
}

// OfficeStaff - khong co thuong
class OfficeStaff extends Employee {

    public OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary;
    }
}

// Manager - co thuong KPI
class Manager extends Employee implements BonusCalculator {

    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    // override interface
    @Override
    public double getBonus() {
        return bonus;
    }

    // override abstract method
    @Override
    double calculateSalary() {
        return baseSalary + getBonus();
    }
}

// Main
public class Main {

    public static void main(String[] args) {

        Employee emp1 = new OfficeStaff("An", 8000000);

        Employee emp2 = new Manager("Binh", 15000000, 5000000);

        Employee[] employees = {emp1, emp2};

        System.out.println("===== Bang Luong =====");

        for (Employee e : employees) {

            e.showInfo();

            System.out.println("Luong co ban: " + e.baseSalary);

            // kiem tra co thuong hay khong
            if (e instanceof BonusCalculator) {

                BonusCalculator bonusEmp =
                        (BonusCalculator) e;

                System.out.println("Thuong KPI: "
                        + bonusEmp.getBonus());

            } else {
                System.out.println("Thuong KPI: Khong co");
            }

            System.out.println("Luong cuoi: "
                    + e.calculateSalary());

            System.out.println("--------------------");
        }
    }
}

