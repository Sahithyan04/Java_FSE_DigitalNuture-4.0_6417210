# BuilderPatternExample

## 💡 Overview

This project demonstrates the **Builder Design Pattern** using a `Computer` class. The Builder pattern helps in constructing complex objects step-by-step with better readability and flexibility.

## 🧱 Pattern Used

**Builder Pattern**  
- Useful when an object has a lot of optional attributes.
- Makes object creation readable and scalable.
- Avoids telescoping constructors.

## 📁 Files

```
BuilderPatternExample/
├── Computer.java       # The product class with a static nested Builder
└── BuilderTest.java    # Test class that builds and prints different Computer configurations
```

## ⚙️ How It Works

- `Computer.Builder` is a static inner class with setter-like methods.
- You can chain methods like `.setStorage()` or `.enableWifi()` to customize the build.
- Finally, `.build()` returns a fully configured `Computer` object.

## 🧪 Example Usage

```java
Computer gamingRig = new Computer.Builder("Intel i9", "32GB")
    .setStorage("2TB SSD")
    .enableWifi()
    .enableBluetooth()
    .build();
```

## 🖨️ Sample Output

```
Gaming Rig: Computer [CPU=Intel i9, RAM=32GB, Storage=2TB SSD, WiFi=true, Bluetooth=true]
Office PC: Computer [CPU=Intel i5, RAM=8GB, Storage=512GB HDD, WiFi=false, Bluetooth=false]
```

## ✅ Benefits

- Clean object creation with optional values
- Easily maintainable and extendable
- Great for objects with many configurations

