package com.hagag.behavioral.chainofresponsibility;

public class WalletPayment implements PaymentHandler{
    private double balance;
    private PaymentHandler next;

    public WalletPayment(double balance) {
        this.balance = balance;
    }

    @Override
    public void setNext(PaymentHandler next) {
        this.next = next;
    }

    @Override
    public void handlePayment(PaymentRequest paymentRequest) {
        if (paymentRequest.getAmount() <= balance) {
            System.out.println("You have paid $" + paymentRequest.getAmount() + " with wallet");
        } else if (next != null) {
            next.handlePayment(paymentRequest);
        } else {
            System.out.println("Payment Failed.");
        }
    }
}
