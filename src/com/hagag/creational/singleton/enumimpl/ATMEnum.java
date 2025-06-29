package com.hagag.creational.singleton.enumimpl;

    /*
    Advantages of Enum in Singleton:
     * Thread-safe by default (no need for synchronization)
     * Serialization-safe — no need for readResolve()
     * Reflection-safe — can't break into it via reflection
     * Simple and concise syntax — no boilerplate code
     */

public enum ATMEnum {
    INSTANCE;

    private double balance;

    private ATMEnum() {
        this.balance = 1000;
        System.out.println("ATM initialized with balance: " + this.balance);
    }

    public double getBalance() {
        return balance;
    }


    // Without enum (with normal class) I need to create a static method to get instance.


    public void deposit (double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw (double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount.");
        } else if (amount > balance) {
            System.out.println("Invalid withdraw amount. Not enough balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

}
