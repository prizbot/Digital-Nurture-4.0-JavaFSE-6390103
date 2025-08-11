# Exercise 5: Triggers

This exercise contains SQL trigger implementations for three different banking scenarios.

## Scenario 1: Automatically Update Last Modified Date
- **Trigger Name:** `UpdateCustomerLastModified`
- **Description:** Updates the `LastModified` column in the `Customers` table with the current date whenever a customer's record is updated.

## Scenario 2: Maintain an Audit Log for Transactions
- **Trigger Name:** `LogTransaction`
- **Description:** Inserts a record into the `AuditLog` table whenever a new transaction is added to the `Transactions` table.

## Scenario 3: Enforce Business Rules on Deposits and Withdrawals
- **Trigger Name:** `CheckTransactionRules`
- **Description:** Validates transaction rules before insertion:
  - Withdrawals must not exceed the current account balance.
  - Deposits must be a positive amount.

---

### File Structure
- `createTables.sql` — Contains table creation scripts.
- `insertData.sql` — Inserts sample data for testing triggers.
- `scenario01.sql` — Trigger for updating the last modified date.
- `scenario02.sql` — Trigger for maintaining the audit log.
- `scenario03.sql` — Trigger for enforcing deposit and withdrawal rules.
