package Ex5;

public class Book {
    private String bookId;
    private String bookName;
    private double price;

    public Book(String bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Ma sach: " + bookId);
        System.out.println("Ten sach: " + bookName);
        System.out.println("Gia: " + price);
    }
}
