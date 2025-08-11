-- Insert sample customers
INSERT INTO Customers (CustomerID, Name, Age, Balance, IsVIP) VALUES (1, 'John Smith', 65, 12000.00, 'N');
INSERT INTO Customers (CustomerID, Name, Age, Balance, IsVIP) VALUES (2, 'Alice Brown', 45, 8000.00, 'N');
INSERT INTO Customers (CustomerID, Name, Age, Balance, IsVIP) VALUES (3, 'Michael Johnson', 70, 15000.00, 'N');
INSERT INTO Customers (CustomerID, Name, Age, Balance, IsVIP) VALUES (4, 'Sara White', 58, 5000.00, 'N');

-- Insert sample loans
INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, DueDate) VALUES (101, 1, 5000.00, 5.5, SYSDATE + 20);
INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, DueDate) VALUES (102, 2, 8000.00, 6.0, SYSDATE + 40);
INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, DueDate) VALUES (103, 3, 10000.00, 5.0, SYSDATE + 10);
INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, DueDate) VALUES (104, 4, 3000.00, 7.0, SYSDATE + 25);