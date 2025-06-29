package com.hagag.creational.singleton;

public class Main {
    public static void main(String[] args) {

        ATM atm1 = ATM.getInstance();
        atm1.withdraw(500);
        atm1.deposit(1000);
        atm1.withdraw(2000);

        ATM atm2 = ATM.getInstance();

        System.out.println("________________________");
        System.out.println("Final Balance from atm1: " + atm1.getBalance());
        System.out.println("Final Balance from atm2: " + atm2.getBalance());

    }
}
