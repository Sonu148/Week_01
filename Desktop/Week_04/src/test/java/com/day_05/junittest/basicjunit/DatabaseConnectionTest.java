package com.day_05.junit.basicjunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class DatabaseConnectionTest {
    private DatabaseConnection dbConnection;

    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    void testConnectionIsEstablished() {
        assertTrue(dbConnection.isConnected());
    }

    @Test
    void testConnectionIsClosed() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected());
    }
}
