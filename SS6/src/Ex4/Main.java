package Ex4;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("NV01", "Nguyen Van A");
        Employee e3 = new Employee("NV02", "Tran Thi B", BigDecimal.valueOf(15000000));

        e1.display();
        e2.display();
        e3.display();
    }
}
