# Employee Management System

## Overview
This project demonstrates an **Employee Management System** implemented using an array data structure.
It supports adding, searching, traversing, and deleting employees.

## Array Representation
Arrays are stored in **contiguous memory locations**.

Advantages:
- Fast access (O(1)) using index.
- Cache-friendly due to sequential storage.

## Features
- Add new employees
- Search employees by ID
- Display all employees
- Delete employees by ID

## Time Complexity
| Operation | Time Complexity |
|-----------|-----------------|
| Add       | O(1)            |
| Search    | O(n)            |
| Traverse  | O(n)            |
| Delete    | O(n)            |

## Limitations
- Fixed size (cannot grow dynamically).
- Deletion and insertion in the middle require shifting elements.
- Searching is O(n) unless array is sorted.

## How to Run
```bash
javac Employee.java EmployeeManagementSystem.java Main.java
java Main
```
