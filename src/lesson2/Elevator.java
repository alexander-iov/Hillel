package lesson2;

/**
 * @author Alexander Iovsa
 * @version 2.0.0
 */

public abstract class Elevator implements IElevator{

    private final int maxWeight;
    private final double speed;
    private int floor = 0;

    Elevator(int maxWeight, double speed){
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

    public void setFloor(int floor){
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public int calculateWeight(){
        return (int) ( 30 +( Math.random() * ( maxWeight + 100 )));
    }
}
