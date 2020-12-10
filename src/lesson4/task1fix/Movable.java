package lesson4.task1fix;

public interface Movable {
    default void move(){
        System.out.println("Move");
    }
    void stop();
    void turnRight();
    void turnLeft();
}
