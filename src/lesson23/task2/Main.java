package lesson23.task2;

import lesson3.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
       info(new Example());
    }

    public static void info(Object object) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> aClass = object.getClass();
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        Object o = declaredConstructor.newInstance();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            int modifiers = declaredField.getModifiers();
            System.out.println(Modifier.toString(modifiers) + " " +
                    declaredField.getType() + " " +
                    declaredField.getName() + " " +
                    declaredField.get(o));
        }
    }
}
