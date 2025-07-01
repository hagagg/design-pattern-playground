package com.hagag.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private int cardNumber;
    private String cardHolderName;

    public CreditCardPayment(int cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid amount: " + amount + " using CreditCard: " + cardHolderName);
    }
}
