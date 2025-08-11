DECLARE
    CURSOR due_soon_loans IS
        SELECT c.Name, l.LoanID, l.DueDate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
        WHERE l.DueDate <= SYSDATE + 30;
BEGIN
    FOR rec IN due_soon_loans LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || rec.LoanID || ' for ' || rec.Name ||
                             ' is due on ' || TO_CHAR(rec.DueDate, 'DD-MON-YYYY'));
    END LOOP;
END;
/