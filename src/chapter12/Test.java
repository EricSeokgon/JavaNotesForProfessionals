package chapter12;

public class Test {
    public static void main(String args[])
    {
        String str = "study";
        str.concat("tonight");
        System.out.println(str); // Output: study
        StringBuffer strB = new StringBuffer("study");
        strB.append("tonight");
        System.out.println(strB); // Output: studytonight
    }
}
