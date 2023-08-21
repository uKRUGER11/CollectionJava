package SetInterface.Assortment;

public class Main {
    public static void main(String[] args) {
        ProductRegistration productRegistration = new ProductRegistration();

        productRegistration.addProduct(1L, "Iphone 14", 900.0, 10);
        productRegistration.addProduct(2L, "Headset", 500.00, 3);
        productRegistration.addProduct(1L, "Mouse", 300.00, 2);
        productRegistration.addProduct(9L, "Teclado", 400.00, 1);

        System.out.println(productRegistration.findAllByName());
        System.out.println(productRegistration.findAllByPrice());
    }
}
