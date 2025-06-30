package com.hagag.creational.abstractfactory;

public class KetoMainDish implements MainDish {
    @Override
    public String getName() {
        return "Grilled Chicken";
    }

    @Override
    public int getCalories() {
        return 420;
    }

    @Override
    public void serve() {
        System.out.println("Serving: " + getName() + " - with: " + getCalories() + " calories");
    }
}
