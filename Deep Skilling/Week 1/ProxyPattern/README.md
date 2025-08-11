# Proxy Pattern in Java

## 1. Overview
The **Proxy Pattern** is a structural design pattern that provides a surrogate or placeholder for another object to control access to it.

In this example, we simulate an image viewer application that loads images from a remote server.  
The proxy ensures that the actual image is only loaded when it is first needed, and then cached for future use.

---

## 2. Components in This Implementation

### 2.1 Subject Interface
**`Image`**  
- Defines the common interface for `RealImage` and `ProxyImage`.  
- Method: `display()` — displays the image.

### 2.2 Real Subject
**`RealImage`**  
- Represents the actual object that loads the image from a remote server.  
- Performs the real work of loading and displaying the image.

### 2.3 Proxy
**`ProxyImage`**  
- Maintains a reference to `RealImage`.  
- Implements lazy initialization — loads the image only when `display()` is called for the first time.  
- Caches the loaded image for future use.

---

## 3. How It Works
1. The client interacts with `ProxyImage` instead of `RealImage` directly.
2. On the first `display()` call, `ProxyImage` creates a `RealImage` object and loads the image.
3. Subsequent calls to `display()` skip loading and use the cached `RealImage`.

---

## 4. UML Diagram
Image <--------- RealImage  
^  
|  
ProxyImage

---

## 5. Advantages
- Improves performance with **lazy loading**.
- Reduces memory usage for objects that may not be needed immediately.
- Adds a layer of control for accessing the real object.

---

## 6. Example Output
```text
First display call for image1:
Loading image from remote server: photo1.jpg
Displaying image: photo1.jpg

Second display call for image1:
Displaying image: photo1.jpg

First display call for image2:
Loading image from remote server: photo2.jpg
Displaying image: photo2.jpg
```

---

## 7. How to Run

Save all `.java` files in the same folder.

**Compile:**
```bash
javac *.java
```

**Run:**
```bash
java ProxyPatternDemo
```

---

## 8. Conclusion
The Proxy Pattern is ideal for scenarios where:

- Object creation is expensive (like loading images over a network).
- You want to defer initialization until it’s absolutely necessary.
