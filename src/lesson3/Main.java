package lesson3;

import sun.awt.SunHints;

import java.awt.*;
import java.security.Key;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {


        ArrayList<String> fruitListWithDublicates = new ArrayList<>(Arrays.asList("Apple", "Pear", "Peach", "Banana", "Orange", "Tomato",
                "Lemon", "Melon", "Tomato", "Banana", "Orange", "Apple", "Pear", "Apple", "Banana", "Melon", "Peach",
                "Orange", "Banana", "Lemon")
        );
        ;

        Set<String> fruit = new HashSet<>(fruitListWithDublicates);
        System.out.println("Число уникальных элементов = " + fruit.size());


        }
    }


   /* public static void fruitNumber() {
        String[] englishFruitNames =
                {"Apple", "Pear", "Peach", "Banana", "Orange", "Tomato",
                        "Lemon", "Melon", "Tomato", "Banana", "Orange", "Apple", "Pear", "Apple", "Banana", "Melon", "Peach",
                        "Orange", "Banana", "Lemon"};

        Map<String, Integer> FruitNames = new HashMap<>();
        FruitNames.put("Apple", 3);
        FruitNames.put("Pear", 2);
        FruitNames.put("Peach", 2);
        FruitNames.put("Banana", 4);
        FruitNames.put("Melon", 2);
        FruitNames.put("Tomato", 2);
        FruitNames.put("Orange", 3);
        FruitNames.put("Lemon", 2);

        System.out.println(Map);
    }
}
/*
        Map<String, String> russianFruitNames = new TreeMap<>();
        russianFruitNames.put("Яблоко", "Apple");
        russianFruitNames.put("Груша", "Pear");
        russianFruitNames.put("Персик", "Peach");
        russianFruitNames.put("Томат", "Tomato");
        russianFruitNames.put("Банан", "Banana");
        russianFruitNames.put("Дыня", "Melon");
        russianFruitNames.put("Лимон", "Lemon");
        russianFruitNames.put("Апельсин", "Orange");

        Map<String, Long> fruitNameRussian = russianFruitNames.entrySet().stream().collect(Collectors.toMap(
                russianFruit -> russianFruit.getKey(), russianFruit -> Arrays.stream(englishFruitNames).filter(part -> part.equals(russianFruit.getValue())).count()));
        fruitNameRussian.forEach((k, v) -> System.out.println(k + ": " + v));
    }*/






