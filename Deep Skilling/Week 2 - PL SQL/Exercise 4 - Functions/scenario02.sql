DELIMITER $$
CREATE FUNCTION CalculateMonthlyInstallment(
    loanAmount DECIMAL(15, 2),
    interestRate DECIMAL(5, 2),
    durationYears INT
) RETURNS DECIMAL(15, 2)
DETERMINISTIC
BEGIN
    DECLARE monthlyRate DECIMAL(10, 6);
    DECLARE months INT;
    DECLARE installment DECIMAL(15, 2);

    SET monthlyRate = interestRate / 12 / 100;
    SET months = durationYears * 12;

    -- EMI Formula: P * r * (1+r)^n / ((1+r)^n - 1)
    SET installment = loanAmount * monthlyRate * POW(1 + monthlyRate, months) / 
                      (POW(1 + monthlyRate, months) - 1);
    RETURN installment;
END$$
DELIMITER ;
