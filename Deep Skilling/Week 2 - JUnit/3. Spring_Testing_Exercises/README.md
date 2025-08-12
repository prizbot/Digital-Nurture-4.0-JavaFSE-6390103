# 🧪 Spring Boot Testing Exercises  

This project contains **9 exercises** demonstrating different Spring Boot testing techniques using **JUnit 5**, **Mockito**, and **MockMvc**.  
It covers everything from basic unit tests to full integration tests with database interaction and exception handling.  

---

## 📂 Project Structure  

Week 2 - JUnit
│
└── 3.Spring_Testing_Exercises
├── src/main/java/com/example/testing
│ ├── TestingApplication.java # Main Spring Boot app
│ ├── service/CalculatorService.java
│ ├── entity/User.java
│ ├── repository/UserRepository.java
│ ├── service/UserService.java
│ ├── controller/UserController.java
│ └── exception/GlobalExceptionHandler.java
│
├── src/test/java/com/example/testing
│ ├── Exercise1_CalculatorServiceTest.java
│ ├── Exercise2_UserServiceTest.java
│ ├── Exercise3_UserControllerTest.java
│ ├── Exercise4_IntegrationTest.java
│ ├── Exercise5_UserControllerPostTest.java
│ ├── Exercise6_UserServiceExceptionTest.java
│ ├── Exercise7_CustomRepositoryQueryTest.java
│ ├── Exercise8_ExceptionHandlerTest.java
│ └── Exercise9_ParameterizedTest.java
│
└── pom.xml


---

## 📌 Exercises Overview  

| #  | Exercise Name | Description |
|----|--------------|-------------|
| **1** | Basic Unit Test for a Service Method | Unit test for `CalculatorService.add(int, int)` |
| **2** | Mocking a Repository in a Service Test | Use `@MockBean` and Mockito to test `UserService` without a database |
| **3** | Testing a REST Controller with MockMvc | Test `/users/{id}` GET endpoint |
| **4** | Integration Test with Spring Boot | Test full flow from controller → service → repository → DB |
| **5** | Test Controller POST Endpoint | Test creating a new user via `POST /users` |
| **6** | Test Service Exception Handling | Verify correct handling when a user is missing |
| **7** | Test Custom Repository Query | Test `findByName(String name)` query method |
| **8** | Test Controller Exception Handling | Test `@ControllerAdvice` for `NoSuchElementException` |
| **9** | Parameterized Test with JUnit | Use `@ParameterizedTest` with multiple input values |

---

## 🛠 Requirements  

- **Java** 17+  
- **Maven** 3.8+  
- **Spring Boot** 3.x  
- IDE: IntelliJ IDEA / Eclipse (recommended)  

---

## ⚙️ Setup  

1. **Clone the Repository**  
```bash
git clone https://github.com/<your-username>/<your-repo>.git
cd "Week 2 - JUnit/Spring Testing Exercises"

## 📦 Install Dependencies
`mvn clean install`

## ▶️ Run the Application *(optional, for integration tests)*
`mvn spring-boot:run`

## 🧪 Running Tests
- **Run all tests:**  
  `mvn test`

- **Run a specific exercise test:**  
  `mvn -Dtest=Exercise3_UserControllerTest test`

---

## 📖 Key Testing Concepts Covered
✅ Unit Testing with **JUnit 5**  
✅ Mocking dependencies with **Mockito** & `@MockBean`  
✅ **MockMvc** for controller testing without starting a full server  
✅ Integration Testing with **H2 in-memory database**  
✅ Parameterized Tests for multiple inputs  
✅ Exception Handling Tests with `@ControllerAdvice`  
✅ Custom Query Method Testing in **Spring Data JPA**  

---

## 📌 Notes
- For integration tests, the project uses **H2 in-memory database** configured in `application-test.properties`.  
- All test classes follow the **Arrange–Act–Assert** pattern for clarity.  
- Mock-based tests are isolated and do **not** require the application to start fully.  
