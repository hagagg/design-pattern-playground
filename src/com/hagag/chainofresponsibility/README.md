# 🔗 Chain of Responsibility Pattern

The **Chain of Responsibility** pattern allows a request to be passed through a chain of handlers until one of them handles it.

This decouples the sender of the request from the receiver, giving multiple objects a chance to process the request.

---

## 🎯 Purpose

> Pass a request along a chain of handlers, where each handler decides whether to handle it or pass it along.

---

## ✅ Benefits

- Promotes loose coupling between sender and receiver
- Makes it easy to add or remove handlers
- Follows the Open/Closed Principle

---

## 📌 Example in This Package

A **Payment Processing** system:
- Handlers: `Wallet`, `CreditCard`, `PayPal`
- Each handler checks if it can process the payment
- If not, it forwards the request to the next handler in the chain
