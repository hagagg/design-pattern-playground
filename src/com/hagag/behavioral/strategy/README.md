# 🧠 Strategy Pattern

The **Strategy** pattern allows selecting an algorithm's behavior at runtime by encapsulating each one in a separate class.

It promotes flexibility by letting you change the behavior of a class without modifying its code.

---

## 🎯 Purpose

> Define a family of algorithms, encapsulate each one, and make them interchangeable at runtime.

---

## ✅ Benefits

- Eliminates complex `if-else` or `switch` logic  
- Promotes the **Open/Closed Principle**  
- Makes the behavior easily reusable and testable  
- Enables changing behavior dynamically  

---

## 📌 Example in This Package

A **Payment System**:

- **Strategies**:
  - `CreditCardPayment`
  - `PayPalPayment`
  - `BankTransferPayment`
- The `PaymentService` (**context**) delegates the `pay()` action to the selected strategy.
- The payment method can be switched at runtime without changing the service logic.

