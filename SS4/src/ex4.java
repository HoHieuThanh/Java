import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma the: ");
        String cardCode = sc.nextLine().trim();

        String fullRegex = "^[A-Z]{2}\\d{9}$";

        if (!cardCode.matches(fullRegex)) {

            if (!cardCode.matches("^[A-Z]{2}.*")) {
                System.out.println("Loi: Thieu tien to 2 chu cai viet hoa");
            }
            else if (!cardCode.matches("^[A-Z]{2}(19|20)\\d{2}.*")) {
                System.out.println("Loi: Nam khong hop le");
            }
            else if (!cardCode.matches("^[A-Z]{2}(19|20)\\d{2}\\d{5}$")) {
                System.out.println("Loi: Thieu 5 chu so cuoi");
            }
            else {
                System.out.println("Loi: Dinh dang ma the khong dung");
            }
        } else {
            System.out.println("Ma the hop le");
        }
    }
}
