package com.hagag.creational.abstractfactory;

public class KetoMealFactory implements MealFactory{
    @Override
    public MainDish createMainDish() {
        return new KetoMainDish();
    }

    @Override
    public Dessert createDessert() {
        return new KetoDessert();
    }
}
