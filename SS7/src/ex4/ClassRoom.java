package ex4;

public class ClassRoom {

    private static double classFund = 0;
    private String studentName;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    public void contribute(double amount) {
        if (amount > 0) {
            classFund += amount;
            System.out.println(studentName + " da dong " + amount + " vao quy lop.");
        } else {
            System.out.println("So tien khong hop le!");
        }
    }

    public static void showClassFund() {
        System.out.println("Tong quy lop hien tai: " + classFund);
    }
}

