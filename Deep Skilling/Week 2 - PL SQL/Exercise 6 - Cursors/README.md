# Exercise 6: Cursors

This exercise contains PL/SQL blocks using **explicit cursors** for three banking-related scenarios.

## Scenario 1: Generate Monthly Statements
- **Cursor Name:** `GenerateMonthlyStatements`
- **Description:** Retrieves all transactions for the current month and prints a statement for each customer.

## Scenario 2: Apply Annual Fee to All Accounts
- **Cursor Name:** `ApplyAnnualFee`
- **Description:** Deducts an annual maintenance fee from the balance of all accounts.

## Scenario 3: Update Loan Interest Rates
- **Cursor Name:** `UpdateLoanInterestRates`
- **Description:** Fetches all loans and updates their interest rates based on the new policy.

---

### File Structure
- `createTables.sql` — Contains table creation scripts.
- `insertData.sql` — Inserts sample data for testing.
- `scenario01.sql` — Cursor for generating monthly statements.
- `scenario02.sql` — Cursor for applying annual fees.
- `scenario03.sql` — Cursor for updating loan interest rates.
