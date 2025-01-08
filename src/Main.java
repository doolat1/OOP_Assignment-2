import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        OnlineShop shop = new OnlineShop();

        Product laptop = new Electronics("Laptop", 1200.0, "Electronics", 2);
        Product tShirt = new Clothing("T-shirt", 25.0, "Clothing", "M");
        Product phone = new Electronics("Phone", 800.0, "Electronics", 1);
        Product jeans = new Clothing("Jeans", 45.0, "Clothing", "L");

        shop.addProduct(laptop);
        shop.addProduct(tShirt);
        shop.addProduct(phone);
        shop.addProduct(jeans);

        System.out.println("All Products:");
        shop.displayAllProducts();

        System.out.println("\nSearching for 'Phone':");
        System.out.println(shop.findProductByName("Phone"));

        System.out.println("\nFiltering by 'Clothing':");
        List<Product> clothing = shop.filterByCategory("Clothing");
        clothing.forEach(System.out::println);

        System.out.println("\nSorted Products by Price:");
        shop.sortProductsByPrice();
        shop.displayAllProducts();
    }
}
