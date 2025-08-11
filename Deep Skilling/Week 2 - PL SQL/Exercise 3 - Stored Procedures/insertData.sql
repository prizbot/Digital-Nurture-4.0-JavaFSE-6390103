-- Insert sample accounts
INSERT INTO Accounts (AccountID, AccountType, Balance) VALUES
(1, 'Savings', 1000.00),
(2, 'Savings', 2000.00),
(3, 'Current', 1500.00);

-- Insert sample employees
INSERT INTO Employees (EmployeeID, Name, Department, Salary) VALUES
(101, 'Alice', 'Finance', 50000.00),
(102, 'Bob', 'Finance', 55000.00),
(103, 'Charlie', 'HR', 45000.00);

-- No need to insert into Transactions initially