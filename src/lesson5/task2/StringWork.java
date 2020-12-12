package lesson5.task2;

public class StringWork {
    public static void main(String[] args) {
        String word = "abcCde";
        System.out.println(findCentralSymbol(word));
        System.out.println(reverse(word));
    }

    public static String findCentralSymbol(String word) {
        if (word.length() % 2 == 0) {
            word = word.substring(word.length()/2-1 , word.length()/2+1);
        } else {
            word = word.substring(word.length()/2, word.length()/2 + 1);
        }
        return word;
    }

    public static String reverse(String str){
        String first = str.substring(0,str.length()/2);
        if (str.length()%2 == 0){
            String second = str.substring(str.length()/2);
            str = second + first;
        } else {
            String second = str.substring(str.length()/2 + 1);
            String third = str.substring(str.length()/2, str.length()/2 + 1);
            str = second + third + first;
        }
        return str;
    }

}
