package chapter25;

public class User {
    public final Long id;
    public final String username;
    public User(Long id, String username) {
        this.id = id;
        this.username = username;
    }
    @Override
    public String toString() {
        return String.format("%s:%d", username, id);
    }
}
