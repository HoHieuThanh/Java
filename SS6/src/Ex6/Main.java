package Ex6;

public class Main {
    public static void main(String[] args) {

        User u1 = new User(1, "thanhhh", "123456", "thanh@gmail.com");
        u1.displayInfo();

        User u2 = new User(2, "user2", "abc123", "email-sai");
        u2.displayInfo();

        User u3 = new User(3, "user3", "", "user3@mail.com");
        u3.displayInfo();

        u2.setEmail("user2@mail.com");
        u3.setPassword("newpass123");

        u2.displayInfo();
        u3.displayInfo();
    }
}
