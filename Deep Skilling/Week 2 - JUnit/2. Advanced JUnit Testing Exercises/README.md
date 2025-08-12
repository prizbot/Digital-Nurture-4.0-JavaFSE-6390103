# Advanced JUnit Testing Exercises

This project contains **Advanced JUnit 5** exercises for improving Java unit testing skills.  
It is part of **Week 2 – JUnit** and focuses on parameterized testing, test suites, execution order, exception testing, and performance checks.

---

## 📂 Project Structure

Advanced JUnit Testing Exercises/
├── pom.xml
└── src/
├── main/
│ └── java/
│ └── com/example/
│ ├── EvenChecker.java # Checks if a number is even
│ ├── ExceptionThrower.java # Throws an intentional exception
│ └── PerformanceTester.java # Simulates a performance task
└── test/
└── java/
└── com/example/
├── EvenCheckerTest.java # Parameterized tests for even numbers
├── OrderedTests.java # Test execution ordering
├── ExceptionThrowerTest.java# Exception testing
├── PerformanceTesterTest.java # Timeout testing
└── AllTests.java # Test suite grouping

---

## 📝 Exercises Covered

### **Exercise 1 – Parameterized Tests**
- `EvenChecker` class created with `isEven(int number)` method.
- `EvenCheckerTest` uses:
  - `@ParameterizedTest`
  - `@ValueSource`
- Runs the same test logic for multiple input values.

### **Exercise 2 – Test Suites**
- `AllTests` test suite created using:
  - `@Suite`
  - `@SelectClasses`
- Allows running multiple related test classes together.

### **Exercise 3 – Test Execution Order**
- `OrderedTests` uses:
  - `@TestMethodOrder(MethodOrderer.OrderAnnotation.class)`
  - `@Order(n)` to specify execution sequence.

### **Exercise 4 – Exception Testing**
- `ExceptionThrower` class with a method that throws an `IllegalArgumentException`.
- `ExceptionThrowerTest` uses:
  - `assertThrows` to verify exception is thrown.

### **Exercise 5 – Timeout & Performance Testing**
- `PerformanceTester` simulates work using `Thread.sleep`.
- `PerformanceTesterTest` uses:
  - `assertTimeout(Duration.ofMillis(n))` to enforce time limits.

---

## ⚙️ Prerequisites

- **Java 8+** installed.
- **Maven** installed (`mvn -v` to check).
- IDE such as **IntelliJ IDEA** or **Eclipse**.

---

## 🚀 How to Run Tests

### 1. Clone the repository
```sh
git clone <your-github-repo-url>
cd "Week 2 - JUnit/2. Advanced JUnit Testing Exercises"
```

### 2. Run all tests using Maven
```sh
mvn test
```

### 3. Run tests from IDE
Right-click test folder → Run All Tests.

To run only the grouped tests, run the AllTests class.

---

## 📖 Learning Outcomes
After completing these exercises, you will be able to:

- Write parameterized tests in JUnit 5.
- Group multiple test classes into test suites.
- Control test execution order.
- Perform exception testing using `assertThrows`.
- Test for timeout constraints with `assertTimeout`.

---

## 🛠️ Tools & Technologies Used
- Java
- JUnit 5 (Jupiter)
- Maven
- IntelliJ IDEA (or Eclipse)
