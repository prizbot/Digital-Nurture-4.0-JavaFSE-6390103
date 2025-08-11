import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    // Linear Search: O(n)
    public static int linearSearch(Product[] products, String targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId().equals(targetId)) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search: O(log n)
    public static int binarySearch(Product[] products, String targetId) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].getProductId().compareTo(targetId);
            if (cmp == 0) return mid;
            if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product("P101", "Laptop", "Electronics"),
            new Product("P102", "Smartphone", "Electronics"),
            new Product("P103", "Shirt", "Fashion"),
            new Product("P104", "Shoes", "Fashion")
        };

        System.out.println("Linear Search for P103:");
        int index = linearSearch(products, "P103");
        System.out.println(index >= 0 ? products[index] : "Not Found");

        Arrays.sort(products, Comparator.comparing(Product::getProductId));

        System.out.println("\nBinary Search for P103:");
        index = binarySearch(products, "P103");
        System.out.println(index >= 0 ? products[index] : "Not Found");
    }
}