package chapter8;

import java.io.File;

public class PrintFileSizes {
    public static void main(String[] args) {
        for (String name : args) {
            File file = new File(name);
            System.out.println("Size of '" + file + "' is" + file.isFile());
        }
    }
}
