package DesignPattern.BehavioralPattern.Template;

public class PastaRecipe extends Recipe {
    @Override
    protected void prepareIngredients() {
        System.out.println("Prepare pasta, tomato sauce, cheese, and toppings");
    }

    @Override
    protected void cookIngredients() {
        System.out.println("Boil the pasta for 10 minutes");
    }
}
