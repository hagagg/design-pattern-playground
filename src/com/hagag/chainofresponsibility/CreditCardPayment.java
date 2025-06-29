package com.hagag.chainofresponsibility;

public class CreditCardPayment implements PaymentHandler{
    private double balance;
    private PaymentHandler next;

    public CreditCardPayment(double balance) {
        this.balance = balance;
    }

    @Override
    public void setNext(PaymentHandler next) {
        this.next = next;
    }

    @Override
    public void handlePayment(PaymentRequest paymentRequest) {
        if (paymentRequest.getAmount() <= balance) {
            System.out.println("You have paid $" + paymentRequest.getAmount() + " with Credit Card");
        } else if (next != null) {
            next.handlePayment(paymentRequest);
        } else {
            System.out.println("Payment Failed.");
        }
    }
}
