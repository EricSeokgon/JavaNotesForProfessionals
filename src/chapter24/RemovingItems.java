package chapter24;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingItems {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        //잘못된 방법 1
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
            if ("Apple".equals(fruits.get(i))) {
                fruits.remove(i);
            }
        }

        //잘못된 방법 2
        for (String fruit : fruits) {
            System.out.println(fruit);
            if ("Apple".equals(fruit)) {
                fruits.remove(fruit);
            }
        }

        //올바른 방법
        Iterator<String> fruitIterator = fruits.iterator();
        while (fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            System.out.println(fruit);
            if ("Apple".equals(fruit)) {
                fruitIterator.remove();
            }
        }

        fruits.set(0, "Watermelon");
        while (fruitIterator.hasNext()) {
            System.out.println(fruitIterator.next());
        }

    }
}
