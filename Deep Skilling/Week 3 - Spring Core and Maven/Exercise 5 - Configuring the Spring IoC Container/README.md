# 📚 Exercise 5 – Configuring the Spring IoC Container

## 📝 Overview
This exercise demonstrates how to configure the **Spring IoC (Inversion of Control) container** using an XML configuration file.

---

## 📂 Project Structure
Exercise 5 - Configuring the Spring IoC Container/
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
1. **Created Spring configuration file** `applicationContext.xml` in `src/main/resources`.
2. **Defined beans** for `BookRepository` and `BookService`.
3. **Injected dependency** into `BookService` using **setter injection**.
4. **Tested configuration** by running the main application.

---

## ▶️ How to Run
```bash
mvn clean install
mvn exec:java -Dexec.mainClass="com.library.app.LibraryManagementApplication"
```

📌 Expected Output
```
Book: Spring in Action
```
