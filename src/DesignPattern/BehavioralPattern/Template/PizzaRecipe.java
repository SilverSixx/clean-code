package DesignPattern.BehavioralPattern.Template;

public class PizzaRecipe extends Recipe {
    @Override
    protected void prepareIngredients() {
        System.out.println("Prepare pizza dough, tomato sauce, cheese, and toppings");
    }

    @Override
    protected void cookIngredients() {
        System.out.println("Bake the pizza at 400 degrees for 20 minutes");
    }

}
