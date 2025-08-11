# Decorator Pattern Example - Notification System

## 1. Overview
The **Decorator Pattern** is a structural design pattern that allows behavior to be added to individual objects dynamically without affecting the behavior of other objects from the same class.

In this example, we implement a notification system that can send messages through multiple channels (Email, SMS, Slack) using decorators.

---

## 2. Components in This Implementation

### 2.1 Component Interface
**Notifier**
- Method: `send(String message)`

### 2.2 Concrete Component
**EmailNotifier**
- Sends email notifications.

### 2.3 Abstract Decorator
**NotifierDecorator**
- Implements `Notifier` and wraps another `Notifier` object.

### 2.4 Concrete Decorators
**SMSNotifierDecorator**
- Adds SMS sending functionality.

**SlackNotifierDecorator**
- Adds Slack sending functionality.

---

## 3. How the Code Works
1. The base notifier (`EmailNotifier`) can send only email notifications.
2. By wrapping it in decorators (`SMSNotifierDecorator`, `SlackNotifierDecorator`), we can add new channels dynamically.
3. Each decorator calls the wrapped notifier's `send()` method before adding its own functionality.

---

## 4. UML Diagram
```
Notifier <---------- EmailNotifier
     ^
     |
NotifierDecorator <--- SMSNotifierDecorator
     |
     +------ SlackNotifierDecorator
```

---

## 5. Advantages
- Flexible: Add new notification channels without modifying existing code.
- Promotes the Open/Closed Principle.
- Allows dynamic composition of behaviors.

---

## 6. Example Output
```text
---- Sending via Email only ----
Sending Email notification: Hello via Email!

---- Sending via Email + SMS ----
Sending Email notification: Hello via Email and SMS!
Sending SMS notification: Hello via Email and SMS!

---- Sending via Email + SMS + Slack ----
Sending Email notification: Hello via Email, SMS, and Slack!
Sending SMS notification: Hello via Email, SMS, and Slack!
Sending Slack notification: Hello via Email, SMS, and Slack!
```

---

## 7. How to Run
1. Save all `.java` files in the same folder.
2. Open terminal in that folder.
3. Compile:
```bash
javac *.java
```
4. Run:
```bash
java DecoratorPatternDemo
```

---

## 8. Conclusion
The **Decorator Pattern** allows us to extend the functionality of objects at runtime in a clean and flexible way.