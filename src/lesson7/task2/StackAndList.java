package lesson7.task2;

public class StackAndList implements IStack, IList {

    private int[] nums = new int[10];
    private int nextIndex = 0;

    @Override
    public void add(int i) {
        push(i);
    }

    @Override
    public void insert(int index, int value) {

    }

    @Override
    public void set(int index, int value) {
        nums[index] = value;
    }

    @Override
    public int size() {
        return nextIndex;
    }

    @Override
    public int capacity() {
        return nums.length;
    }

    @Override
    public int getByIndex(int index) {
        return nums[index];
    }

    @Override
    public Integer getIndexByValue(int value) {

        return null;
    }

    @Override
    public boolean contains(int value) {
        return false;
    }

    @Override
    public void removeValue(int value) {

    }

    @Override
    public void removeByIndex(int index) {

    }

    @Override
    public IList subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public void push(int value) {
        nums[nextIndex] = value;
        nextIndex++;
    }

    @Override
    public int pop() {
        int value = nums[nextIndex];
        nextIndex--;
        return value;
    }

    @Override
    public int peek() {
        return nums[nextIndex];
    }
}
