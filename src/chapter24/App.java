package chapter24;

import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        MyPojoClass myPojoClass = new MyPojoClass();
        myPojoClass.addValueToIntList(42);

        List<Integer> list = myPojoClass.getIntList();
        list.add(69);
        list.add(2);
        list.add(4);
        list.add(3);

        //Test #1
        System.out.println("using Iterator:");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            Integer i = itr.next();
            System.out.print(i + " ");
        }
        //Test #2
        System.out.println("\n\nusing for-each:");
        for (Integer data : list) {
            System.out.print(data + " ");
        }
    }
}
