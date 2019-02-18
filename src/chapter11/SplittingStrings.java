package chapter11;

import java.util.regex.Pattern;

public class SplittingStrings {
    public static void main(String[] args) {
        String lineFromCsvFile = "Mickey;Bolton;12345;121216";
        String[] dataCells = lineFromCsvFile.split(";");
// Result is dataCells = { "Mickey", "Bolton", "12345", "121216"};

        String lineFromInput = "What do you need from me?";
        String[] words = lineFromInput.split("\\s+"); // one or more space chars
// Result is words = {"What", "do", "you", "need", "from", "me?"};

        String[] firstNames = "Mickey, Frank, Alicia, Tom".split(", ");
// Result is firstNames = {"Mickey", "Frank", "Alicia", "Tom"};

        "aaa.bbb".split("."); // This returns an empty array

        String s = "a|b|c";
        String regex = Pattern.quote("|");
        String[] arr = s.split(regex);

    }
}
