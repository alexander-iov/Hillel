package lesson2;

/**
 * @author Alexander Iovsa
 * @version 2.0.0
 */

public class PassengerElevator extends Elevator{

    private final int MIN_WEIGHT = 40;

    PassengerElevator(int maxWeight, double speed){
        super(maxWeight, speed);
    }

    @Override
    public boolean moveToFloor(int floor, int weight) {
        if(weight >= getMaxWeight()) {
            System.out.println("Перегруз лифта");
            return false;
        }else if (weight < MIN_WEIGHT){
            System.out.println("Детям без родителей перевозка в лифте - запрещена!");
            return false;
        }else {
            if (floor == getFloor()) {
                System.out.println("Вы находитесь на том же этаже");
                return false;
            }else if (floor == 9999){
                System.out.println("9999 этаж? Вы серьёзно? На орбиту собрались,Илон?)");
                return false;
            }else {
                setFloor(floor);
                System.out.println("Отправляемся на этаж - " + floor);
                return true;
            }
        }
    }
}
