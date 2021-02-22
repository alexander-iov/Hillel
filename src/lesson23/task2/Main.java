package lesson23.task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Class<Example> exampleClass = Example.class;
        Constructor<Example> declaredConstructor = exampleClass.getDeclaredConstructor();
        Example example = declaredConstructor.newInstance();
        Field[] declaredFields = exampleClass.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            int modifiers = declaredField.getModifiers();
            System.out.println(Modifier.toString(modifiers) + " " +
                    declaredField.getType() + " " +
                    declaredField.getName() + " " +
                    declaredField.get(example));
        }
    }
}
