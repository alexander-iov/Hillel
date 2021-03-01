package lesson2;

/**
 * @author Alexander Iovsa
 * @version 2.0.0
 */

public class ServiceElevator extends Elevator {

    String[] allItems = {"Bomb", "Washing Machine", "TV", "Bed", "Computer"};
    String explosiveItem = "Bomb";

    ServiceElevator(int maxWeight, double speed) {
        super(maxWeight, speed);
    }

    @Override
    public boolean moveToFloor(int floor, int weight) {
        if (explosiveItem.equals(generateRandomItem(allItems))) {
            System.out.println("Перевозка взрывоопасных предметов - запрещена!");
            return false;
        } else {
            if (checkFloor(floor) & checkWeight(weight)) {
                setFloor(floor);
                System.out.println("Отправляемся на этаж - " + floor);
                return true;
            } else {
                return false;
            }
        }

    }

    private String generateRandomItem(String[] items) {
        int index = (int) (Math.random() * items.length);
        return items[index];
    }
}
