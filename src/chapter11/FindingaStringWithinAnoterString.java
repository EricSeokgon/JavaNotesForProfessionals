package chapter11;

public class FindingaStringWithinAnoterString {
    public static void main(String[] args) {
        String str1 = "Hello Wrold";
        String str2 = "Hello";
        String str3 = "hello";

        System.out.println(str1.contains(str2));
        System.out.println(str1.contains(str3));

        String s = "this is a long sentence";
        int i = s.indexOf('i');
        int j = s.indexOf("long");
        int k = s.indexOf('z');
        int h = s.indexOf("LoNg");

        String str11 = "Hello World";
        String str22 = "wOr";
        str11.toLowerCase().contains(str22.toLowerCase());
        str11.toLowerCase().indexOf(str22.toLowerCase());

    }
}
