public class SortDemo {

    // Bubble Sort: O(n^2)
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].getTotalPrice() < orders[j + 1].getTotalPrice()) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort: O(n log n) average
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].getTotalPrice();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() >= pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Order[] orders = {
            new Order("O101", "Alice", 1200.50),
            new Order("O102", "Bob", 2500.00),
            new Order("O103", "Charlie", 800.75)
        };

        System.out.println("Before Sorting:");
        for (Order order : orders) System.out.println(order);

        System.out.println("\nBubble Sort (Descending by Total Price):");
        bubbleSort(orders);
        for (Order order : orders) System.out.println(order);

        Order[] orders2 = {
            new Order("O101", "Alice", 1200.50),
            new Order("O102", "Bob", 2500.00),
            new Order("O103", "Charlie", 800.75)
        };

        System.out.println("\nQuick Sort (Descending by Total Price):");
        quickSort(orders2, 0, orders2.length - 1);
        for (Order order : orders2) System.out.println(order);
    }
}