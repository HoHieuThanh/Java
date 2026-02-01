import java.util.Date;

public class Main {
    public static class Student {
        // Thuộc tin
        private String id;
        String name;
        Date dOB;
        String email;
        String phone;

        // Phương thức khởi tạo

        public Student (){
            // Dùng để thiết lập các giá trị ban đầu cho thuộc tính
            id = "SV001";
            name = "Nguyễn Văn A";
            dOB = new Date();
            email = "dcuasgcyh";
            phone = "02934r03497265";
        }

        public Student (String id, String name, String email, String phone){
            this.id = id;
            this.name = name;
            this.email = email;
            this.phone = phone;
            dOB = new Date();
        }

        void checkIn (){
            System.out.println("Student: " + name + " Check in: " + new Date());
        }



    }
    public static void main(String[] args) {
        Student student = new Student();
        student.id = "SV001";
        student.name = "Nguyễn Văn A";
        student.dOB = new Date();
        student.email = "nva@gmail.com";
        student.phone = "0987654321";

        student.checkIn();
        Student s2 = new Student("SV002", "Lê Văn B", "lvbtydgewsf", "9427274275");
        s2.checkIn();
    }
}