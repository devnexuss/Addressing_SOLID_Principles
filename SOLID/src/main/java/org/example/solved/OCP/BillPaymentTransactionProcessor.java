package org.example.solved.OCP;

// Class responsible for processing bill payment transactions
public class BillPaymentTransactionProcessor extends TransactionProcessor{
    // Override method to process bill payment transaction
    @Override
    // This method is responsible solely for processing bill payment transactions
    // It accepts a TransactionData object as input and updates the balance by subtracting the transaction amount
    public void processTransaction(TransactionData transactionData) {
        transactionData.setBalance(transactionData.getBalance() - transactionData.getAmount());
    }
}

// OCP Adherence:
// Closed for Modification: The TransactionProcessor class does not need to be modified when new types of transactions are added.
// Open for Extension: New types of transactions can be added by creating new subclasses of TransactionProcessor without modifying the existing class.
