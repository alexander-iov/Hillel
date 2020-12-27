package lesson8.task3;

import java.util.*;

public class UniqueStrings {
    public static void main(String[] args) {
        String[] strings = {"Pipe", "Book", "Set", "Book", "Window", "List", "Pipe", "Sponge"};
        List<String> stringList = new ArrayList<>(Arrays.asList(strings));
        System.out.println(validation(stringList));
    }

    public static Set<String> validation(List<String> stringList){
        return new HashSet<>(stringList);
    }
}
