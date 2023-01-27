import Products.Product;
import Recipes.Recipe;

import static Products.ProductList.printProductList;
import static Recipes.RecipeCollection.printRecipeCollection;

public class Main {
    public static void main(String[] args) {

        Product cucumber = new Product("Огурцы", 150.00, 0.3);
        Product tomato = new Product("Помидоры", 250.00, 0.3);
        Product sweetPepper = new Product("Перец болгарский", 250.00, 0.3);
        Product dill = new Product("Укроп", 300.00, 0.03);
        Product oliveOil = new Product("Масло оливковое", 1000.00, 0.05);

        printProductList();

        System.out.println();
        Recipe vegetarianSalad = new Recipe("Овощной салат");

        vegetarianSalad.addProductToRecipe(cucumber, 0.3);
        vegetarianSalad.addProductToRecipe(tomato, 0.3);
        vegetarianSalad.addProductToRecipe(sweetPepper, 0.3);
        vegetarianSalad.addProductToRecipe(dill, 0.03);
        vegetarianSalad.addProductToRecipe(oliveOil, 0.05);

        printRecipeCollection();
    }
}