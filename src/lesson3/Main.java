package lesson3;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Иван", "Иванович");
        Employee employee2 = new Employee("Петр", "Петров", 3200.5);
        Employee employee3 = new Employee("Сергей", "Сергеев", 3200.5);

        Manager manager1 = new Manager("Василий", "Пупкин");
        Manager manager2 = new Manager("Андрей", "Павлов");

        Manager[] managers = new Manager[]{manager1, manager2};

        manager1.addSubordinate(employee1.getId());
        manager1.addSubordinate(employee2.getId());
        manager2.addSubordinate(employee3.getId());

        for (Manager manager : managers) {
            System.out.println("\nМенеджер " + manager.getFirstName() + "\nID подчиненных:");
            for (String id : manager.getSubordinateIds()) {
                if (id == null) {
                    break;
                }
                System.out.println(id);
            }
        }
    }
}
