# 🔒 Singleton Pattern

The **Singleton** pattern ensures a class has **only one instance** and provides a global access point to it.

This is useful when only one object is needed to coordinate actions system-wide — such as an ATM machine where multiple users interact with the same instance.

---

## 🎯 Purpose

> Restrict object creation to a single instance and provide global access to it.

---

## ✅ Benefits

- Ensures a single, shared instance
- Controls access to shared resources
- Useful for managing global states

---

## 📌 Example in This Package

An **ATM** system:
- Only one ATM instance is created
- Access is controlled through a static method
- Demonstrates real-world need for a single point of interaction
