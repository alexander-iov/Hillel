package lesson4.task1fix;

public class Car implements Movable{
    private int weight;
    private int price;

    @Override
    public void move() {
        System.out.println("Move");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void turnRight() {
        System.out.println("Turn Right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Turn Left");
    }
}
