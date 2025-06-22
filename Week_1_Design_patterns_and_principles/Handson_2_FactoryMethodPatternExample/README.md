# 🏭 Factory Method Pattern - Java Implementation
H!,

This project states the **Factory Method Design Pattern** using a simple Document Management System.  
The goal is to decouple the creation of document objects (Word, PDF, Excel) from their usage.

---

## 📦 Project Structure

```
FactoryMethodPatternExample/
├── Document.java                  // Interface for all documents
├── WordDocument.java             // Word document implementation
├── PdfDocument.java              // PDF document implementation
├── ExcelDocument.java            // Excel document implementation
├── DocumentFactory.java          // Abstract factory class
├── WordDocumentFactory.java      // Factory for Word documents
├── PdfDocumentFactory.java       // Factory for PDF documents
├── ExcelDocumentFactory.java     // Factory for Excel documents
└── FactoryTest.java              // Main test class
```

---

## 🧠 What is the Factory Method Pattern?

The **Factory Method Pattern** defines an interface for creating an object,  
but allows subclasses to alter the type of objects that will be created.

---

## 🚀 How It Works

- `Document`: Interface for all documents.
- `WordDocument`, `PdfDocument`, `ExcelDocument`: Concrete implementations.
- `DocumentFactory`: Abstract class that declares the factory method `createDocument()`.
- `WordDocumentFactory`, etc.: Concrete factories that override `createDocument()`.

---

## 🧪 Output Example

```
Opening Word Document...
Opening PDF Document...
Opening Excel Document...
```

---

## ✅ Benefits

- ✔️ Loose coupling between object creation and usage
- ✔️ Easy to extend (add new document types)
- ✔️ Follows SOLID principles (Open/Closed)

---

## 👨‍💻 Author

Sahithyan M – [CTS Digital Nurture 4.0 Week 1 Project]
