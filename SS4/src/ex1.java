import java.util.Scanner;

public class ex1 {

    public static String normalizeSpaces(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        return s;
    }

    public static String capitalizeWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                result.append(
                        Character.toUpperCase(word.charAt(0))
                                + word.substring(1).toLowerCase()
                ).append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        String author = sc.nextLine();

        bookName = normalizeSpaces(bookName);
        author = normalizeSpaces(author);

        String bookNameFormatted = bookName.toUpperCase();
        String authorFormatted = capitalizeWords(author);

        System.out.println("\nChuỗi tổng hợp:");
        System.out.println(bookNameFormatted + " - Tác giả: " + authorFormatted);
    }
}
