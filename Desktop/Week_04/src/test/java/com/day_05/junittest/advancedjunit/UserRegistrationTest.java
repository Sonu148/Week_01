package com.day_05.junit.advancedjunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class UserRegistrationTest {

    @Test
    void testValidRegistration() {
        assertEquals("User registered successfully", UserRegistration.registerUser("JohnDoe", "john@example.com", "Password123"));
        assertEquals("User registered successfully", UserRegistration.registerUser("Alice", "alice123@mail.com", "HelloWorld9"));
    }

    @Test
    void testInvalidUsername() {
        Exception ex1 = assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("", "john@example.com", "Password123"));
        assertEquals("Invalid username: Cannot be empty", ex1.getMessage());

        Exception ex2 = assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser(null, "john@example.com", "Password123"));
        assertEquals("Invalid username: Cannot be empty", ex2.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception ex1 = assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "invalid-email", "Password123"));
        assertEquals("Invalid email format", ex1.getMessage());

        Exception ex2 = assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "john@com", "Password123"));
        assertEquals("Invalid email format", ex2.getMessage());
    }

    @Test
    void testInvalidPassword() {
        Exception ex1 = assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "john@example.com", "pass"));
        assertEquals("Password must have at least 8 characters, one uppercase letter, and one digit", ex1.getMessage());

        Exception ex2 = assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "john@example.com", "password123"));
        assertEquals("Password must have at least 8 characters, one uppercase letter, and one digit", ex2.getMessage());

        Exception ex3 = assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "john@example.com", "PASSWORD"));
        assertEquals("Password must have at least 8 characters, one uppercase letter, and one digit", ex3.getMessage());
    }
}
