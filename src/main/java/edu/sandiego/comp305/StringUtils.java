package edu.sandiego.comp305;

public class StringUtils {

    public static String reverseString(String forwardString) {
        if (forwardString.isEmpty()) {
            return forwardString;
        }

        if (forwardString.length() == 1) {
            return  forwardString;
        }
        return null;
    }
}
