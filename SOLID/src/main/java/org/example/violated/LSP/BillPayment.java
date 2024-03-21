package org.example.violated.LSP;

import java.util.Date;

// Subclass representing a bill payment transaction
public class BillPayment extends Transaction{
    // Constructor to initialize bill payment transaction details
    public BillPayment(double amount, double balance, Date date, String accountNumber) {
        super(amount, balance, date, accountNumber);
    }

    @Override
    public void deposit() {
        // Method left empty as it's not applicable to bill payment transactions
    }

    @Override
    public void withdrawal() {
        // Method left empty as it's not applicable to bill payment transactions
    }

    // Overrides the billPayment method from the base class
    // This method updates the balance by subtracting the bill payment amount
    @Override
    public void billPayment() {
        setBalance(getBalance() - getAmount());
    }

    @Override
    public void refund() {
        // Method left empty as it's not applicable to bill payment transactions
    }
}
