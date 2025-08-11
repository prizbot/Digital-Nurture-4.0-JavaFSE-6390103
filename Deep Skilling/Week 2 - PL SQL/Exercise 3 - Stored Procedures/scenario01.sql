DELIMITER //

CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';
END //

DELIMITER ;

-- Run the procedure
CALL ProcessMonthlyInterest();

-- Check results
SELECT * FROM Accounts;