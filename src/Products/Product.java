package Products;

import static Products.ProductList.addProductToList;

public class Product {
    private final String name;
    private final double price;
    private final double quantity;

    public Product(String name, double price, double quantity) {
        if (name != null && !name.isBlank() && !name.isEmpty() && price > 0 && quantity >0) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
            addProductToList(this);
        } else {
            throw new RuntimeException(name + ": заполните карточку товара полностью");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public double getQuantity() {
        return quantity;
    }
}
