CREATE OR REPLACE PROCEDURE UpdateSalary (
    p_emp_id NUMBER,
    p_percent_increase NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_percent_increase / 100)
    WHERE EmployeeID = p_emp_id;

    IF SQL%ROWCOUNT = 0 THEN
        RAISE_APPLICATION_ERROR(-20002, 'Employee ID not found.');
    END IF;

    COMMIT;

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        INSERT INTO ErrorLog (ErrorMessage)
        VALUES ('Error in UpdateSalary: ' || SQLERRM);
        COMMIT;
END;
/

-- Example call:
BEGIN
    UpdateSalary(201, 10);
END;
/