# 🏭 Factory Method Pattern

The **Factory Method** is a creational design pattern that defines an interface for creating objects but lets subclasses decide which class to instantiate.

It helps decouple the client code from specific classes by relying on a factory to create the desired object.

---

## 🎯 Purpose

> Create objects without specifying the exact class of the object to be created.

---

## ✅ Benefits

- Supports the **Open/Closed Principle**
- Simplifies code maintenance and extension
- Encapsulates object creation logic

---

## 📌 Example in This Package

A **Notification System**:
- Factory creates `Email`, `SMS`, or `Push` notifications.
- Client code only interacts with the factory and the notification interface.

