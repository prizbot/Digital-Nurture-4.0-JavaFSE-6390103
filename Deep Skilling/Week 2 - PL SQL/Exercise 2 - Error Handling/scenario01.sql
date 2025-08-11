CREATE OR REPLACE PROCEDURE SafeTransferFunds (
    p_from_account NUMBER,
    p_to_account NUMBER,
    p_amount NUMBER
) AS
BEGIN
    -- Deduct from sender
    UPDATE Accounts
    SET Balance = Balance - p_amount
    WHERE AccountID = p_from_account
    AND Balance >= p_amount;

    IF SQL%ROWCOUNT = 0 THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in the source account.');
    END IF;

    -- Add to receiver
    UPDATE Accounts
    SET Balance = Balance + p_amount
    WHERE AccountID = p_to_account;

    COMMIT;

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        INSERT INTO ErrorLog (ErrorMessage)
        VALUES ('Error in SafeTransferFunds: ' || SQLERRM);
        COMMIT;
END;
/

-- Example call:
BEGIN
    SafeTransferFunds(101, 102, 2000);
END;
/