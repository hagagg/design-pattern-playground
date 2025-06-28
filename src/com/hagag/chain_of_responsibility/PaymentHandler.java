package com.hagag.chain_of_responsibility;

public interface PaymentHandler {

    void setNext (PaymentHandler next);
    void handlePayment (PaymentRequest paymentRequest);
}
