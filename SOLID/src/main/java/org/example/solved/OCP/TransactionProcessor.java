package org.example.solved.OCP;

// Abstract class for transaction processing
public abstract class TransactionProcessor {
    // Process transaction logic
    // This method is responsible solely for processing transactions
    public abstract void processTransaction(TransactionData transactionData);
}
