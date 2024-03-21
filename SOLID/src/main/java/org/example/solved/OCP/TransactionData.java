package org.example.solved.OCP;

import java.util.Date;

public class TransactionData {
    // Fields representing transaction details
    private double amount;
    private double balance;
    private Date date;
    private String accountNumber;

    // Constructor to initialize transaction details
    public TransactionData(double amount, double balance, Date date, String accountNumber)  {
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

    // Method to format transaction data for display
    public String formatTransactionData() {
        return "\nAmount: " + amount + "\nDate: " + getDate() + "\nAccount Number: " + getAccountNumber();
    }
}
