package com.hagag.creational.abstractfactory;

public class VeganDessert implements Dessert {
    @Override
    public String getName() {
        return "Basbousa";
    }

    @Override
    public int getCalories() {
        return 350;
    }

    @Override
    public void serve() {
        System.out.println("Serving: " + getName() + " - with: " + getCalories() + " calories");
    }
}
