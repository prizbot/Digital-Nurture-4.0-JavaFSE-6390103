# Inventory Management System

## 1. Problem Understanding
Efficient data structures are essential for handling large inventories because:
- They enable **fast lookups** for products.
- They support **quick updates** without scanning the entire list.
- They ensure **scalability** when inventory grows.

---

## 2. Chosen Data Structure
We use a **HashMap** with `productId` as the key because:
- **Add**: O(1) average
- **Update**: O(1) average (direct key access)
- **Delete**: O(1) average (remove by key)
- **Search**: O(1) average

If we used an **ArrayList**:
- Add: O(1) (append)
- Update: O(n) (search by id)
- Delete: O(n) (search + remove)
- Search: O(n) (linear scan)

---

## 3. How to Run
```bash
javac *.java
java InventoryManagementDemo
```

---

## 4. Sample Output
```text
Product added: Product[ID=P101, Name=Laptop, Qty=10, Price=75000.0]
Product added: Product[ID=P102, Name=Smartphone, Qty=20, Price=25000.0]
Current Inventory:
Product[ID=P101, Name=Laptop, Qty=10, Price=75000.0]
Product[ID=P102, Name=Smartphone, Qty=20, Price=25000.0]

Updating Product P101...
Product updated: Product[ID=P101, Name=Gaming Laptop, Qty=8, Price=85000.0]
Current Inventory:
Product[ID=P101, Name=Gaming Laptop, Qty=8, Price=85000.0]
Product[ID=P102, Name=Smartphone, Qty=20, Price=25000.0]

Deleting Product P102...
Product removed: Product[ID=P102, Name=Smartphone, Qty=20, Price=25000.0]
Current Inventory:
Product[ID=P101, Name=Gaming Laptop, Qty=8, Price=85000.0]
```
---

**Author:** Priyadharshini NRS  
**Superset ID:** 6390103  
**Email:** [priyadharshininrs@gmail.com](mailto:priyadharshininrs@gmail.com)  
**LinkedIn:** [www.linkedin.com/in/priyadharshininrs](https://www.linkedin.com/in/priyadharshininrs)
