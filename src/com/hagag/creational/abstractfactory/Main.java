package com.hagag.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        MealFactory factory = new VeganMealFactory();

        MainDish mainDish = factory.createMainDish();
        Dessert dessert = factory.createDessert();

        System.out.println("Today's meal :");
        mainDish.serve();
        dessert.serve();

        int totalCalories = mainDish.getCalories() + dessert.getCalories();
        System.out.println("Total Calories: " + totalCalories);
    }
}
