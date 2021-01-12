package lesson11.task1;

public class CatchLastChar {
    public static void main(String[] args) {
        String first = "kolko";
        String second = "polko";
        try {
            catchLastChar(first, second);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void catchLastChar(String first, String second) {
        String firstLastChar = first.substring(first.length() - 1);
        String secondLastChar = second.substring(second.length() - 1);
        if (firstLastChar.equals(secondLastChar)) {
            throw new IllegalArgumentException(firstLastChar);
        }
    }

}
