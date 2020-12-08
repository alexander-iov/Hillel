package lesson4.task1;

public interface Movable {

    default void move(){
        System.out.println("Еду");
    }
    void stop();
    void moveLeft();
    void moveRight();
}
