package lesson2;

/**
 * @author Alexander Iovsa
 * @version 2.0.0
 */

public class ElevatorMaster {
    public static void main(String[] args) {

        int[] floors = {-3, 9999, 8, 1};

        Elevator passenger = new PassengerElevator(500, 5);
        Elevator service = new ServiceElevator(1500, 3);
        Elevator cripple = new CrippleElevator(250, 4);

        Elevator[] elevators = {passenger, service, cripple};

        for (Elevator elevator : elevators){
            for (int floor : floors){
                elevator.moveToFloor(floor, elevator.calculateWeight());
            }
        }
    }
}
