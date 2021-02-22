package lesson23.task1;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Example> exampleClass = Example.class;
        Example example = new Example();
        Field s = exampleClass.getDeclaredField("s");
        s.setAccessible(true);
        s.set(example, "ABCDE");
        example.print();
    }
}
