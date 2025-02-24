package com.day_05.junit.advancedjunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValidPassword("StrongP@ss1"));
        assertTrue(PasswordValidator.isValidPassword("Java1234"));
        assertTrue(PasswordValidator.isValidPassword("Secure9X"));
    }

    @Test
    void testPasswordTooShort() {
        assertFalse(PasswordValidator.isValidPassword("Short1"));
        assertFalse(PasswordValidator.isValidPassword("A1b"));
    }

    @Test
    void testPasswordWithoutUpperCase() {
        assertFalse(PasswordValidator.isValidPassword("password123"));
        assertFalse(PasswordValidator.isValidPassword("lowercase8"));
    }

    @Test
    void testPasswordWithoutDigit() {
        assertFalse(PasswordValidator.isValidPassword("NoDigitPass"));
        assertFalse(PasswordValidator.isValidPassword("UppercaseOnly"));
    }

    @Test
    void testNullOrEmptyPassword() {
        assertFalse(PasswordValidator.isValidPassword(null));
        assertFalse(PasswordValidator.isValidPassword(""));
    }
}
