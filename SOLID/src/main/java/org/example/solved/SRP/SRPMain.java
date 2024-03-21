package org.example.solved.SRP;

import java.util.Date;

public class SRPMain {
    public static void main(String[] args) {
        Date date = new Date();

        // Create transaction data objects
        TransactionData depositTransactionData = new TransactionData(500.0, 1200.0, date, "19234756");
        TransactionData withdrawalTransactionData = new TransactionData(200.0, 800.0, date, "132435678");

        // Process transactions using the TransactionProcessor class
        TransactionProcessor depositProcessor = new DepositTransactionProcessor(); // SRP applied: DepositTransactionProcessor handles deposit transaction processing
        TransactionProcessor withdrawalProcessor = new WithdrawalTransactionProcessor();  // SRP applied: WithdrawalTransactionProcessor handles withdrawal transaction processing

        depositProcessor.processTransaction(depositTransactionData);
        withdrawalProcessor.processTransaction(withdrawalTransactionData);

        // Display transaction data
        System.out.println("Transaction 1:");
        System.out.println(depositTransactionData.formatTransactionData());
        System.out.println("\nTransaction 2:");
        System.out.println(withdrawalTransactionData.formatTransactionData());

        // Display updated balances
        System.out.println("\nDeposit Updated balance: " + depositTransactionData.getBalance());
        System.out.println("\nWithdrawal Updated balance: " + withdrawalTransactionData.getBalance());
    }
}
