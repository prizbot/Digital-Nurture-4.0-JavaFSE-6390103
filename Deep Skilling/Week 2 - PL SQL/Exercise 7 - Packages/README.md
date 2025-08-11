# Exercise 7: Packages

This project demonstrates the use of PL/SQL packages to organize related procedures and functions for managing customers, employees, and accounts in a banking system.

---

## Project Structure

- `createTables.sql`  
  Contains the SQL statements to create the necessary tables: Customers, Employees, and Accounts.

- `insertData.sql`  
  Inserts sample data into the Customers, Employees, and Accounts tables.

- `scenario01.sql`  
  Defines the **CustomerManagement** package with procedures for adding and updating customers, and a function to get customer balance.

- `scenario02.sql`  
  Defines the **EmployeeManagement** package with procedures to hire and update employees, and a function to calculate annual salary.

- `scenario03.sql`  
  Defines the **AccountOperations** package with procedures to open and close accounts, and a function to get the total balance of a customer across all accounts.

---

## How to Use

1. Run `createTables.sql` to create the tables.

2. Run `insertData.sql` to insert sample data.

3. Execute each scenario file (`scenario01.sql`, `scenario02.sql`, `scenario03.sql`) to create the corresponding packages.

4. Use the packages by calling their procedures and functions as needed.

---

## Notes

- Each package groups logically related operations, promoting modularity and easier maintenance.

- Exception handling is included in functions to return default values when no data is found.

---
