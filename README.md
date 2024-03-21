# Transaction Processing System

## Use Case Description

This project implements a transaction processing system that handles various types of financial transactions such as deposits, withdrawals, bill payments, and refunds. The system maintains transaction data including the transaction type, amount, date, and account number, and processes each transaction accordingly to update the account balance.

## Principles Applied

### Single Responsibility Principle (SRP)

The Single Responsibility Principle dictates that a class should have only one reason to change, meaning it should have only one responsibility. By adhering to SRP, this project ensures that each class is focused on a specific task or responsibility. This makes the codebase easier to understand, maintain, and extend. For example, the `TransactionData` class is solely responsible for encapsulating transaction data, while the `TransactionProcessor` classes handle transaction processing logic, promoting code organization and reusability.

### Open/Closed Principle (OCP)

The Open/Closed Principle states that software entities should be open for extension but closed for modification. Embracing OCP allows this project to accommodate changes and additions without altering existing code. By designing the `TransactionProcessor` class to be open for extension, new types of transaction processors can be added without modifying the core processing logic. This promotes code stability, scalability, and ease of maintenance, as the system can evolve to handle new requirements or transaction types without disrupting existing functionality.

### Liskov Substitution Principle (LSP)

The Liskov Substitution Principle emphasizes that objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program. Adhering to LSP ensures that this project's inheritance hierarchy is well-designed and behaves predictably. Each subclass of the `Transaction` class can be used interchangeably with the base `Transaction` class, promoting code flexibility and extensibility. This principle allows for polymorphic behavior, enabling the system to process different types of transactions uniformly and facilitating code reuse and maintenance.
