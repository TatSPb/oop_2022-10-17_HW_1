package Recipes;

import Products.Product;

import java.util.HashSet;
import java.util.Set;

public class RecipeCollection {
    public static Set<Recipe> recipes = new HashSet<>();

    public static void addRecipe(Recipe recipe){
        for (var recipeInCollection : recipes) {
            if (recipeInCollection.getNameOfRecipe().equals(recipe.getNameOfRecipe())){
                throw new RuntimeException("Такой рецепт уже есть в коллекции");
            }
        }
        recipes.add(recipe);
    }

    public static void printRecipeCollection() {
        System.out.println("СПИСОК РЕЦЕПТОВ: ");

        for (Recipe recipe: recipes) {
            System.out.println(recipe.getNameOfRecipe() + ", стоимость ингредиентов: " + recipe.getCostOfRecipe() + " руб.");
        }
    }

}
