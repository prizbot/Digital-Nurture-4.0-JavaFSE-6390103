INSERT INTO Customers (CustomerID, Name, DateOfBirth) VALUES
(1, 'Aarav Mehta', '1990-04-15'),
(2, 'Priya Sharma', '1998-08-21'),
(3, 'Rahul Verma', '1985-01-30');

INSERT INTO Accounts (AccountID, CustomerID, Balance) VALUES
(101, 1, 25000.00),
(102, 2, 15000.00),
(103, 3, 8000.00);

INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, DurationYears) VALUES
(201, 1, 500000.00, 7.5, 5),
(202, 2, 300000.00, 8.0, 3);
