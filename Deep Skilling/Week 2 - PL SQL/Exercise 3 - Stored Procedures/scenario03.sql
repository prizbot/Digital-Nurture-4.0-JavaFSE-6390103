DELIMITER //

CREATE PROCEDURE TransferFunds(
    IN fromAcc INT,
    IN toAcc INT,
    IN amount DECIMAL(10,2)
)
BEGIN
    DECLARE currentBalance DECIMAL(10,2);

    START TRANSACTION;

    -- Check balance
    SELECT Balance INTO currentBalance
    FROM Accounts
    WHERE AccountID = fromAcc;

    IF currentBalance < amount THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Insufficient funds';
    ELSE
        -- Deduct from source
        UPDATE Accounts
        SET Balance = Balance - amount
        WHERE AccountID = fromAcc;

        -- Add to destination
        UPDATE Accounts
        SET Balance = Balance + amount
        WHERE AccountID = toAcc;

        -- Log transaction
        INSERT INTO Transactions (FromAccount, ToAccount, Amount)
        VALUES (fromAcc, toAcc, amount);
    END IF;

    COMMIT;
END //

DELIMITER ;

-- Run the procedure
CALL TransferFunds(1, 2, 200);

-- Check results
SELECT * FROM Accounts;
SELECT * FROM Transactions;