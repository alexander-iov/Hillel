package lesson4.task1;

public class Car implements Movable{
    private int weight;
    private int price;

    @Override
    public void move() {
        System.out.println("Еду");
    }

    @Override
    public void stop() {
        System.out.println("Стою");
    }

    @Override
    public void moveLeft() {
        System.out.println("Поворачиваю налево");
    }

    @Override
    public void moveRight() {
        System.out.println("Поворачиваю направо");
    }
}
