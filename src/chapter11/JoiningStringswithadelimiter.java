package chapter11;

public class JoiningStringswithadelimiter {
    public static void main(String[] args) {
        String[] elements = { "foo", "bar", "foobar" };
        String singleString = String.join(" + ", elements);
    }
}
