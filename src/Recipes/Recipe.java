package Recipes;

import Products.Product;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static Recipes.RecipeCollection.recipes;

public class Recipe {
    private final String nameOfRecipe;
    private double costOfRecipe;
    private final Set<Product> products = new HashSet<>();

    public Recipe(String nameOfRecipe) {
        this.nameOfRecipe = nameOfRecipe;
        this.costOfRecipe = 0;
        recipes.add(this);
    }

    public void addProductToRecipe(Product product, double quantity){
        if(products.contains(product)){
            throw new RuntimeException("Продукт уже добавлен в рецепт");
        }
        products.add(product);
        costOfRecipe = costOfRecipe + product.getPrice()*product.getQuantity();
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipes = (Recipe) o;
        return costOfRecipe == recipes.costOfRecipe && Objects.equals (nameOfRecipe, recipes.nameOfRecipe) &&
                Objects.equals (products, recipes.getProducts()); ///???
    }


    @Override
    public int hashCode() {
        return Objects.hash(nameOfRecipe, products, costOfRecipe);
    }

    public String getNameOfRecipe() {
        return nameOfRecipe;
    }
    public double getCostOfRecipe() {
        return costOfRecipe;
    }
    public Set<Product> getProducts() {
        return products;
    }

}
