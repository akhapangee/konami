package inherittance;

import java.math.BigDecimal;

public class ProductApp {

    public static void main(String[] args) {
        ClothingProduct clothingProduct = new ClothingProduct("T-Shirt", new BigDecimal("10.10"), 1, "M", "Cotton", "Blue");
        clothingProduct.displayProduct();

        System.out.println("=======================================");

        ElectronicsProduct electronicsProduct = new ElectronicsProduct("MacBook Pro", new BigDecimal("4300.00"), 1, "Apple", "2021");
        electronicsProduct.displayProduct();

    }
}
