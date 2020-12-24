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
        if (nums.length - index + 1 >= 0) {
            System.arraycopy(nums, index + 1 + 1, nums, index + 1, nums.length - index + 1);
        }
        nums[index] = value;
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
        Integer index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public boolean contains(int value) {
        boolean con = true;
        for (int num : nums) {
            con = num == value;
        }
        return con;
    }

    @Override
    public void removeValue(int value) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                nums[i] = nums[i + 1];
            }
        }
        nextIndex--;
    }

    @Override
    public void removeByIndex(int index) {
        if (nums.length - index >= 0) {
            System.arraycopy(nums, index + 1, nums, index, nums.length - index);
        }
    }

    @Override
    public IList subList(int fromIndex, int toIndex) {
        IList newList = new StackAndList();
        for (int i = fromIndex; i < toIndex; i++) {
            newList.add(i);
        }
        return newList;
    }

    @Override
    public int[] toArray() {
        int[] array = new int[10];
        System.arraycopy(nums, 0, array, 0, nums.length);
        return array;
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
