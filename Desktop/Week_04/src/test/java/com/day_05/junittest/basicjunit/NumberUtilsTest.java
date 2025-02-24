package com.day_05.junit.basicjunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NumberUtilsTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void testIsEvenTrue(int number) {
        assertTrue(NumberUtils.isEven(number), number + " should be even.");
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    void testIsEvenFalse(int number) {
        assertFalse(NumberUtils.isEven(number), number + " should be odd.");
    }
}
