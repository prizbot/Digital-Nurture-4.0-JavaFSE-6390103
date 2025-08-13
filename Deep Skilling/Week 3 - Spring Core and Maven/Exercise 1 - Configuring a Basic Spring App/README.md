# 📚 Exercise 1 – Configuring a Basic Spring Application

## 📝 Overview
This exercise demonstrates how to configure a **basic Spring application** using **XML-based configuration**.  
We create a simple `BookService` and `BookRepository` to simulate backend operations for a library management system.

---

## 📂 Project Structure
Exercise 1 - Configuring a Basic Spring Application/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── library/
        │           ├── app/
        │           │   └── LibraryManagementApplication.java
        │           ├── repository/
        │           │   └── BookRepository.java
        │           └── service/
        │               └── BookService.java
        └── resources/
            └── applicationContext.xml

---

## ⚙️ Steps Implemented
1. **Maven Setup**
   - Added Spring Context dependency in `pom.xml`.
   - Configured Maven Compiler Plugin for Java 8.

2. **Spring Context Configuration**
   - Created `applicationContext.xml` to define and wire beans.

3. **Service & Repository**
   - `BookRepository` provides book details.
   - `BookService` uses setter injection to access repository methods.

4. **Main Application**
   - `LibraryManagementApplication` loads Spring context and calls the service method.

---

## ▶️ How to Run
```bash
mvn clean install
mvn exec:java -Dexec.mainClass="com.library.app.LibraryManagementApplication"
```
📌 **Expected Output**
```yaml
Book: The Great Gatsby, Author: F. Scott Fitzgerald
```
