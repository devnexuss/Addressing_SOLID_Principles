package org.example.violated.LSP;

import java.util.Date;

// Subclass representing a deposit transaction
public class Deposit extends Transaction {
    // Constructor to initialize deposit transaction details
    public Deposit(double amount, double balance, Date date, String accountNumber) {
        super(amount, balance, date, accountNumber);
    }

    // Overrides the deposit method from the base class
    // This method updates the balance by adding the deposit amount
    @Override
    public void deposit() {
        setBalance(getBalance() + getAmount());
    }

    // Overrides methods for other types of transactions, leaving them empty
    // This violates LSP as it introduces methods in the subclass that are not applicable to all transactions
    @Override
    public void withdrawal() {
        // Method left empty as it's not applicable to deposit transactions
    }

    @Override
    public void billPayment() {
        // Method left empty as it's not applicable to deposit transactions
    }

    @Override
    public void refund() {
        // Method left empty as it's not applicable to deposit transactions
    }
}