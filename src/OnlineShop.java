import java.util.*;
import java.util.stream.Collectors;

class OnlineShop {
    private List<Product> products;

    public OnlineShop() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> filterByCategory(String category) {
        return products.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public Product findProductByName(String name) {
        return products.stream()
                .filter(product -> product.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public void sortProductsByPrice() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public void displayAllProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
