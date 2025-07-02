# 🧍 State Pattern

The **State** pattern allows an object to alter its behavior when its internal state changes.  
It appears as if the object changes its class.

---

## 🎯 Purpose

> Allow an object to change its behavior when its internal state changes.

---

## ✅ Benefits

- Eliminates complex `if-else` or `switch` logic  
- Promotes the **Open/Closed Principle**  
- Encapsulates state-specific behavior in dedicated classes  
- Makes state transitions explicit and manageable  

---

## 📌 Example in This Package

A **Game Character System**:

- **States**:
  - `StandingState`
  - `RunningState`
  - `JumpingState`
  - `CrouchingState`
- The `GameCharacter` (**context**) delegates input actions (`pressUp`, `pressDown`, `run`) to its current state.
- Each state defines what happens for each action, and can transition to another state.

The character’s behavior changes dynamically without modifying the context logic.
