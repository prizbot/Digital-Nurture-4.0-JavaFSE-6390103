# Library Management System

## 1. Overview
This project implements a **Library Management System** in Java where users can search books by title using **Linear Search** and **Binary Search** algorithms.

---

## 2. Search Algorithms
### Linear Search
- Checks each element one by one until the desired item is found or list ends.
- **Time Complexity**: O(n)

### Binary Search
- Works on sorted data.
- Divides the search space in half repeatedly.
- **Time Complexity**: O(log n)

---

## 3. Features
- Add new books
- Display all books
- Search by title using linear search
- Search by title using binary search

---

## 4. Time Complexity Comparison
| Operation            | Linear Search | Binary Search |
|----------------------|--------------|--------------|
| Search (Best Case)   | O(1)         | O(1)         |
| Search (Worst Case)  | O(n)         | O(log n)     |

---

## 5. When to Use
- **Linear Search**: Small or unsorted datasets.
- **Binary Search**: Large, sorted datasets for efficiency.

---

## 6. How to Run
```bash
javac Book.java Library.java Main.java
java Main
