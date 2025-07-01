package com.hagag.behavioral.strategy;

public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout (double amount) {
        if (paymentStrategy ==  null) {
            throw new IllegalStateException("You must set PaymentStrategy!");
        }
        paymentStrategy.pay(amount);
    }
}
