package org.example.violated.LSP;

import java.util.Date;

public class LSPMain {
    public static void main(String[] args) {
        Date date = new Date();

        // Create transactions
        Deposit depositTransaction = new Deposit(500.0, 1200.0, date, "19234756");
        Withdraw withdrawalTransaction = new Withdraw(200.0, 800.0, date, "132435678");
        BillPayment billPaymentTransaction = new BillPayment(300.0, 1500.0, date, "123456789");
        Refund refundTransaction = new Refund(500, 1000, date,"18537756" );

        // Display transaction data
        System.out.println("Transaction 1:");
        System.out.println(depositTransaction.formatTransactionData());
        System.out.println("\nTransaction 2:");
        System.out.println(withdrawalTransaction.formatTransactionData());
        System.out.println("\nTransaction 3:");
        System.out.println(billPaymentTransaction.formatTransactionData());
        System.out.println("\nTransaction 4:");
        System.out.println(refundTransaction.formatTransactionData());

        // Display updated balance
        System.out.println("\nDeposit Updated balance: " + depositTransaction.getBalance());
        System.out.println("\nWithdrawal Updated balance: " + withdrawalTransaction.getBalance());
        System.out.println("\nBill Payment Updated balance: " + billPaymentTransaction.getBalance());
        System.out.println("\nRefund Updated Balance: " + refundTransaction.getBalance());
    }
}

