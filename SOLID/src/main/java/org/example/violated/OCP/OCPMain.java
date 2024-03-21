package org.example.violated.OCP;

import java.util.Date;

public class OCPMain {
    public static void main(String[] args) {
        Date date = new Date();

        // Create transactions
        Transaction depositTransaction = new Transaction("deposit", 500.0, 1200.0, date, "19234756");
        Transaction withdrawalTransaction = new Transaction("withdrawal", 200.0, 800.0, date, "132435678");
        Transaction billPaymentTransaction = new Transaction("bill_payment", 100.0, 1000.0, date, "987654321");

        // Process transactions
        depositTransaction.processTransaction();
        withdrawalTransaction.processTransaction();
        billPaymentTransaction.processTransaction();

        // Display transaction data
        System.out.println("Transaction 1:");
        System.out.println(depositTransaction.formatTransactionData());
        System.out.println("\nTransaction 2:");
        System.out.println(withdrawalTransaction.formatTransactionData());
        System.out.println("\nTransaction 3:");
        System.out.println(billPaymentTransaction.formatTransactionData());

        // Display updated balance
        System.out.println("\nDeposit Updated balance: " + depositTransaction.getBalance());
        System.out.println("\nWithdrawal Updated balance: " + withdrawalTransaction.getBalance());
        System.out.println("\nBill Payment Updated balance: " + billPaymentTransaction.getBalance());
    }
}
