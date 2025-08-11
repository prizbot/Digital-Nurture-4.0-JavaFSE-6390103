-- Package Specification
CREATE OR REPLACE PACKAGE EmployeeManagement AS
    PROCEDURE HireEmployee(p_id NUMBER, p_name VARCHAR2, p_salary NUMBER);
    PROCEDURE UpdateEmployee(p_id NUMBER, p_name VARCHAR2, p_salary NUMBER);
    FUNCTION CalculateAnnualSalary(p_id NUMBER) RETURN NUMBER;
END EmployeeManagement;
/
-- Package Body
CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS

    PROCEDURE HireEmployee(p_id NUMBER, p_name VARCHAR2, p_salary NUMBER) IS
    BEGIN
        INSERT INTO Employees (EmployeeID, EmployeeName, Salary)
        VALUES (p_id, p_name, p_salary);
    END HireEmployee;

    PROCEDURE UpdateEmployee(p_id NUMBER, p_name VARCHAR2, p_salary NUMBER) IS
    BEGIN
        UPDATE Employees
        SET EmployeeName = p_name,
            Salary = p_salary
        WHERE EmployeeID = p_id;
    END UpdateEmployee;

    FUNCTION CalculateAnnualSalary(p_id NUMBER) RETURN NUMBER IS
        v_salary NUMBER;
    BEGIN
        SELECT Salary INTO v_salary FROM Employees WHERE EmployeeID = p_id;
        RETURN v_salary * 12;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RETURN 0;
    END CalculateAnnualSalary;

END EmployeeManagement;
/
