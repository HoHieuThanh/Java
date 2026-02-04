package ex5;

public class OfficeEmployee extends Employee {
    private double basicSalary;
    private int workingDays;

    public OfficeEmployee(String name, double basicSalary, int workingDays) {
        super(name);
        this.basicSalary = basicSalary;
        this.workingDays = workingDays;
    }

    @Override
    public double calculateSalary() {
        return basicSalary * workingDays;
    }
}
