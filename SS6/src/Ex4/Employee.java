package Ex4;

import java.math.BigDecimal;

public class Employee {
    private String id;
    private String name;
    private BigDecimal salary;

    // Constructor không tham số
    public Employee(){
        id = "";
        name = "";
        salary = BigDecimal.valueOf(0);
    }

    // Constructor có id và name
    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
        salary = BigDecimal.valueOf(0);
    }

    // Constructor đầy đủ
    public Employee(String id, String name, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println(id + " - " + name + " - " + salary + "đ");
    }
}
