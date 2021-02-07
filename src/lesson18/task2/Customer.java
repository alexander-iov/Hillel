package lesson18.task2;

public class Customer {
    private int Id;
    private static int countId;

    public Customer() {
        Id = ++countId;
    }
}
