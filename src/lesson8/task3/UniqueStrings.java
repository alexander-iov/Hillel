package lesson8.task3;

import java.util.*;

public class UniqueStrings {
    public static void main(String[] args) {
        String[] strings = {"Pipe", "Book", "Set", "Book", "Window", "List", "Pipe", "Sponge"};
        List<String> stringList = new ArrayList<>(Arrays.asList(strings));
        System.out.println(validation(stringList));
        System.out.println(listValidation(stringList));
    }

    public static List<String> validation(List<String> stringList) {
        Set<String> set = new HashSet<>(stringList);
        List<String> newList = new ArrayList<>(set);
        return newList;
    }

    public static List<String> listValidation(List<String> stringList) {
        List<String> newList = new ArrayList<>();
        for (String str : stringList) {
            if (!newList.contains(str)) {
                newList.add(str);
            }
        }
        return newList;
    }
}
