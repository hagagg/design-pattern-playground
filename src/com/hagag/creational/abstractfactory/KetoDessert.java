package com.hagag.creational.abstractfactory;

public class KetoDessert implements Dessert {
    @Override
    public String getName() {
        return "Mahalabia";
    }

    @Override
    public int getCalories() {
        return 300;
    }

    @Override
    public void serve() {
        System.out.println("Serving: " + getName() + " - with: " + getCalories() + " calories");
    }
}
