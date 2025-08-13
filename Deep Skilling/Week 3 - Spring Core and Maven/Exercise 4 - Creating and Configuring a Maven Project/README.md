# 📚 Exercise 4 – Creating and Configuring a Maven Project

## 📝 Overview
This exercise focuses on **setting up a new Maven project** for the **Library Management Application** and adding necessary Spring dependencies.

---

## 📂 Project Structure
Exercise 4 - Creating and Configuring a Maven Project/
├── pom.xml
├── README.md
└── src/
    └── main/
        └── java/
            └── com/
                └── library/
                    └── app/
                        └── LibraryManagementApplication.java

---

## ⚙️ Steps Implemented
1. **Created a Maven project** named `LibraryManagement`.
2. **Added dependencies** in `pom.xml`:
   - Spring Context
   - Spring AOP
   - Spring Web MVC
3. **Configured Maven Compiler Plugin** for Java 1.8.
4. Added a basic main class `LibraryManagementApplication`.

---

## ▶️ How to Run
```bash
mvn clean install
mvn exec:java -Dexec.mainClass="com.library.app.LibraryManagementApplication"
```

📌 Expected Output
```
Library Management Application is set up!
```
