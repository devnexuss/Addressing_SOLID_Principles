package org.example.solved.LSP;

// Class representing a refund transaction processor
public class RefundTransactionProcessor extends TransactionProcessor{
    // Method to process a refund transaction
    @Override
    public void processTransaction(TransactionData transactionData) {
        // Update the balance by adding the transaction amount
        transactionData.setBalance(transactionData.getBalance() + transactionData.getAmount());
    }
}

// LSP adherence:
// Since this class implements the TransactionProcessor interface and provides
// a valid implementation for the processTransaction() method, it can be
// substituted for any other implementation of TransactionProcessor without
// affecting the correctness of the program. Thus, it adheres to the LSP.