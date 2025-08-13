# JUnit Basic Testing Exercises

This project contains a set of introductory **JUnit 4** exercises for learning unit testing in Java.  
It is part of **Week 2 – JUnit** practice tasks and covers setup, writing basic tests, using assertions,  
and applying the Arrange-Act-Assert (AAA) pattern with setup/teardown methods.

---

## 📂 Project Structure
```
JUnit_Basic Testing Exercises/
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   └── java/
    │       └── com/example/
    │           ├── Calculator.java # Simple calculator class
    │           └── StringUtils.java # String utility helper
    └── test/
        └── java/
            └── com/example/
                ├── CalculatorTest.java # Basic unit tests for Calculator
                ├── StringUtilsTest.java # AAA pattern with setup/teardown
                └── AssertionsTest.java # Examples of various JUnit assertions
```
---

## 📝 Exercises Covered

### **Exercise 1 – Setting up JUnit**
- Created a new Java Maven project.
- Added **JUnit 4.13.2** as a test dependency in `pom.xml`.
- Verified the test environment setup.

### **Exercise 2 – Writing Basic JUnit Tests**
- Created `Calculator` class with basic math operations.
- Wrote `CalculatorTest` with unit tests for each method.

### **Exercise 3 – Assertions in JUnit**
- Demonstrated usage of various JUnit assertions:
  - `assertEquals`
  - `assertTrue`
  - `assertFalse`
  - `assertNull`
  - `assertNotNull`

### **Exercise 4 – AAA Pattern & Setup/Teardown**
- Used the **Arrange-Act-Assert (AAA)** testing pattern.
- Implemented `@Before` and `@After` methods for reusable setup/cleanup.
- Example: `StringUtilsTest`.

---

## ⚙️ Prerequisites

- **Java 8+** installed.
- **Maven** installed (`mvn -v` to check).
- IDE such as **IntelliJ IDEA** or **Eclipse** (recommended).

---

## 🚀 How to Run Tests

### 1. Clone the repository
```sh
git clone <your-github-repo-url>
cd "Week 2 - JUnit/1. JUnit_Basic Testing Exercises"
```

### 2. Run tests using Maven
```sh
mvn test
```

### 3. Run tests from IDE
- Open the project in IntelliJ/Eclipse.
- Right-click on test folder → Run All Tests.

---

## 📖 Learning Outcomes
After completing these exercises, you will be able to:
- Set up a JUnit environment in a Java Maven project.
- Write and execute unit tests.
- Use different assertion methods effectively.
- Structure tests using AAA pattern.
- Use @Before and @After annotations for test lifecycle management.

---

## 🛠️ Tools & Technologies Used
- Java
- JUnit 4
- Maven
- IntelliJ IDEA (or Eclipse)
