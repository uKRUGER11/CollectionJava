package ListInterface.Challenge;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> shoppingList;

    public ShoppingCart() {
        this.shoppingList = new ArrayList<Item>();
    }

    public void addItem(String name,String brand, double price, int quantity) {
        shoppingList.add(new Item(name, brand, price, quantity));
    }

    public void showItems() {
        System.out.println(shoppingList);
    }
}
