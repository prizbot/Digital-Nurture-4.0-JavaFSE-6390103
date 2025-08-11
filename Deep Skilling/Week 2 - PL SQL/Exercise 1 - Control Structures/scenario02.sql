DECLARE
    CURSOR vip_candidates IS
        SELECT CustomerID
        FROM Customers
        WHERE Balance > 10000;
BEGIN
    FOR rec IN vip_candidates LOOP
        UPDATE Customers
        SET IsVIP = 'Y'
        WHERE CustomerID = rec.CustomerID;
        
        DBMS_OUTPUT.PUT_LINE('Promoted to VIP: Customer ID ' || rec.CustomerID);
    END LOOP;
END;
/