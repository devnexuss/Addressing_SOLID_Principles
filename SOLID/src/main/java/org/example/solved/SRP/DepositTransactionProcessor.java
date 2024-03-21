package org.example.solved.SRP;

// Class responsible for processing deposit transactions
public class DepositTransactionProcessor extends TransactionProcessor{
    // Override method to process deposit transaction
    @Override
    // This method is responsible solely for processing deposit transactions
    // It accepts a TransactionData object as input and updates the balance by adding the transaction amount
    public void processTransaction(TransactionData transactionData) {
        transactionData.setBalance(transactionData.getBalance() + transactionData.getAmount());
    }
}
