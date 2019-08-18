package sec02.verify.exam02;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
    public static void main(String[] args) throws Exception {
        String filePath = "src\\sec02\\verify\\exam02\\AddLineNumberExample.java";

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int rowNum = 0;
        String rowData;
        while ((rowData = bufferedReader.readLine()) != null) {
            System.out.println(++rowNum + " : " + rowData);
        }
        bufferedReader.close();
    }
}
