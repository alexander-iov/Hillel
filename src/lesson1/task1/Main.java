package lesson1.task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random();
            System.out.println(nums[i]);
        }
        System.out.println(middle(nums));
    }

    public static int random() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public static double middle(int[] nums) {
        double sum = 0;
        for (int i : nums) {
            sum = +i;
        }
        return sum / nums.length;
    }


}
