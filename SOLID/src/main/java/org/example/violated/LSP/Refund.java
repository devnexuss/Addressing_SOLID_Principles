package org.example.violated.LSP;

import java.util.Date;

// Subclass representing a refund transaction
public class Refund extends Transaction{
    // Constructor to initialize refund transaction details
    public Refund(double amount, double balance, Date date, String accountNumber) {
        super(amount, balance, date, accountNumber);
    }

    @Override
    public void deposit() {
        // Method left empty as it's not applicable to refund transactions
    }

    @Override
    public void withdrawal() {
        // Method left empty as it's not applicable to refund transactions
    }

    @Override
    public void billPayment() {
        // Method left empty as it's not applicable to refund transactions
    }

    // Overrides the refund method from the base class
    // This method updates the balance by adding the refund amount
    @Override
    public void refund() {
        setBalance(getBalance() + getAmount());
    }
}
