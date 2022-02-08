package lesson3;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {


        ArrayList<String> fruitListWithDublicates = new ArrayList<>(Arrays.asList("Apple", "Pear", "Peach", "Banana", "Orange", "Tomato",
                "Lemon", "WaterMelon", "Tomato", "Banana", "Orange", "PineApple", "Pear", "Apple", "Banana", "Melon", "Peach",
                "Orange", "Banana", "Grapes")
        );

        Set<String> fruit = new LinkedHashSet<>(fruitListWithDublicates);
        System.out.println("Число уникальных элементов = " + fruit.size());


    }
}

