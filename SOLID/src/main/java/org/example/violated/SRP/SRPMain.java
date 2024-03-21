package org.example.violated.SRP;

import java.util.Date;

public class SRPMain {
    public static void main(String[] args) {
        Date date = new Date();

        // Create transactions
        Transaction depositTransaction = new Transaction("deposit", 500.0, 1200.0, date, "19234756");
        Transaction withdrawalTransaction = new Transaction("withdrawal", 200.0, 800.0, date, "132435678");

        // Process transactions
        depositTransaction.processTransaction(); // Violates SRP: Main class is responsible for both creating and processing transactions.
        withdrawalTransaction.processTransaction(); // Violates SRP: Main class is responsible for both creating and processing transactions.

        // Display transaction data
        System.out.println("Transaction 1:");
        System.out.println(depositTransaction.formatTransactionData()); // Violates SRP: Main class is responsible for displaying transaction data.
        System.out.println("\nTransaction 2:");
        System.out.println(withdrawalTransaction.formatTransactionData()); // Violates SRP: Main class is responsible for displaying transaction data.

        // Display updated balance
        System.out.println("\nDeposit Updated balance: " + depositTransaction.getBalance());
        System.out.println("\nWithdrawal Updated balance: " + withdrawalTransaction.getBalance());
    }
}
