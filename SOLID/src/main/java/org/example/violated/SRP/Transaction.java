package org.example.violated.SRP;

import java.util.Date;

public class Transaction {
    // Fields representing transaction details
    private String type;
    private double amount;
    private double balance;
    private Date date;
    private String accountNumber;

    // Constructor to initialize transaction details
    public Transaction(String type, double amount, double balance, Date date, String accountNumber)  {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.date = date;
        this.accountNumber = accountNumber;
    }

    // Getters and setters for transaction fields
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    // Method to process the transaction
    // Violates SRP as it combines transaction processing with transaction data management
    public void processTransaction() {
        if (type.equals("deposit")) {
            setBalance(getBalance() + amount);
        } else if (type.equals("withdrawal")) {
            setBalance(getBalance() - amount);
        } else {
            throw new IllegalArgumentException("Invalid transaction type");
        }
    }

    // Method to format transaction data for display
    // Violates SRP as it mixes formatting logic with transaction data management
    public String formatTransactionData() {
        return "Transaction Type: " + type + "\nAmount: " + amount + "\nDate: " + getDate() + "\nAccount Number: " + getAccountNumber();
    }
}

// SRP Violation:
// The processTransaction method combines transaction processing logic with transaction data management.
// The formatTransactionData method mixes formatting logic with transaction data management.
