package lesson2;

/**
 * @author Alexander Iovsa
 * @version 2.0.0
 */

public class PassengerElevator extends Elevator {

    private final int minWeight = 40;

    PassengerElevator(int maxWeight, double speed) {
        super(maxWeight, speed);
    }

    @Override
    public boolean moveToFloor(int floor, int weight) {
        if (weight < minWeight) {
            System.out.println("Детям без родителей перевозка в лифте - запрещена!");
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
}
