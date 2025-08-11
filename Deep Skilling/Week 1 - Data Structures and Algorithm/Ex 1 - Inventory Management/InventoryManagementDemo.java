public class InventoryManagementDemo {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product("P101", "Laptop", 10, 75000.00);
        Product p2 = new Product("P102", "Smartphone", 20, 25000.00);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        inventory.displayInventory();

        System.out.println("\nUpdating Product P101...");
        inventory.updateProduct("P101", "Gaming Laptop", 8, 85000.00);

        inventory.displayInventory();

        System.out.println("\nDeleting Product P102...");
        inventory.deleteProduct("P102");

        inventory.displayInventory();
    }
}
