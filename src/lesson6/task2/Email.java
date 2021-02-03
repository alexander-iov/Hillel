package lesson6.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        String input = "sasha@gmail.com";
        System.out.println(findEmail(input));
    }

    public static String findEmail(String input) {
        String regex = "(.*)(@.*)";
        Matcher matcher = Pattern.compile(regex).matcher(input);
        String email = null;
        while (matcher.find()) {
            email = matcher.group(2);
        }
        if (email == null) {
            return "no match found";
        }
        return email;
    }
}
