package lesson7.task2;

public class StackAndList implements IStack, IList {

    private int[] numbers = new int[10];
    private int nextIndex = 0;

    @Override
    public void add(int i) {
        push(i);
    }

    @Override
    public void insert(int index, int value) {
        int[] newArray = new int[numbers.length + 1];
        if (index != 0) {
            if (index >= 0) System.arraycopy(numbers, 0, newArray, 0, index + 1);
            newArray[index] = value;
            System.arraycopy(numbers, index + 1, newArray, index + 1, newArray.length - index + 1);
        } else {
            newArray[index] = value;
            System.arraycopy(numbers, 0, newArray, index + 1, newArray.length);
        }
        System.arraycopy(newArray, 0, numbers, 0, numbers.length + 1);
    }

    @Override
    public void set(int index, int value) {
        numbers[index] = value;
    }

    @Override
    public int size() {
        return nextIndex;
    }

    @Override
    public int capacity() {
        return numbers.length;
    }

    @Override
    public int getByIndex(int index) {
        return numbers[index];
    }

    @Override
    public Integer getIndexByValue(int value) {
        Integer index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public boolean contains(int value) {
        boolean con = false;
        for (int num : numbers) {
            if (num == value) {
                con = true;
                break;
            }
        }
        return con;
    }

    @Override
    public void removeValue(int value) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                removeByIndex(i);
                break;
            }
        }
    }

    @Override
    public void removeByIndex(int index) {
        int[] temp = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numbers[index]) {
                continue;
            }
            temp[i] = numbers[i];
        }
        System.arraycopy(temp, 0, numbers, 0, temp.length);
        nextIndex--;
    }

    @Override
    public IList subList(int fromIndex, int toIndex) {
        IList newList = new StackAndList();
        for (int i = fromIndex; i < toIndex; i++) {
            newList.add(numbers[i]);
        }
        return newList;
    }

    @Override
    public int[] toArray() {
        int[] array = new int[10];
        System.arraycopy(numbers, 0, array, 0, numbers.length);
        return array;
    }

    @Override
    public void push(int value) {
        numbers[nextIndex] = value;
        nextIndex++;
    }

    @Override
    public int pop() {
        int value = numbers[nextIndex - 1];
        removeByIndex(nextIndex - 1);
        return value;
    }

    @Override
    public int peek() {
        return numbers[nextIndex];
    }
}
