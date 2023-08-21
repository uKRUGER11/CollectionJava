package MapInterface.Search;

public class Main {
    public static void main(String[] args) {
        ProductStock stock = new ProductStock();

        stock.addProduct(2L, "Mouse", 5.0, 10);
        stock.addProduct(1L, "Iphone 14", 10.0, 4);
        stock.addProduct(3L, "Teclado", 15.0, 2);
        stock.findAll();

        System.out.println("Valor total do estoque:  R$" + stock.TotalStockValue());
        System.out.println("Produto mais caro: " + stock.mostProduct());
        System.out.println("Produto mais barato: " + stock.leastProduct());
        System.out.println("Produto que está em maior quantidade e valor no estoque: "+ stock.maxValuePerQuantity());
    }
}
