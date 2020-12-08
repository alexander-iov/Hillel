package lesson4.task2;

public class Jewels {
    public static void main(String[] args) {
        String jewel = "aAb";
        String stone = "cacAcAabAAaafdasdaabbb";

        int num = numJewelsInStones(jewel, stone);
        System.out.println(num);
    }

    public static int numJewelsInStones(String jewel, String stone){
        char[] jewels = jewel.toCharArray();
        char[] stones = stone.toCharArray();
        int num = 0;
        for (char s : stones) {
            for (char j : jewels) {
                if (s == j) {
                    num++;
                }
            }
        }
        return num;
    }
}
