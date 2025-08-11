SET SERVEROUTPUT ON;

DECLARE
    CURSOR GenerateMonthlyStatements IS
        SELECT AccountID, TransactionDate, Amount, TransactionType
        FROM Transactions
        WHERE EXTRACT(MONTH FROM TransactionDate) = EXTRACT(MONTH FROM SYSDATE)
          AND EXTRACT(YEAR FROM TransactionDate) = EXTRACT(YEAR FROM SYSDATE);

    v_accountID Transactions.AccountID%TYPE;
    v_date Transactions.TransactionDate%TYPE;
    v_amount Transactions.Amount%TYPE;
    v_type Transactions.TransactionType%TYPE;
BEGIN
    OPEN GenerateMonthlyStatements;
    LOOP
        FETCH GenerateMonthlyStatements INTO v_accountID, v_date, v_amount, v_type;
        EXIT WHEN GenerateMonthlyStatements%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE('Account: ' || v_accountID || 
                             ' | Date: ' || v_date || 
                             ' | Amount: ' || v_amount || 
                             ' | Type: ' || v_type);
    END LOOP;
    CLOSE GenerateMonthlyStatements;
END;
/
