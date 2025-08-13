# 📚 Exercise 6 – Configuring Beans with Annotations

## 📝 Overview
This exercise replaces the XML bean configuration with **annotation-based configuration** using `@Service`, `@Repository`, and component scanning.

---

## 📂 Project Structure
Exercise 6 - Configuring Beans with Annotations/
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
1. **Enabled component scanning** in `applicationContext.xml`.
2. Annotated classes:
   - `@Service` for `BookService`.
   - `@Repository` for `BookRepository`.
3. Used `@Autowired` to inject `BookRepository` into `BookService`.
4. Tested by running the main application.

---

## ▶️ How to Run
```bash
mvn clean install
mvn exec:java -Dexec.mainClass="com.library.app.LibraryManagementApplication"
```

📌 Expected Output
```
Book: Effective Java (3rd Edition)
```
