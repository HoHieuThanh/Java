import java.util.Scanner;
import java.util.regex.Pattern;

public class btth_ss5 {
        static Scanner sc = new Scanner(System.in);
        static String[] idList = new String[100];
        static String regex = "^B\\d{7}$";
        static int n = 0;
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Quản lý Mã số Sinh Viên");
            System.out.println("1. Hiển thị");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    display();
                    break;
                case 2:
                    addId();
                    break;
                case 3:
                    updateId();
                    break;
                case 4:
                    deleteId();
                    break;
                case 5:
                    searchId();
                    break;
                default:
                    System.out.println("Không hợp lệ");
            }
        }while(choice != 6);
    }

    public static void display(){
        if (n==0) System.out.println("Danh sách trống");
        else{
            System.out.println("Danh sách mã sinh viên");
            for (int i=0; i<n; i++){
                System.out.println(idList[i]);
            }
        }
    }

    public static void addId(){
        String newIdInput ;
        System.out.println("Thêm mã sinh viên mới(VD: B2101234):");
        do {
            newIdInput= sc.nextLine();
            if (isRegex(newIdInput)){
                idList[n] = newIdInput;
                System.out.println("Thêm thành công");
                n++;
            }else System.out.println("Sai định dạng! Vui lòng nhập lại");
        }while (!isRegex(newIdInput));

    }
    public static boolean isRegex(String idInput){
        if (Pattern.matches(regex, idInput)){
            return true;
        }else return false;
    };
    public static void updateId() {
        System.out.print("Nhap vi tri can sua: ");
        int index = Integer.parseInt(sc.nextLine());

        if (index < 0 || index >= n) {
            System.out.println("Vi tri khong hop le!");
            return;
        }

        String newMSSV;
        do {
            System.out.print("Nhap MSSV moi: ");
            newMSSV = sc.nextLine();
            if (!Pattern.matches(regex, newMSSV)) {
                System.out.println("Sai dinh dang MSSV!");
            }
        } while (!Pattern.matches(regex, newMSSV));

        idList[index] = newMSSV;
        System.out.println("Cap nhat thanh cong!");
    }
    static void deleteId() {
        System.out.print("Nhap MSSV can xoa: ");
        String target = sc.nextLine();

        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (idList[i].equalsIgnoreCase(target)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Khong tim thay MSSV!");
            return;
        }

        for (int i = pos; i < n - 1; i++) {
            idList[i] = idList[i + 1];
        }
        n--;

        System.out.println("Xoa thanh cong!");
    }

    static void searchId() {
        System.out.print("Nhap chuoi can tim: ");
        String keyword = sc.nextLine().toLowerCase();

        boolean found = false;
        System.out.println("Ket qua tim kiem:");
        for (int i = 0; i < n; i++) {
            if (idList[i].toLowerCase().contains(keyword)) {
                System.out.println(i + ": " + idList[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong co MSSV phu hop.");
        }
    }
}
