# 🔒 Singleton Pattern - Java Implementation

This project demonstrates the **Singleton Design Pattern** using a simple `Logger` class.  
The goal is to ensure that **only one instance** of the Logger exists throughout the application's lifecycle.

---

## 📦 Project Structure

```
SingletonPatternExample/
├── Logger.java         // Singleton class
└── SingletonTest.java  // Test class to verify singleton behavior
```

---

## 🧠 What is the Singleton Pattern?

The **Singleton Pattern** ensures that a class has **only one instance** and provides a **global point of access** to it.

---

## 🛠️ How It Works

- The constructor of `Logger` is **private**, so no one can `new` it from outside.
- A **private static instance** is held inside the class.
- A **public static method** (`getInstance()`) returns the same instance every time.
- Only one `Logger` is ever created, no matter how many times you call `getInstance()`.

---

## 🧪 Output Example

```
Logger was Created
[The Log]: This is logger 1
[The Log]: This is logger 2
Same Instances Confirmed
```

---

## ✅ Benefits

- ✔️ Guarantees a single shared instance
- ✔️ Saves memory/resources
- ✔️ Useful for logging, config managers, etc.

---

## ⚠️ Notes

- Be careful in **multi-threaded environments** — use synchronization or double-checked locking if needed.
- Can be combined with **lazy loading** for efficiency.

---

## 👨‍💻 Author

Sahithyan – [CTS Digital Nurture 4.0 Week 1 Project]
