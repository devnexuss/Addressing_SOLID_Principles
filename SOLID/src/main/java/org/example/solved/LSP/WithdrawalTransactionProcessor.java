package org.example.solved.LSP;

// Class representing a withdrawal transaction processor
public class WithdrawalTransactionProcessor extends TransactionProcessor{
    // Method to process a withdrawal transaction
    @Override
    public void processTransaction(TransactionData transactionData) {
        // Update the balance by subtracting the transaction amount
        transactionData.setBalance(transactionData.getBalance() - transactionData.getAmount());
    }
}
