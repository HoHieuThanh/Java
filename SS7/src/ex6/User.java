package ex6;

public class User {
    public final int id;        // ID bat bien
    public String username;
    public String password;

    public User(int id, String username, String password) {
        this.id = id;           // final -> bat buoc gan tai day
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User[id=" + id + ", name=" + username + "]";
    }
}

