public class ObserverPatternDemo {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("Mobile App 1");
        Observer webApp = new WebApp("Web App 1");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        System.out.println("Updating stock price to $100.50");
        stockMarket.setStockPrice(100.50);

        System.out.println("\nUpdating stock price to $105.75");
        stockMarket.setStockPrice(105.75);

        System.out.println("\nRemoving Mobile App 1 from notifications...");
        stockMarket.removeObserver(mobileApp);

        System.out.println("\nUpdating stock price to $110.00");
        stockMarket.setStockPrice(110.00);
    }
}
