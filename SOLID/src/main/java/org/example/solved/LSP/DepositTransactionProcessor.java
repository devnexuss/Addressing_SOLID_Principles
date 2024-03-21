package org.example.solved.LSP;

// Class representing a deposit transaction processor
public class DepositTransactionProcessor extends TransactionProcessor{
    // Method to process a deposit transaction
    @Override
    public void processTransaction(TransactionData transactionData) {
        // Update the balance by adding the transaction amount
        transactionData.setBalance(transactionData.getBalance() + transactionData.getAmount());
    }
}
