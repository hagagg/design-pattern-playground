package com.hagag.behavioral.chainofresponsibility;

public class Main {
    public static void main(String[] args) {

        PaymentHandler wallet = new WalletPayment(1000);
        PaymentHandler creditCard = new CreditCardPayment(3000);
        PaymentHandler payPal = new PayPalPayment(5000);

        wallet.setNext(creditCard);
        creditCard.setNext(payPal);

        PaymentRequest request1 = new PaymentRequest(900);
        PaymentRequest request2 = new PaymentRequest(2000);
        PaymentRequest request3 = new PaymentRequest(4000);
        PaymentRequest request4 = new PaymentRequest(7000);

        wallet.handlePayment(request1);
        System.out.println("______________________________");
        wallet.handlePayment(request2);
        System.out.println("______________________________");
        wallet.handlePayment(request3);
        System.out.println("______________________________");
        wallet.handlePayment(request4);

    }
}