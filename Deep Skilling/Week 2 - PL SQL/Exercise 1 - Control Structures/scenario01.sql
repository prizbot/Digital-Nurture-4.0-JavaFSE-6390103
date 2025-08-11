DECLARE
    CURSOR senior_customers IS
        SELECT c.CustomerID, l.LoanID, l.InterestRate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
        WHERE c.Age > 60;
BEGIN
    FOR rec IN senior_customers LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE LoanID = rec.LoanID;
        
        DBMS_OUTPUT.PUT_LINE('Applied 1% discount for Customer ID: ' || rec.CustomerID);
    END LOOP;
END;
/