package lesson3;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Петров", 5555535);
        hm.put("Сидоров", 5565636);
        hm.put("Туманов", 5575737);
        hm.put("Васильев", 5587737);

        for (Map.Entry<String, Integer> o : hm.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
        HashMap<String, Integer> hm2 = new HashMap<>();
        hm2.put("Сидоров", 5547737);
        hm2.put("Петров", 5585937);
        for (Map.Entry<String, Integer> o : hm2.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
    }
}

