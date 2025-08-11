CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    Name VARCHAR(100),
    DateOfBirth DATE
);

CREATE TABLE Accounts (
    AccountID INT PRIMARY KEY,
    CustomerID INT,
    Balance DECIMAL(15, 2),
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE Loans (
    LoanID INT PRIMARY KEY,
    CustomerID INT,
    LoanAmount DECIMAL(15, 2),
    InterestRate DECIMAL(5, 2),
    DurationYears INT,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);
