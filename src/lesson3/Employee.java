package lesson3;

import java.util.UUID;

/**
 * @author Alexander Iovsa
 * @version 1.0.0
 */

public class Employee {

    private String id;
    private String firstName;
    private String lastName;
    private double salary;

    Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        id = UUID.randomUUID().toString();
    }

    Employee(String firstName, String lastName, double salary) {
        this(firstName, lastName);
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
}
