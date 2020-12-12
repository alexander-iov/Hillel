package lesson5.task2;

public class StringWork {
    public static void main(String[] args) {
        String word = "abcde";
        System.out.println(findCentralSymbol(word));
    }

    public static String findCentralSymbol(String word) {
        char[] chars = word.toCharArray();
        if (word.length() % 2 == 0) {
            word = chars[word.length() / 2 - 1] + "" + chars[word.length() / 2];
        } else {
            word = chars[word.length() / 2] + "";
        }
        return word;
    }

}
