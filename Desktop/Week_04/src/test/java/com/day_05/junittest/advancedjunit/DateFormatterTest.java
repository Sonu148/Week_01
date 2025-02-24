package com.day_05.junit.advancedjunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class DateFormatterTest {

    @Test
    void testValidDates() {
        assertEquals("15-02-2025", DateFormatter.formatDate("2025-02-15"));
        assertEquals("31-12-1999", DateFormatter.formatDate("1999-12-31"));
        assertEquals("27-07-2024", DateFormatter.formatDate("2024-07-27"));
    }

    @Test
    void testInvalidDates() {
        assertEquals("Invalid Date", DateFormatter.formatDate("invalid-date"));
        assertEquals("Invalid Date", DateFormatter.formatDate("15-02-2025")); // Incorrect format
        assertEquals("Invalid Date", DateFormatter.formatDate("2025/02/15")); // Incorrect separator
        assertEquals("Invalid Date", DateFormatter.formatDate("20250215"));   // Missing separators
    }
}
