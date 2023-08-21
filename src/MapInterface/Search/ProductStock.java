package MapInterface.Search;

import java.util.HashMap;
import java.util.Map;

public class ProductStock {
    private Map<Long, Product> productStockMap;

    public ProductStock() {
        this.productStockMap = new HashMap<>();
    }

    public void addProduct(long id, String name, double price, int quantity) {
        productStockMap.put(id, new Product(name, price, quantity));
    }

    public double TotalStockValue() {
        double amount = 0;
        if (!productStockMap.isEmpty()) {
            for (Product p : productStockMap.values()) {
                amount += p.getQuantity() * p.getPrice();
            }
        }
        return amount;
    }

    public Product mostProduct() {
        Product mostProduct = null;
        double highestPrice = Double.MIN_VALUE;
        if (!productStockMap.isEmpty()){
            for (Product p : productStockMap.values()) {
                if (p.getPrice() > highestPrice) {
                    mostProduct = p;
                    highestPrice = p.getPrice();
                }
            }
        }
        return mostProduct;
    }

    public Product leastProduct() {
        Product leastProduct = null;
        double lowestPrice = Double.MAX_VALUE;
        if (!productStockMap.isEmpty()){
            for (Product p : productStockMap.values()) {
                if (p.getPrice() < lowestPrice) {
                    leastProduct = p;
                    lowestPrice = p.getPrice();
                }
            }
        }
        return leastProduct;
    }

    public Product maxValuePerQuantity() {
        Product prod = null;
        double maxValue = Double.MIN_VALUE;
        if (!productStockMap.isEmpty()){
            for (Product p : productStockMap.values()) {
               if (p.getQuantity() * p.getPrice() > maxValue) {
                   prod = p;
                   maxValue = p.getPrice() * p.getQuantity();
               }
            }

        }
        return prod;
    }

    public void findAll() {
        System.out.println(productStockMap);
    }
}
