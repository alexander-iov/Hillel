package lesson9.task1;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("a", 1);
        maps.put("b", 2);
        maps.put("c", 3);
        maps.put("d", 4);
        maps.put("e", 5);
        maps.put("f", 6);
        maps.put("g", 7);
        maps.put("h", 8);
        maps.put("j", 9);
        maps.put("k", 10);
        System.out.println(maps);
        System.out.println(reverse(maps));
    }

    public static Map<Integer, String> reverse(Map<String, Integer> map) {
        Map<Integer, String> newMaps = new HashMap<>();
        String[] keys = map.keySet().toArray(new String[0]);
        for (int i = 0; i < map.size(); i++) {
            newMaps.put(map.get(keys[i]), keys[i]);
        }
        return newMaps;
    }
}
