package lesson3;

public class Manager extends Employee {

    private final int DEFAULT_CAPACITY = 10;
    private String[] subordinateIds = new String[DEFAULT_CAPACITY];
    private int nextIndex;

    Manager(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String[] getSubordinateIds() {
        return subordinateIds;
    }

    public void addSubordinate(String id) {
        subordinateIds[nextIndex] = id;
        nextIndex++;
        if (nextIndex == subordinateIds.length) {
            addCapacity();
        }
    }

    private void addCapacity(){
        subordinateIds = new String[subordinateIds.length * 2];
        System.arraycopy(subordinateIds, 0, subordinateIds,
                0, subordinateIds.length);
    }

}