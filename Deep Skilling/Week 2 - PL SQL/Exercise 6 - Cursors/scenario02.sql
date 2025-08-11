SET SERVEROUTPUT ON;

DECLARE
    CURSOR ApplyAnnualFee IS
        SELECT AccountID, Balance FROM Accounts;

    v_accountID Accounts.AccountID%TYPE;
    v_balance Accounts.Balance%TYPE;
    annual_fee CONSTANT NUMBER := 100;
BEGIN
    OPEN ApplyAnnualFee;
    LOOP
        FETCH ApplyAnnualFee INTO v_accountID, v_balance;
        EXIT WHEN ApplyAnnualFee%NOTFOUND;

        UPDATE Accounts
        SET Balance = v_balance - annual_fee
        WHERE AccountID = v_accountID;

        DBMS_OUTPUT.PUT_LINE('Annual fee applied to Account ' || v_accountID || '. New Balance: ' || (v_balance - annual_fee));
    END LOOP;
    CLOSE ApplyAnnualFee;
END;
/
