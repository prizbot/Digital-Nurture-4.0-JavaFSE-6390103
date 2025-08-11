# Financial Forecasting Tool

## 1. Overview
This project implements a **Financial Forecasting Tool** that predicts future values based on past growth rates using **recursive** and **iterative** approaches.

---

## 2. Recursion Concept
**Recursion** is a method where the solution to a problem depends on smaller instances of the same problem.
- Advantages: Cleaner, easier to understand for repetitive breakdowns.
- Disadvantages: May cause **stack overflow** for large inputs.

---

## 3. Algorithm
### Recursive Approach
- Base Case: If `years == 0`, return the current value.
- Recursive Step: Multiply the current value by `(1 + growthRate/100)` and decrease years by 1.

### Iterative Approach (Optimized)
- Uses a loop to avoid deep recursion and excessive memory usage.

---

## 4. Time Complexity
- Recursive: **O(n)** (where n = years)
- Iterative: **O(n)**
- Space Complexity:
  - Recursive: **O(n)** (due to function call stack)
  - Iterative: **O(1)**

---

## 5. How to Run
```bash
javac FinancialForecast.java Main.java
java Main
```

## 6. Example Output
```
Recursive Forecast:
Future Value after 10 years: 1628.89

Iterative Forecast (Optimized):
Future Value after 10 years: 1628.89
```
