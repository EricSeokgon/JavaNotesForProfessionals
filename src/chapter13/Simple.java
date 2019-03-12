package chapter13;

import java.util.StringTokenizer;

public class Simple {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("apple ball cat dog"," ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
