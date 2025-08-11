-- Table for Accounts
CREATE TABLE Accounts (
    AccountID INT PRIMARY KEY,
    AccountType VARCHAR(50),
    Balance DECIMAL(10,2)
);

-- Table for Employees
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    Name VARCHAR(100),
    Department VARCHAR(50),
    Salary DECIMAL(10,2)
);

-- Table for Transactions (for logging transfers)
CREATE TABLE Transactions (
    TransactionID INT PRIMARY KEY AUTO_INCREMENT,
    FromAccount INT,
    ToAccount INT,
    Amount DECIMAL(10,2),
    TransactionDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);