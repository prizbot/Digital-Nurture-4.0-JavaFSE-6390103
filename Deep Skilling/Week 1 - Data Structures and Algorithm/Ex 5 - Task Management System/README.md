# Task Management System

## 1. Overview
This project implements a **Task Management System** using a **Singly Linked List** in Java.  
It supports adding, searching, traversing, and deleting tasks efficiently.

---

## 2. Linked List Types
- **Singly Linked List** → Each node points to the next node only.
- **Doubly Linked List** → Each node points to both the previous and next node.
- **Circular Linked List** → Last node points back to the first node.

---

## 3. Features
- Add new tasks
- Search tasks by ID
- Display all tasks
- Delete tasks by ID

---

## 4. Time Complexity
| Operation       | Time Complexity |
|----------------|-----------------|
| Add            | O(n)            |
| Search         | O(n)            |
| Traverse       | O(n)            |
| Delete         | O(n)            |

---

## 5. Advantages of Linked Lists Over Arrays
- **Dynamic Size**: Can grow or shrink at runtime without memory reallocation.
- **Efficient Insert/Delete**: No need to shift elements like in arrays.
- **Memory Utilization**: Works well with scattered memory locations.

---

## 6. How to Run
```bash
javac Task.java TaskNode.java TaskLinkedList.java Main.java
java Main
