package Products;

import java.util.HashSet;
import java.util.Set;

public class ProductList {
    public static Set<Product> productList = new HashSet<>();

    public static void addProductToList(Product newProduct) {
        if (!productList.add(newProduct)) {
            throw new RuntimeException("Данный продукт уже есть в списке");
        }
    }

    public static void printProductList() {
        System.out.println("СПИСОК ПРОДУКТОВ: ");

        for (Product product : productList) {
            System.out.println(product.getName() + ", цена: " + product.getPrice() + " руб/кг," + " требуемое количество: "+ product.getQuantity() + " кг.");
        }
    }
    public static Set<Product> getProductList() {
        return productList;
    }

}
