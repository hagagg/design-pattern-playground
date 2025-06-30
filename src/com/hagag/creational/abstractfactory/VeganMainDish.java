package com.hagag.creational.abstractfactory;

public class VeganMainDish implements MainDish {
    @Override
    public String getName() {
        return "Koshary";
    }

    @Override
    public int getCalories() {
        return 500;
    }

    @Override
    public void serve() {
        System.out.println("Serving: " + getName() + " - with: " + getCalories() + " calories");
    }
}
