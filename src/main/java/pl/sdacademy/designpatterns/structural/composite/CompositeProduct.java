package pl.sdacademy.designpatterns.structural.composite;

import java.util.Arrays;
import java.util.List;

public class CompositeProduct implements Product {
    private List<Product> products;

    public CompositeProduct(Product ... products) {
        this.products = Arrays.asList(products);
    }

    @Override
    public double getPrice() {
        return products.stream()
                .mapToDouble(product -> product.getPrice())
                .sum();
    }
}
