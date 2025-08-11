# Observer Pattern in Java

## 1. Overview
The **Observer Pattern** is a behavioral design pattern where an object (subject) maintains a list of dependents (observers) and notifies them automatically of any state changes.

In this example, we simulate a stock market system where multiple apps (mobile and web) receive updates whenever the stock price changes.

---

## 2. Components in This Implementation

### 2.1 Subject Interface
**`Stock`**
- Methods:
  - `registerObserver(Observer observer)`
  - `removeObserver(Observer observer)`
  - `notifyObservers()`

### 2.2 Concrete Subject
**`StockMarket`**
- Maintains a list of observers.
- Notifies all observers when the stock price changes.

### 2.3 Observer Interface
**`Observer`**
- Method: `update(double stockPrice)`

### 2.4 Concrete Observers
- **`MobileApp`** — Displays price updates on mobile devices.
- **`WebApp`** — Displays price updates on web browsers.

---

## 3. How It Works
1. Observers register themselves with the subject (`StockMarket`).
2. When the stock price changes, the subject calls `notifyObservers()`.
3. All registered observers get the latest stock price via their `update()` method.

---

## 4. UML Diagram
Stock <-------- StockMarket  
^ |  
| |  
Observer <---- MobileApp  
^  
|  
WebApp

---

## 5. Example Output
```text
Updating stock price to $100.50
Mobile App 1 - Stock Price Updated: $100.5
Web App 1 - Stock Price Updated: $100.5

Updating stock price to $105.75
Mobile App 1 - Stock Price Updated: $105.75
Web App 1 - Stock Price Updated: $105.75

Removing Mobile App 1 from notifications...

Updating stock price to $110.00
Web App 1 - Stock Price Updated: $110.0
```

---

## 6. How to Run

Save all `.java` files in the same folder.

**Compile:**
```bash
javac *.java
```

**Run:**
```bash
java ObserverPatternDemo
```

---

## 7. Conclusion
The Observer Pattern decouples the subject from its observers, allowing flexibility and scalability.

In this project, adding or removing observers does not require changes to the subject class.
