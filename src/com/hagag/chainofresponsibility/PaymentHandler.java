package com.hagag.chainofresponsibility;

public interface PaymentHandler {

    void setNext (PaymentHandler next);
    void handlePayment (PaymentRequest paymentRequest);
}
