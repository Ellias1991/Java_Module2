package lesson3;

import java.util.*;

public class Count {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Tomato");
        fruits.add("Lemon");
        fruits.add("Melon");
        fruits.add("Tomato");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Melon");
        fruits.add("Peach");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Lemon");
        fruits.add("Banana");
        fruits.add("Peach");
        Map<String, Integer> map = new HashMap<String, Integer>();
        {
            for (String string : fruits) {
                if (map.keySet().contains(string)) {
                    map.put(string, map.get(string) + 1);
                } else {
                    map.put(string, 1);
                }
            }
            System.out.println(map);
        }
    }
}
