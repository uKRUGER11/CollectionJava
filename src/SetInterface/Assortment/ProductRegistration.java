package SetInterface.Assortment;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegistration {
    private Set<Product> productSet;

    public ProductRegistration() {
        this.productSet = new HashSet<>();
    }

    public void addProduct(long id, String name, double price, int quantity) {
        productSet.add(new Product(id, name, price, quantity));
    }

    public Set<Product> findAllByName() {
        Set<Product> productsPerName = new TreeSet<>(productSet);
        return productsPerName;
    }

    public Set<Product> findAllByPrice() {
        Set<Product> productsPerPrice = new TreeSet<>(new ComparatorPerPrice());
        productsPerPrice.addAll(productSet);
        return productsPerPrice;
    }
}
