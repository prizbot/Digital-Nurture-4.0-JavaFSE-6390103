-- Insert sample customers
INSERT INTO Customers (CustomerID, Name, Balance) VALUES (1, 'Alice', 15000);
INSERT INTO Customers (CustomerID, Name, Balance) VALUES (2, 'Bob', 5000);
INSERT INTO Customers (CustomerID, Name, Balance) VALUES (3, 'Charlie', 8000);

-- Insert sample accounts
INSERT INTO Accounts (AccountID, CustomerID, Balance) VALUES (101, 1, 10000);
INSERT INTO Accounts (AccountID, CustomerID, Balance) VALUES (102, 2, 3000);
INSERT INTO Accounts (AccountID, CustomerID, Balance) VALUES (103, 3, 7000);

-- Insert sample employees
INSERT INTO Employees (EmployeeID, Name, Salary) VALUES (201, 'David', 60000);
INSERT INTO Employees (EmployeeID, Name, Salary) VALUES (202, 'Eva', 55000);

COMMIT;