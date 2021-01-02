package lesson9.task2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringsIO {
    public static void main(String[] args) {
        Map<String, Integer> dictionary = new HashMap<>();
        Map<String, Integer> newMap = new HashMap<>();
        int a = 0;
        while (a < 10) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку: ");
            String key = scanner.nextLine();
            if (dictionary.containsKey(key)) {
                Integer count = dictionary.get(key);
                count++;
                dictionary.put(key, count);
            } else {
                dictionary.put(key, 1);
            }
            a++;
        }
        getMaxCount(dictionary, newMap);

    }

    public static void getMaxCount(Map<String, Integer> dictionary, Map<String, Integer> newMap) {
        if (newMap.size() == 2) {
            System.out.println(newMap);
            return;
        }
        int maxValue = Collections.max(dictionary.values());
        String[] keys = dictionary.keySet().toArray(new String[0]);
        for (int i = 0; i < dictionary.size(); i++) {
            if (dictionary.get(keys[i]) == maxValue) {
                newMap.put(keys[i], maxValue);
                dictionary.remove(keys[i]);
                getMaxCount(dictionary, newMap);
            }
        }
    }
}
