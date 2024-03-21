package org.example.solved.LSP;

import java.util.Date;

public class LSPMain {
    public static void main(String[] args) {
        Date date = new Date();

        // Create transaction data objects
        TransactionData depositTransactionData = new TransactionData(500.0, 1200.0, date, "19234756");
        TransactionData withdrawalTransactionData = new TransactionData(200.0, 800.0, date, "132435678");
        TransactionData billPaymentTransactionData = new TransactionData(300.0, 1500.0, date, "123456789");
        TransactionData refundTransactionData = new TransactionData(500, 1000, date, "18537756");

        // Process transactions using the appropriate TransactionProcessor class
        DepositTransactionProcessor depositProcessor = new DepositTransactionProcessor();
        WithdrawalTransactionProcessor withdrawalProcessor = new WithdrawalTransactionProcessor();
        BillPaymentTransactionProcessor billPaymentProcessor = new BillPaymentTransactionProcessor();
        RefundTransactionProcessor refundProcessor = new RefundTransactionProcessor();

        depositProcessor.processTransaction(depositTransactionData);
        withdrawalProcessor.processTransaction(withdrawalTransactionData);
        billPaymentProcessor.processTransaction(billPaymentTransactionData);
        refundProcessor.processTransaction(refundTransactionData);

        // Display transaction data
        System.out.println("Transaction 1:");
        System.out.println(depositTransactionData.formatTransactionData());
        System.out.println("\nTransaction 2:");
        System.out.println(withdrawalTransactionData.formatTransactionData());
        System.out.println("\nTransaction 3:");
        System.out.println(billPaymentTransactionData.formatTransactionData());
        System.out.println("\nTransaction 4:");
        System.out.println(refundTransactionData.formatTransactionData());

        // Display updated balances
        System.out.println("\nDeposit Updated balance: " + depositTransactionData.getBalance());
        System.out.println("\nWithdrawal Updated balance: " + withdrawalTransactionData.getBalance());
        System.out.println("\nBill Payment Updated balance: " + billPaymentTransactionData.getBalance());
        System.out.println("\nRefund Updated Balance: " + refundTransactionData.getBalance());
    }
}
