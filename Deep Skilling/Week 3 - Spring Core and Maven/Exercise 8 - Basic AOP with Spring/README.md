# 📚 Exercise 8 – Basic AOP with Spring

## 📝 Overview
This exercise demonstrates **Aspect-Oriented Programming (AOP)** in Spring to separate cross-cutting concerns like logging from the main business logic.

---

## 📂 Project Structure
Exercise 8 - Basic AOP with Spring/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── library/
        │           ├── app/
        │           │   └── LibraryManagementApplication.java
        │           ├── aspect/
        │           │   └── LoggingAspect.java
        │           ├── repository/
        │           │   └── BookRepository.java
        │           └── service/
        │               └── BookService.java
        └── resources/
            └── applicationContext.xml

---

## ⚙️ Steps Implemented
1. **Added Spring AOP Dependencies** to `pom.xml`.
2. **Created LoggingAspect** with `@Around` advice.
3. **Enabled AspectJ Auto-Proxying** in `applicationContext.xml`.
4. **Tested AOP** by running the main application.

---

## ▶️ How to Run
```bash
mvn clean install
mvn exec:java -Dexec.mainClass="com.library.app.LibraryManagementApplication"
```

📌 Expected Output
```
➡️ Starting method: displayBookDetails
Book: Clean Code by Robert C. Martin
✅ Finished method: displayBookDetails
⏱ Execution time: XX ms
```
