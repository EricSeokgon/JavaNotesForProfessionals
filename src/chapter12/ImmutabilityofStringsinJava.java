package chapter12;

public class ImmutabilityofStringsinJava {
    public static void main(String[] args) {
        String string = "This is a Random String";
        String upper = string.toUpperCase();
        String lower = string.toLowerCase();
        System.out.println(string); // prints "This is a Random String"
        System.out.println(lower); // prints "this is a random string"
        System.out.println(upper); // prints "THIS IS A RANDOM STRING"
    }
}
