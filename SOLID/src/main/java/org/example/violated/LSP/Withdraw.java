package org.example.violated.LSP;

import java.util.Date;

// Subclass representing a withdrawal transaction
public class Withdraw extends Transaction {
    // Constructor to initialize withdrawal transaction details
    public Withdraw(double amount, double balance, Date date, String accountNumber) {
        super(amount, balance, date, accountNumber);
    }

    @Override
    public void deposit() {
        // Method left empty as it's not applicable to withdrawal transactions
    }

    // Overrides the withdrawal method from the base class
    // This method updates the balance by subtracting the withdrawal amount
    @Override
    public void withdrawal() {
        setBalance(getBalance() - getAmount());
    }

    @Override
    public void billPayment() {
        // Method left empty as it's not applicable to withdrawal transactions
    }

    @Override
    public void refund() {
        // Method left empty as it's not applicable to withdrawal transactions
    }
}
