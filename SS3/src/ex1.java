import java.util.Scanner;

public class ex1 {
    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập mã số cho %d cuốn sách:\n", n);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Sách thứ %d: ", i + 1);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void displayBooks(int[] arr) {
        System.out.println("\nDanh sách mã sách:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Sách %d: %d\n", i + 1, arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách cần quản lý: ");
        int n = sc.nextInt();
        int[] books = addBookToLibraries(n);
        displayBooks(books);
    }
}
