import java.util.ArrayList;
import java.util.List;

public class MainProduct {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        setProducts(products);
        CustomerProduct customer1 = new CustomerProduct("Juan", products);
        CustomerProduct customer2 = new CustomerProduct("David", products);
        CustomerProduct customer3 = new CustomerProduct("Emilio", products);

        long initialTime = System.currentTimeMillis();
        CashierProduct cashier1 = new CashierProduct("Valentina", customer1, initialTime);
        CashierProduct cashier2 = new CashierProduct("Valeria", customer2, initialTime);
        CashierProduct cashier3 = new CashierProduct("Juliana", customer3, initialTime);

        cashier1.start();
        cashier2.start();
        cashier3.start();
    }

    private static void setProducts(List<Product> products) {

        Product Galletas = new Product("Galletas", 10000, 76);
        Product Salchichas = new Product("Salchichas", 7600, 30);
        Product Huevos = new Product("Huevos", 700, 90);

        products.add(Galletas);
        products.add(Salchichas);
        products.add(Huevos);
    }
}