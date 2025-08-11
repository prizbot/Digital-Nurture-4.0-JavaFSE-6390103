SET SERVEROUTPUT ON;

DECLARE
    CURSOR UpdateLoanInterestRates IS
        SELECT LoanID, InterestRate FROM Loans;

    v_loanID Loans.LoanID%TYPE;
    v_interest Loans.InterestRate%TYPE;
BEGIN
    OPEN UpdateLoanInterestRates;
    LOOP
        FETCH UpdateLoanInterestRates INTO v_loanID, v_interest;
        EXIT WHEN UpdateLoanInterestRates%NOTFOUND;

        UPDATE Loans
        SET InterestRate = v_interest + 0.5
        WHERE LoanID = v_loanID;

        DBMS_OUTPUT.PUT_LINE('Loan ' || v_loanID || ' interest rate updated from ' || v_interest || ' to ' || (v_interest + 0.5));
    END LOOP;
    CLOSE UpdateLoanInterestRates;
END;
/
