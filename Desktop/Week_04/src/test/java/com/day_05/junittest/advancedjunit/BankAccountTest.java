package com.day_05.junit.advancedjunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(1000.0);
    }

    @Test
    void testDeposit() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    void testWithdraw() {
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(1500.0);
        });
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    void testNegativeDeposit() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-100.0);
        });
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }

    @Test
    void testNegativeWithdrawal() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-100.0);
        });
        assertEquals("Withdrawal amount must be positive", exception.getMessage());
    }
}
