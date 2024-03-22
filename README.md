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

## Solutions

### Single Responsibility Principle (SRP) - Solved

In addressing the violation of the Single Responsibility Principle, the project refactors the codebase by separating concerns related to transaction data management and transaction processing into distinct classes.

- `TransactionData.java`: This class solely encapsulates transaction data, including the amount, balance, date, and account number. It provides methods for accessing and modifying this data, promoting encapsulation and code organization.

- `TransactionProcessor.java`: This abstract class defines the contract for processing transactions. It declares the `processTransaction` method, leaving the implementation details to subclasses.

- `DepositTransactionProcessor.java`, `WithdrawalTransactionProcessor.java`, `BillPaymentTransactionProcessor.java`: These concrete subclasses of `TransactionProcessor` focus solely on the processing logic for their respective transaction types, adhering to SRP by separating processing logic from data management.

- `SRPMain.java`: This class serves as the entry point for the program, organizing the creation of transaction data objects and initiating transaction processing through the appropriate processors.

### Open/Closed Principle (OCP) - Solved

To adhere to the Open/Closed Principle, the project employs a strategy pattern to handle different types of transactions without modifying existing code.

- `TransactionProcessor.java`: This abstract class acts as an abstraction for processing transactions, providing a template method `processTransaction` that outlines the processing logic.

- Concrete implementations such as `DepositTransactionProcessor.java`, `WithdrawalTransactionProcessor.java`, `BillPaymentTransactionProcessor.java` extend the `TransactionProcessor` class. These subclasses override the `processTransaction` method to implement specific processing logic for their respective transaction types.

- New transaction types can be added without modifying existing code; instead, new processors can be created by extending the `TransactionProcessor` class and implementing the processing logic for the new transaction type.

### Liskov Substitution Principle (LSP) - Solved

To uphold the Liskov Substitution Principle, the project restructures the transaction processing system to ensure that each subclass of `TransactionProcessor` specializes in handling a specific type of transaction.

- The inheritance hierarchy is well-designed, and each subclass of `TransactionProcessor` can be substituted for its base class (`TransactionProcessor`) without compromising the functionality or correctness of the system.

- Clients interacting with the `TransactionProcessor` interface can rely on its common method, `processTransaction`, to handle various transaction types uniformly, without needing to be aware of the specific implementation details for each type.

- This separation of concerns ensures that the codebase remains flexible and scalable, facilitating easier maintenance and future enhancements.
