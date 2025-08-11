DELIMITER $$

CREATE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
    INSERT INTO AuditLog (TransactionID, LogMessage, LogDate)
    VALUES (NEW.TransactionID, CONCAT('Transaction of ', NEW.Amount, ' recorded for Account ID ', NEW.AccountID), CURDATE());
END$$

DELIMITER ;
