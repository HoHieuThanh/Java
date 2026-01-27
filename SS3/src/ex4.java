public class ex4 {
    public static void sortBooks(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void displayBooks(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] books = {345, 123, 789, 456, 234};

        System.out.println("Mảng trước khi sắp xếp:");
        displayBooks(books);
        sortBooks(books);
        System.out.println("Mảng sau khi sắp xếp:");
        displayBooks(books);
    }
}
