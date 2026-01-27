public class ex3 {
    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max) {
                max = quantities[i];
            }
        }
        System.out.printf("Sách có số lượng nhiều nhất (%d):\n" , max);
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println("- " + names[i]);
            }
        }
    }

    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < min) {
                min = quantities[i];
            }
        }
        System.out.printf("Sách có số lượng ít nhất (%d):\n" , min);
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println("- " + names[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] names = {"Sách 1","Sách 2","Sách 3","Sách 4","Sách 5"};
        int[] quantities = {10, 5, 10, 3, 3};
        maxQuantityOfBooks(names, quantities);
        System.out.println();
        minQuantityOfBooks(names, quantities);
    }
}
