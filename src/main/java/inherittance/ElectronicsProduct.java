package inherittance;

import java.math.BigDecimal;

public class ElectronicsProduct extends Product {
    String brand;
    String model;

    public ElectronicsProduct(String name, BigDecimal price, int quantity, String brand, String model) {
        super(name, price, quantity);
        this.brand = brand;
        this.model = model;
    }

    @Override
    protected void displayProduct() {
        super.displayProduct();
        System.out.println("Product Brand: " + brand);
        System.out.println("Product Model: " + model);
    }
}
