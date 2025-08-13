# 📦 Week 3 - Spring Core and Maven

## 📝 Overview
This project contains **9 exercises** that progressively build skills in **Spring Core**, **Maven**, **Spring AOP**, and **Spring Boot** development.
Each exercise is organized into its own folder, containing its own source code and configuration.

---

## 📂 Directory Structure

```
Week 3 - Spring Core and Maven/
├── Exercise 1 - Configuring a Basic Spring Application/
├── Exercise 2 - Implementing Dependency Injection/
├── Exercise 3 - Implementing Logging with Spring AOP/
├── Exercise 4 - Creating and Configuring a Maven Project/
├── Exercise 5 - Configuring the Spring IoC Container/
├── Exercise 6 - Configuring Beans with Annotations/
├── Exercise 7 - Implementing Constructor and Setter Injection/
├── Exercise 8 - Implementing Basic AOP with Spring/
└── Exercise 9 - Creating a Spring Boot Application/
```

---

## 📖 Exercise Overviews

### **Exercise 1 – Configuring a Basic Spring Application**
- Create a Maven-based Spring project.
- Define beans for `BookService` and `BookRepository` in `applicationContext.xml`.
- Load Spring context in `LibraryManagementApplication`.

### **Exercise 2 – Implementing Dependency Injection**
- Modify Spring XML to wire `BookRepository` into `BookService` using **Setter Injection**.
- Demonstrate Spring IoC container.

### **Exercise 3 – Implementing Logging with Spring AOP**
- Add **Spring AOP** dependency.
- Create `LoggingAspect` to log method execution times.
- Enable AspectJ support in `applicationContext.xml`.

### **Exercise 4 – Creating and Configuring a Maven Project**
- Create Maven project structure.
- Add dependencies for **Spring Context, AOP, and WebMVC**.
- Configure Maven Compiler plugin.

### **Exercise 5 – Configuring the Spring IoC Container**
- Centralize bean configuration in `applicationContext.xml`.
- Define service and repository beans.
- Load context in main application.

### **Exercise 6 – Configuring Beans with Annotations**
- Enable **component scanning**.
- Use `@Service` and `@Repository` annotations instead of XML bean definitions.

### **Exercise 7 – Implementing Constructor and Setter Injection**
- Demonstrate **Constructor Injection** in XML.
- Demonstrate **Setter Injection** in XML.
- Show flexibility of different injection methods.

### **Exercise 8 – Implementing Basic AOP with Spring**
- Create `LoggingAspect` with `@Before` and `@After` advice methods.
- Enable AspectJ proxying in Spring config.

### **Exercise 9 – Creating a Spring Boot Application**
- Build a **Spring Boot REST API** with CRUD operations for books.
- Use **Spring Data JPA** and **H2 Database**.
- Expose REST endpoints for book management.
