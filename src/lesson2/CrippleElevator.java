package lesson2;

/**
 * @author Alexander Iovsa
 * @version 2.0.0
 */

public class CrippleElevator extends Elevator {

    private final int peopleCapacity = 1;

    CrippleElevator(int maxWeight, double speed) {
        super(maxWeight, speed);
    }

    private static int calcPeople() {
        return (int) (Math.random() * 3);
    }

    @Override
    public boolean moveToFloor(int floor, int weight) {
        if (peopleCapacity < calcPeople()) {
            System.out.println("Лифт только для одного человека");
            return false;
        } else {
            if (checkWeight(weight) & checkFloor(floor)) {
                setFloor(floor);
                System.out.println("Отправляемся на этаж - " + floor);
                return true;
            } else {
                return false;
            }
        }
    }
}
