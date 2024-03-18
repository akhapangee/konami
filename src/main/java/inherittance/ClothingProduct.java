package inherittance;

import java.math.BigDecimal;

public class ClothingProduct extends Product {
    String size;
    String material;
    String color;

    public ClothingProduct(String name, BigDecimal price, int quantity, String size, String material, String color) {
        super(name, price, quantity);
        this.size = size;
        this.material = material;
        this.color = color;
    }

    @Override
    protected void displayProduct() {
        super.displayProduct();
        System.out.println("Product Size: " + size);
        System.out.println("Product Material: " + material);
        System.out.println("Product Color: " + color);
    }
}
