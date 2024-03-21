package org.example.violated.LSP;

import java.util.Date;

// Abstract class representing a transaction
public abstract class Transaction {
    private double amount;
    private double balance;
    private Date date;
    private String accountNumber;

    // Constructor to initialize transaction details
    public Transaction(double amount, double balance, Date date, String accountNumber)  {
        this.amount = amount;
        this.balance = balance;
        this.date = date;
        this.accountNumber = accountNumber;
    }

    // Getters and setters for transaction fields
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Abstract methods representing different types of transactions
    public abstract void deposit();
    public abstract void withdrawal();
    public abstract void billPayment();
    public abstract void refund();

    // Method to format transaction data for display
    public String formatTransactionData() {
        return "\nAmount: " + amount + "\nDate: " + getDate() + "\nAccount Number: " + getAccountNumber();
    }
}

// LSP Violation:
// The deposit, withdrawal, billPayment, and refund methods defined in this class are not suitable for all subclasses.
// Subclasses may not need to implement all these methods, violating the Liskov Substitution Principle.
