package chapter11;

public class Stringpoolandheapstorage {
    public static void main(String[] args) {
        String a = "alpha";
        String b = "alpha";
        String c = new String("alpha");
//All three strings are equivalent
        System.out.println(a.equals(b) && b.equals(c));
//Although only a and b reference the same heap object
        System.out.println(a == b);
        System.out.println(a != c);
        System.out.println(b != c);
    }
}
