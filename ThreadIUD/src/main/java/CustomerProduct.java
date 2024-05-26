import java.util.List;

public class CustomerProduct {
    private final String name;
    private final List<Product> products;

    public CustomerProduct(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

}
