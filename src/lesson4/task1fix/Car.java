package lesson4.task1fix;

public class Car implements Movable {
    private int weight;
    private int price;

    public Car(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

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
