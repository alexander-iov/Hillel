package lesson4.task1;

public class Car implements Movable{
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
