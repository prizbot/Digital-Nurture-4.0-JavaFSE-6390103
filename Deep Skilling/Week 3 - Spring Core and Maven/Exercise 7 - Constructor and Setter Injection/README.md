# 📚 Exercise 7 – Constructor and Setter Injection

## 📝 Overview
This exercise demonstrates how to use **both constructor injection** and **setter injection** in Spring for flexible bean initialization.

---

## 📂 Project Structure
Exercise 7 - Constructor and Setter Injection/
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
1. **BookRepository** – simple repository class returning a book title.
2. **BookService** – uses:
   - **Constructor Injection** for `BookRepository`.
   - **Setter Injection** for `libraryName`.
3. **applicationContext.xml** – wired both injection types.
4. **Main Application** – loads context and displays details.

---

## ▶️ How to Run
```bash
mvn clean install
mvn exec:java -Dexec.mainClass="com.library.app.LibraryManagementApplication"
```

## 📌 Expected Output
```
Library: Central City Library
Book: Clean Code by Robert C. Martin
```
