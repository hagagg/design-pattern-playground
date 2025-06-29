package com.hagag.creational.singleton;

public class ATM {
    private double balance;
    private static ATM instance;

    private ATM() {
        this.balance = 1000;
        System.out.println("ATM initalized with balance: " + this.balance);
    }

    public static ATM getInstance() {
        if (instance == null) {
            instance = new ATM();
        }
        return instance;
    }

    public double getBalance() {
        return balance;
    }

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
