package lesson2;

public interface IElevator {
    int getMaxWeight();
    double getSpeed();
    boolean moveToFloor(int floor, int weight);
}
