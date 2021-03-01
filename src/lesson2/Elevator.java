package lesson2;

/**
 * @author Alexander Iovsa
 * @version 2.0.0
 */

public abstract class Elevator implements IElevator {

    private final int maxWeight;
    private final double speed;
    private int floor = 0;

    Elevator(int maxWeight, double speed) {
        this.maxWeight = maxWeight;
        this.speed = speed;
    }

    @Override
    public int getMaxWeight() {
        return maxWeight;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int calculateWeight() {
        return (int) (30 + (Math.random() * (maxWeight + 100)));
    }

    public boolean checkWeight(int weight) {
        if (weight >= maxWeight) {
            System.out.println("Перегруз лифта");
            return false;
        } else {
            return true;
        }
    }

    public boolean checkFloor(int floor) {
        if (floor == this.floor) {
            System.out.println("Вы находитесь на том же этаже");
            return false;
        } else if (floor == 9999) {
            System.out.println("9999 этаж? Вы серьёзно? На орбиту собрались,Илон?)");
            return false;
        } else {
            return true;
        }
    }
}
