INSERT INTO Customers (CustomerID, Name, DateOfBirth, LastModified)
VALUES 
(1, 'Alice Johnson', '1990-05-15', CURDATE()),
(2, 'Bob Smith', '1985-08-22', CURDATE());

INSERT INTO Accounts (AccountID, CustomerID, Balance)
VALUES
(101, 1, 5000.00),
(102, 2, 1500.00);

INSERT INTO Transactions (TransactionID, AccountID, TransactionType, Amount, TransactionDate)
VALUES
(1, 101, 'Deposit', 2000.00, CURDATE()),
(2, 102, 'Withdrawal', 500.00, CURDATE());
