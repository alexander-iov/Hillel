package lesson2;

/**
 * @author Alexander Iovsa
 * @version 2.0.0
 */

public class ServiceElevator extends Elevator {

    String[] allItems = { "Bomb", "Washing Machine", "TV", "Bed", "Computer" };
    String explosiveItem = "Bomb";

    ServiceElevator(int maxWeight, double speed) {
        super(maxWeight, speed);
    }

    @Override
    public boolean moveToFloor(int floor, int weight) {
        if(weight >= getMaxWeight()){
            System.out.println("Перегруз лифта");
            return false;
        }else {
            if (floor == getFloor()) {
                System.out.println("Вы находитесь на том же этаже");
                return false;
            }else if (floor == 9999) {
                System.out.println("9999 этаж? Вы серьёзно? На орбиту собрались,Илон?)");
                return false;
            }else if ( explosiveItem.equals(generateRandomItem( allItems ))){
                System.out.println("Перевозка взрывоопасных предметов - запрещена!");
                return false;
            }else {
                setFloor(floor);
                System.out.println("Отправляемся на этаж - " + floor);
                return true;
            }
        }
    }

    private String generateRandomItem(String[] items){
        int index = (int) ( Math.random()* items.length );
        return items[index];
    }
}
