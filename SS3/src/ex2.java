import java.util.Scanner;

public class ex2 {
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = {"Sách 1","Sách 2","Sách 3","Sách 4","Sách 5"};
        System.out.print("Nhập tên sách cần tìm: ");
        String search = sc.nextLine();
        int index = searchBooks(books, search);
        if (index != -1) {
            System.out.printf("Tìm thấy '%s' tại vị trí: %d", search, index);
        } else {
            System.out.println("Sách không tồn tại");
        }
    }
}
