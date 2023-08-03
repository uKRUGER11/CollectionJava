package ListInterface.Challenge;

public class app {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Arroz", "Camil", 20.00, 5);
        cart.addItem("Feijão", "Pantera", 22.50, 3);
        cart.addItem("Spaguetti", "Renata", 10.00, 2);
        System.out.print("Seu carrinho: ");
        cart.showItems();
    }
}
