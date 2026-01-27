import java.util.Scanner;

public class ex5 {
    public static int deleteBook(int[] arr, int n, int bookId) {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Không tìm thấy mã sách cần xóa.");
            return n;
        }

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Đã xóa sách mã: " + bookId);
        return n - 1;
    }

    public static void displayBooks(int[] arr, int n) {
        if (n == 0) {
            System.out.println("Kho sách rỗng.");
            return;
        }

        System.out.printf("Kho sách sách hiện tại (%d cuốn): ", n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] books = {101, 102, 103, 104, 105};
        int n = books.length;

        displayBooks(books, n);

        while (n > 0) {
            System.out.print("\nNhập mã sách cần xóa (0 để thoát): ");
            int bookId = sc.nextInt();
            if (bookId == 0) {
                break;
            }
            n = deleteBook(books, n, bookId);
            displayBooks(books, n);
        }
    }
}
