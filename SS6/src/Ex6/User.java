package Ex6;

import java.util.regex.Pattern;

public class User {
    private int id;
    private String username;
    private String password;
    private String email;

    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        if (password != null && !password.trim().isEmpty()) {
            this.password = password;
        } else {
            System.out.println("Mat khau khong duoc rong!");
        }
    }

    public void setEmail(String email) {
        if (email != null && Pattern.matches(EMAIL_REGEX, email)) {
            this.email = email;
        } else {
            System.out.println("Email khong hop le!");
        }
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ********");
        System.out.println("---------------------");
    }
}
