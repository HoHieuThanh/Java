package Ex2;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account("thanhhh", "123456", "thanh@gmail.com");
        acc.displayInfo();
        acc.changePassword("newpass");
        acc.displayInfo();
    }
}
