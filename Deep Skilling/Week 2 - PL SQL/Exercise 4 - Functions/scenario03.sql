DELIMITER $$
CREATE FUNCTION HasSufficientBalance(
    accID INT,
    amount DECIMAL(15, 2)
) RETURNS BOOLEAN
DETERMINISTIC
BEGIN
    DECLARE currentBalance DECIMAL(15, 2);

    SELECT Balance INTO currentBalance
    FROM Accounts
    WHERE AccountID = accID;

    RETURN currentBalance >= amount;
END$$
DELIMITER ;
