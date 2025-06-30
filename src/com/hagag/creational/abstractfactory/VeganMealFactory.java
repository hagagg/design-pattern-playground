package com.hagag.creational.abstractfactory;

public class VeganMealFactory implements MealFactory{
    @Override
    public MainDish createMainDish() {
        return new VeganMainDish();
    }

    @Override
    public Dessert createDessert() {
        return new VeganDessert();
    }
}
