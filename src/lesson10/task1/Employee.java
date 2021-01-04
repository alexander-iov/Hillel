package lesson10.task1;

/**
 * @author Alexander Iovsa
 * @version 1.0.1
 */

public class Employee implements Comparable<Employee>{

    private static int idsCounter;
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        id = ++idsCounter;
    }

    Employee(String firstName, String lastName, double salary) {
        this(firstName, lastName);
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.id < o.id){
            return -1;
        }else if (this.id == o.id){
            return 0;
        }
        return 1;
    }
}
