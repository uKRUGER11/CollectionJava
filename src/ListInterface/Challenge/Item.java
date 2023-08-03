package ListInterface.Challenge;

public class Item {
    private String name;
    private String brand;
    private double price;
    private int quantity;

    public Item(String name, String brand, double price, int quantity) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return name + " - " + brand + " R$" + price + " " + quantity + "uni";
    }
}
