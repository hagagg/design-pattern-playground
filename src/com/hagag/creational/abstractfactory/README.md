# 🧱 Abstract Factory Pattern

The **Abstract Factory** is a creational design pattern that provides an interface for creating **families of related objects** without specifying their concrete classes.

It helps ensure that products from the same family are used together, promoting consistency across related objects.

---

## 🎯 Purpose

> Create families of related or dependent objects without coupling them to their specific classes.

---

## ✅ Benefits

- Promotes **consistency** among related products
- Supports the **Open/Closed Principle**
- Makes adding new product families easier
- Decouples product creation from usage logic

---

## 📌 Example in This Package

A system that defines multiple factories (e.g., Vegan, Keto), where each factory produces a consistent set of related products.

This allows switching or extending product families without modifying client code.

---

## 🔁 Abstract Factory vs. Factory Method

| Feature                | Abstract Factory                                 | Factory Method                                 |
|------------------------|--------------------------------------------------|------------------------------------------------|
| Purpose                | Create **families** of related products          | Create **one** product from a family           |
| Products Created       | Multiple related objects                         | One object                                     |
| Number of Interfaces   | Multiple product interfaces (per family)         | One creator interface or base class            |
| Use Case               | When objects are **designed to work together**   | When object creation must be delegated         |

👉 Abstract Factory **may use Factory Methods** internally to create its individual products.

---
