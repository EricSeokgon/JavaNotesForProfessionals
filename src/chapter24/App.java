package chapter24;

import java.util.List;

public class App {
    public static void main(String[] args) {
        MyPojoClass myPojoClass = new MyPojoClass();
        myPojoClass.addValueToIntList(42);

        List<Integer> list = myPojoClass.getIntList();
        list.add(69);
    }
}
