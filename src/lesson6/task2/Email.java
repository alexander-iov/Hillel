package lesson6.task2;

public class Email {
    public static void main(String[] args) {
        String input = "dsafbkjsbfkj@dnasdad.ru";
        String regex = "(.*)@(.*)";
        System.out.println(findEmail(input,regex));
    }
    public static String findEmail(String input, String regex){
        String output;
        if (input.matches(regex)){
            output = input.substring(input.indexOf("@") + 1 );
            return output;
        } else {
            return "not found email";
        }
    }
}
