package com.day_05.junit.basicjunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ExceptionHandlerTest {

    @Test
    void testDivision() {
        assertEquals(5, ExceptionHandler.divide(10, 2));
        assertEquals(-3, ExceptionHandler.divide(-9, 3));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            ExceptionHandler.divide(10, 0);
        });

        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
