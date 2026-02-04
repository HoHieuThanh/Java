package ex3;

public class Employee {
    protected String name;
    protected double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void displayInfo() {
        System.out.println("Ten: " + name);
        System.out.println("Luong co ban: " + basicSalary);
    }
}

