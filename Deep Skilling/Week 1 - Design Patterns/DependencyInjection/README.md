# Dependency Injection in Java

## Overview
**Dependency Injection (DI)** is a design pattern that removes the responsibility of creating dependencies from a class, instead providing them from outside (injected).  
This improves testability, maintainability, and flexibility.

---

## Components
- **CustomerRepository**: Interface for customer data access.
- **CustomerRepositoryImpl**: Concrete repository implementation.
- **CustomerService**: Service layer depending on `CustomerRepository`.
- **DependencyInjectionDemo**: Demonstrates DI via constructor injection.

---

## How to Run
```bash
javac *.java
java DependencyInjectionDemo
```