package org.example.solved.LSP;

// Class representing a bill payment transaction processor
public class BillPaymentTransactionProcessor extends TransactionProcessor {
    // Method to process a bill payment transaction
    @Override
    public void processTransaction(TransactionData transactionData) {
        // Update the balance by subtracting the transaction amount
        transactionData.setBalance(transactionData.getBalance() - transactionData.getAmount());
    }
}
