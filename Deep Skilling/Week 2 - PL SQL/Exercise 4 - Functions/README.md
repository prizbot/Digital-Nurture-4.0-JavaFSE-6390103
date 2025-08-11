# Exercise 4: Functions - Banking Database

This exercise contains SQL scripts for creating a sample banking database, inserting sample data, and implementing user-defined functions for specific banking scenarios.

## 📂 Files

- **createTables.sql**  
  Contains SQL statements to create the following tables:  
  - `Customers`
  - `Accounts`
  - `Loans`

- **insertData.sql**  
  Inserts sample data into the tables with mock values for testing.

- **scenario01.sql**  
  Function `CalculateAge` – Takes a customer's date of birth as input and returns their age in years.

- **scenario02.sql**  
  Function `CalculateMonthlyInstallment` – Takes loan amount, interest rate, and loan duration in years, and returns the monthly installment amount.

- **scenario03.sql**  
  Function `HasSufficientBalance` – Takes an account ID and amount as input and returns `TRUE` if the account has at least the specified balance, otherwise `FALSE`.

---

## 🛠 How to Run

1. **Create Tables**  
   Run `createTables.sql` in your MySQL/MariaDB database.

2. **Insert Sample Data**  
   Run `insertData.sql` to populate the tables with test data.

3. **Create Functions**  
   Execute `scenario01.sql`, `scenario02.sql`, and `scenario03.sql` one by one to create the functions.

---

## 📌 Example Usage

### 1. Calculate Age
```sql
SELECT CalculateAge('1998-05-15') AS Age;
```

### 2. Calculate Monthly Installment
```sql
SELECT CalculateMonthlyInstallment(500000, 7.5, 10) AS Monthly_Installment;
```

### 3. Check Sufficient Balance
```sql
SELECT HasSufficientBalance(101, 2000) AS Has_Balance;
```
