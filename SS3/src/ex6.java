public class ex6 {
    public static int[] mergeBooks(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] temp = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            int value;

            if (a[i] < b[j]) {
                value = a[i++];
            } else if (a[i] > b[j]) {
                value = b[j++];
            } else {
                value = a[i];
                i++;
                j++;
            }
            if (k == 0 || temp[k - 1] != value) {
                temp[k++] = value;
            }
        }

        while (i < a.length) {
            if (k == 0 || temp[k - 1] != a[i]) {
                temp[k++] = a[i];
            }
            i++;
        }

        while (j < b.length) {
            if (k == 0 || temp[k - 1] != b[j]) {
                temp[k++] = b[j];
            }
            j++;
        }

        int[] arrayMerge = new int[k];
        for (int x = 0; x < k; x++) {
            arrayMerge[x] = temp[x];
        }

        return arrayMerge;
    }

    public static void displayBooks(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        int[] arrayFirst = {1, 3, 5, 7, 9};
        int[] arraySecond = {2, 3, 5, 6, 8, 9, 10};

        System.out.print("Kho cũ: ");
        displayBooks(arrayFirst);

        System.out.print("Lô mới: ");
        displayBooks(arraySecond);

        int[] arrayMerge = mergeBooks(arrayFirst, arraySecond);

        System.out.print("Kho tổng (đã gộp & lọc trùng): ");
        displayBooks(arrayMerge);
    }
}
