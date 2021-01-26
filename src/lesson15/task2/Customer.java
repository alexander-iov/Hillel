package lesson15.task2;

public class Customer {

    private String name;
    private String location;
    private Order order;

    public Customer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void sendOrder() {
        System.out.println("An order was sent");
    }

    public void receiveOrder() {
        System.out.println("An order was received");
    }

}
