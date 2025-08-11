-- Insert into Accounts
INSERT INTO Accounts VALUES (1, 'Alice Johnson', 5000);
INSERT INTO Accounts VALUES (2, 'Bob Smith', 7500);
INSERT INTO Accounts VALUES (3, 'Charlie Brown', 3000);

-- Insert into Transactions
INSERT INTO Transactions VALUES (101, 1, DATE '2025-08-01', 2000, 'Deposit');
INSERT INTO Transactions VALUES (102, 1, DATE '2025-08-05', -500, 'Withdrawal');
INSERT INTO Transactions VALUES (103, 2, DATE '2025-08-03', -1000, 'Withdrawal');
INSERT INTO Transactions VALUES (104, 3, DATE '2025-07-28', 1500, 'Deposit');

-- Insert into Loans
INSERT INTO Loans VALUES (201, 'Alice Johnson', 5.5);
INSERT INTO Loans VALUES (202, 'Bob Smith', 6.0);
INSERT INTO Loans VALUES (203, 'Charlie Brown', 4.8);
