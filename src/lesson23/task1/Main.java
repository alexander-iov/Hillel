package lesson23.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class<Example> exampleClass = Example.class;
        Constructor<Example> declaredConstructor = exampleClass.getDeclaredConstructor();
        Example example = declaredConstructor.newInstance();
        Field s = exampleClass.getDeclaredField("s");
        s.setAccessible(true);
        s.set(example, "ABCDE");
        example.print();
    }
}
