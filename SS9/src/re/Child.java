package re;

public class Child extends Parent{
    public Child(double c) {
        super(c); // gọi constructer của lớp cha
    }

    // Có thể định nghĩa thêm các thuộc tính thêm
    // Thuộc tính
    public void sp(){
        System.out.println("c = "+super.c);
    }

    // Phương thức
    public void sayHi(){
        super.say();
    }

    // Reflection - Bỏ qua các quy tắc của phạm vi truy cập

    //Ghi đè phương thưc
    @Override
    public void say(){
        /*
        Điều kiện ghi đè
        - Phải kế thừa
        - Tên phuương thức và tham số phải giống nhau
        - Kiểu trả về của phuoương thức ở lớp con giống hoặc là super kiểu trả về của lớp cha
        - Phạm vi truy cập ở lớp con phải lớn hoặc bằng ở lớp cha
         */
        System.out.println("Hi");
    }
}
