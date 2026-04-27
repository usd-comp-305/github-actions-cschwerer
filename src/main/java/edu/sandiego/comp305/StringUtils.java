package edu.sandiego.comp305;

public class StringUtils {

    private StringUtils() { }

    public static String reverseString(final String forwardString) {

        final StringBuilder result = new StringBuilder();
        for (int i = forwardString.length() - 1; i >= 0; i--) {
            result.append(forwardString.charAt(i));
        }
        return result.toString();
    }
}
