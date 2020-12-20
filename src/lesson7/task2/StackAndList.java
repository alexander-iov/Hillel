package lesson7.task2;

public class StackAndList implements IStack, IList {

    private int[] stack = new int[10];
    private int topOfStack = -1;

    private int[] list = new int[10];
    private int nextIndex = 0;

    @Override
    public void add(int i) {
        list[nextIndex] = i;
        nextIndex++;
    }

    @Override
    public void insert(int index, int value) {

    }

    @Override
    public void set(int index, int value) {
        list[index] = value;
    }

    @Override
    public int size() {
        return nextIndex;
    }

    @Override
    public int capacity() {
        return list.length;
    }

    @Override
    public int getByIndex(int index) {
        return list[index];
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
        topOfStack++;
        stack[topOfStack] = value;
    }

    @Override
    public int pop() {
        int value = stack[topOfStack];
        topOfStack--;
        return value;
    }

    @Override
    public int peek() {
        return stack[topOfStack];
    }
}
