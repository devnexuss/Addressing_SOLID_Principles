package org.example.solved.SRP;

// Class responsible for processing withdrawal transactions
public class WithdrawalTransactionProcessor extends TransactionProcessor {
    // Override method to process withdrawal transaction
    @Override
    // This method is responsible solely for processing withdrawal transactions
    // It accepts a TransactionData object as input and updates the balance by subtracting the transaction amount
    public void processTransaction(TransactionData transactionData) {
        transactionData.setBalance(transactionData.getBalance() - transactionData.getAmount());
    }
}
