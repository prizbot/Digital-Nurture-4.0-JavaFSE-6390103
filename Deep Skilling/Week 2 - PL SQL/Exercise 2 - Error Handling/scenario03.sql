CREATE OR REPLACE PROCEDURE AddNewCustomer (
    p_customer_id NUMBER,
    p_name VARCHAR2,
    p_balance NUMBER
) AS
BEGIN
    INSERT INTO Customers (CustomerID, Name, Balance)
    VALUES (p_customer_id, p_name, p_balance);

    COMMIT;

EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        INSERT INTO ErrorLog (ErrorMessage)
        VALUES ('Duplicate Customer ID: ' || p_customer_id);
        COMMIT;
    WHEN OTHERS THEN
        ROLLBACK;
        INSERT INTO ErrorLog (ErrorMessage)
        VALUES ('Error in AddNewCustomer: ' || SQLERRM);
        COMMIT;
END;
/

-- Example call:
BEGIN
    AddNewCustomer(4, 'Frank', 12000);
END;
/