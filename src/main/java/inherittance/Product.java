package inherittance;

import java.math.BigDecimal;
import java.util.UUID;

public class Product {
    protected UUID id;
    protected String name;
    protected BigDecimal price;
    protected int quantity;

    public Product(String name, BigDecimal price, int quantity) {
        this(getProductId(), name, price, quantity);
    }

    public Product(UUID id, String name, BigDecimal price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    protected void displayProduct() {
        System.out.println("-----Product Details-----");
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
        System.out.println("Product Quantity: " + quantity);
    }

    private static UUID getProductId() {
        return UUID.randomUUID();
    }

}
