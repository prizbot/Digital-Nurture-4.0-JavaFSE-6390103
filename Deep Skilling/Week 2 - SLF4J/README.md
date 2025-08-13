# Week 2 – SLF4J

This project demonstrates how to use **SLF4J** with **Logback** for logging in Java applications.

## 📂 Project Structure
```
Week 2 - SLF4J/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/
│   │   │       ├── LoggingExample.java
│   │   │       ├── ParameterizedLoggingExample.java
│   │   │       └── MultiAppenderExample.java
│   │   └── resources/
│   │       └── logback.xml
```

## 🚀 How to Run
1. Clone the repository.
2. Navigate to the `Week 2 - SLF4J` directory.
3. Run:
   ```bash
   mvn compile
   mvn exec:java -Dexec.mainClass="com.example.LoggingExample"
   mvn exec:java -Dexec.mainClass="com.example.ParameterizedLoggingExample"
   mvn exec:java -Dexec.mainClass="com.example.MultiAppenderExample"
   ```

## 📌 Exercises Covered
- **Exercise 1:** Logging error messages and warnings.
- **Exercise 2:** Parameterized logging.
- **Exercise 3:** Multiple appenders (console + file).

## 📜 Notes
- Logs will be printed to the console and saved in `app.log`.
- Modify `logback.xml` to customize logging format, levels, and appenders.

## 📚 References
- [SLF4J Documentation](http://www.slf4j.org/manual.html)
- [Logback Documentation](http://logback.qos.ch/documentation.html)

---
**Author:** Priyadharshini NRS  
**Superset ID:** 6390103  
**Email:** priyadharshininrs@gmail.com  
**LinkedIn:** [www.linkedin.com/in/priyadharshininrs](https://www.linkedin.com/in/priyadharshininrs)
