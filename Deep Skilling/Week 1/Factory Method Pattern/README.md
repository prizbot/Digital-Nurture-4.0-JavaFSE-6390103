# 🏗️ Factory Method Pattern Example

### 📍 Week 1 Exercise – Deep Skilling Program (Cognizant Java FSE - Digital Nurture 4.0)

This Java project demonstrates the **Factory Method Design Pattern** through a document management system that dynamically creates different types of documents (Word, PDF, Excel).

---

### 📂 Folder Structure

```
FactoryMethodPatternExample/
└── src/
    └── com/
        └── factory/
            ├── Document.java
            ├── WordDocument.java
            ├── PdfDocument.java
            ├── ExcelDocument.java
            ├── DocumentFactory.java
            ├── WordDocumentFactory.java
            ├── PdfDocumentFactory.java
            ├── ExcelDocumentFactory.java
            └── Main.java
```

---

### 🚀 How to Run

1. Navigate to the `src` folder:
    ```bash
    cd FactoryMethodPatternExample/src
    ```

2. Compile all files:
    ```bash
    javac com/factory/*.java
    ```

3. Run the program:
    ```bash
    java com.factory.Main
    ```

---

### 💡 Output Sample

```
Opening a Word document.
Opening a PDF document.
Opening an Excel document.
```

---

👩‍💻 **Developed by:** [Your Name]  
🗂️ **Program:** Cognizant Java FSE - Digital Nurture 4.0