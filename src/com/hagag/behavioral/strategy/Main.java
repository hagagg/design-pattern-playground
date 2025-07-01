package com.hagag.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.setPaymentStrategy(new PayPalPayment("ahmad.hagag@gmail.com"));
        paymentService.checkout(1000.00);

        paymentService.setPaymentStrategy(new CreditCardPayment(95211475 , "ahmed hagag"));
        paymentService.checkout(500.00);

        paymentService.setPaymentStrategy(new BankTransferPayment("955215184856211"));
        paymentService.checkout(1800.00);
    }
}
