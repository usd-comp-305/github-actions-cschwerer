package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    void reverseEmptyString() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    void reverseSingleCharacter() {
        assertEquals("a", StringUtils.reverseString("a"));
    }

    @Test
    void reverseNormalString() {
        assertEquals("doof", StringUtils.reverseString("food"));
    }

    @Test
    void reverseBackwardString() {
        assertEquals("food", StringUtils.reverseString("doof"));
    }


}
