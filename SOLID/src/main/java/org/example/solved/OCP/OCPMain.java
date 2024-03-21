package org.example.solved.OCP;

import java.util.Date;

public class OCPMain {
    public static void main(String[] args) {
        Date date = new Date();

        // Create transaction data objects
        TransactionData depositTransactionData = new TransactionData(500.0, 1200.0, date, "19234756");
        TransactionData withdrawalTransactionData = new TransactionData(200.0, 800.0, date, "132435678");
        TransactionData billPaymentTransactionData = new TransactionData(300.0, 1500.0, date, "19234756");

        // Process transactions using the appropriate TransactionProcessor class
        TransactionProcessor depositProcessor = new DepositTransactionProcessor();
        TransactionProcessor withdrawalProcessor = new WithdrawalTransactionProcessor();
        TransactionProcessor billPaymentProcessor = new BillPaymentTransactionProcessor();

        depositProcessor.processTransaction(depositTransactionData);
        withdrawalProcessor.processTransaction(withdrawalTransactionData);
        billPaymentProcessor.processTransaction(billPaymentTransactionData);

        // Display transaction data
        System.out.println("Transaction 1:");
        System.out.println(depositTransactionData.formatTransactionData());
        System.out.println("\nTransaction 2:");
        System.out.println(withdrawalTransactionData.formatTransactionData());
        System.out.println("\nTransaction 3:");
        System.out.println(billPaymentTransactionData.formatTransactionData());

        // Display updated balances
        System.out.println("\nDeposit Updated balance: " + depositTransactionData.getBalance());
        System.out.println("\nWithdrawal Updated balance: " + withdrawalTransactionData.getBalance());
        System.out.println("\nBill Payment Updated balance: " + billPaymentTransactionData.getBalance());
    }
}
