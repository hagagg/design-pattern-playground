package com.hagag.behavioral.strategy;

public class BankTransferPayment implements PaymentStrategy {
    private String bankAccount;

    public BankTransferPayment(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid amount: " + amount + " with bank account: " + bankAccount);
    }
}
