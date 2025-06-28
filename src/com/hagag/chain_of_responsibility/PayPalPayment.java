package com.hagag.chain_of_responsibility;

public class PayPalPayment implements PaymentHandler {
    private double amount;
    private PaymentHandler next;

    public PayPalPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public void setNext(PaymentHandler next) {
        this.next = next;
    }

    @Override
    public void handlePayment(PaymentRequest paymentRequest) {
        if (paymentRequest.getAmount() <= amount) {
            System.out.println("You have paid $" + paymentRequest.getAmount() + " with PayPal");
        } else if (next != null) {
            next.handlePayment(paymentRequest);
        } else {
            System.out.println("Payment Failed.");
        }
    }

}
