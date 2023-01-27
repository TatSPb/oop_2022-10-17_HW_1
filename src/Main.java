import Products.Product;

import static Products.ProductList.printProductList;
import static Products.ProductList.productList;

public class Main {
    public static void main(String[] args) {

        Product cucumber = new Product("Огурцы", 150.00, 0.3);
        Product tomato = new Product("Помидоры", 250.00, 0.3);
        Product sweetPepper = new Product("Перец болгарский", 250.00, 0.3);
        Product dill = new Product("Укроп", 300.00, 0.03);
        Product oliveOil = new Product("Масло оливковое", 1000.00, 0.05);

        printProductList();
    }
}