-- Package Specification
CREATE OR REPLACE PACKAGE AccountOperations AS
    PROCEDURE OpenAccount(p_accountID NUMBER, p_customerID NUMBER, p_balance NUMBER);
    PROCEDURE CloseAccount(p_accountID NUMBER);
    FUNCTION GetTotalBalance(p_customerID NUMBER) RETURN NUMBER;
END AccountOperations;
/

-- Package Body
CREATE OR REPLACE PACKAGE BODY AccountOperations AS

    PROCEDURE OpenAccount(p_accountID NUMBER, p_customerID NUMBER, p_balance NUMBER) IS
    BEGIN
        INSERT INTO Accounts (AccountID, CustomerID, Balance)
        VALUES (p_accountID, p_customerID, p_balance);
    END OpenAccount;

    PROCEDURE CloseAccount(p_accountID NUMBER) IS
    BEGIN
        DELETE FROM Accounts WHERE AccountID = p_accountID;
    END CloseAccount;

    FUNCTION GetTotalBalance(p_customerID NUMBER) RETURN NUMBER IS
        v_totalBalance NUMBER;
    BEGIN
        SELECT NVL(SUM(Balance), 0) INTO v_totalBalance FROM Accounts WHERE CustomerID = p_customerID;
        RETURN v_totalBalance;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RETURN 0;
    END GetTotalBalance;

END AccountOperations;
/
