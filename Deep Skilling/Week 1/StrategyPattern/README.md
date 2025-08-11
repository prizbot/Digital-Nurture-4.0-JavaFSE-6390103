# Strategy Pattern in Java

## 1. Overview
The **Strategy Pattern** is a behavioral design pattern that allows selecting an algorithm's behavior at runtime.  
It defines a family of algorithms, encapsulates each one, and makes them interchangeable without changing the client code.

In this example, we simulate a payment system where the user can choose between different payment methods — **Credit Card** or **PayPal** — at runtime.

---

## 2. Components in This Implementation

### 2.1 Strategy Interface
**`PaymentStrategy`**
- Method: `pay(double amount)` — processes the payment.

### 2.2 Concrete Strategies
- **`CreditCardPayment`** — Implements payment using credit card details.
- **`PayPalPayment`** — Implements payment using a PayPal account.

### 2.3 Context Class
**`PaymentContext`**
- Holds a reference to `PaymentStrategy`.
- Method: `executePayment(double amount)` — delegates the payment to the selected strategy.

---

## 3. How It Works
1. The client sets the payment method (strategy) in `PaymentContext`.
2. The context calls the strategy’s `pay()` method to process the payment.
3. Strategies can be switched at runtime without modifying the context or other strategies.

---

## 4. UML Diagram
PaymentStrategy <---- CreditCardPayment  
^  
|  
+---- PayPalPayment  

PaymentContext ---> PaymentStrategy

---

## 5. Example Output
```text
Paid $250.0 using Credit Card [Card Holder: Alice Smith]
Paid $99.99 using PayPal [Email: alice@example.com]
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
java StrategyPatternDemo
```

---

## 7. Conclusion
The Strategy Pattern is perfect when you have multiple ways to perform an action and want to choose between them at runtime without modifying the client code.
