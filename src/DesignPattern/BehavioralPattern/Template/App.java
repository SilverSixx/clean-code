package DesignPattern.BehavioralPattern.Template;

public class App {

    private RecipeService recipeService;

    public App() {
        recipeService = new RecipeService();
    }

    public void make() {
        Recipe pizzaRecipe = new PizzaRecipe();
        Recipe pastaRecipe = new PastaRecipe();

        recipeService.cook(pizzaRecipe);
        recipeService.cook(pastaRecipe);
    }
}
