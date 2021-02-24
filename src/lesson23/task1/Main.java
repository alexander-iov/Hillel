package lesson23.task1;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String s = "Hello";
        s = String.class.getConstructor(String.class).newInstance("ABCDE");
        System.out.println(s);
    }
}
