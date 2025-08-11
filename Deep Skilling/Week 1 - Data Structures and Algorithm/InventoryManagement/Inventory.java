import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
        System.out.println("Product added: " + product);
    }

    public void updateProduct(String productId, String name, int quantity, double price) {
        Product product = products.get(productId);
        if (product != null) {
            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(String productId) {
        Product removed = products.remove(productId);
        if (removed != null) {
            System.out.println("Product removed: " + removed);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayInventory() {
        System.out.println("Current Inventory:");
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}
