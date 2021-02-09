package lesson18.task2;

public class Customer {
    private final int id;
    private static int countId;

    public Customer() {
        id = ++countId;
    }
}
