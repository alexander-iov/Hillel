package lesson15.task2;

import java.util.Objects;

public class Customer {

    private String name;
    private String location;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return name.equals(customer.name) &&
                location.equals(customer.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }
}
