package com.day_05.junit.basicjunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void testReverse() {
        assertEquals("olleh", StringUtils.reverse("hello"));
        assertEquals("madam", StringUtils.reverse("madam"));
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
        assertTrue(StringUtils.isPalindrome("racecar"));
        assertTrue(StringUtils.isPalindrome("Level")); // Case-insensitive check
        assertFalse(StringUtils.isPalindrome("hello"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"));
        assertEquals("JAVA", StringUtils.toUpperCase("java"));
        assertEquals("", StringUtils.toUpperCase(""));
    }
}
