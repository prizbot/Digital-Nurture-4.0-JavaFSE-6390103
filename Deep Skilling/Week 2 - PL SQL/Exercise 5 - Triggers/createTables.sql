CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    Name VARCHAR(100),
    DateOfBirth DATE,
    LastModified DATE
);

CREATE TABLE Accounts (
    AccountID INT PRIMARY KEY,
    CustomerID INT,
    Balance DECIMAL(10,2),
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE Transactions (
    TransactionID INT PRIMARY KEY,
    AccountID INT,
    TransactionType VARCHAR(20),
    Amount DECIMAL(10,2),
    TransactionDate DATE,
    FOREIGN KEY (AccountID) REFERENCES Accounts(AccountID)
);

CREATE TABLE AuditLog (
    LogID INT PRIMARY KEY AUTO_INCREMENT,
    TransactionID INT,
    LogMessage VARCHAR(255),
    LogDate DATE
);
