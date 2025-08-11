// Main.java
public class Main {
    public static void main(String[] args) {
        FinancialForecast forecast = new FinancialForecast();

        double currentValue = 1000; // initial investment
        double growthRate = 5; // 5% annual growth
        int years = 10;

        System.out.println("Recursive Forecast:");
        double futureValueRecursive = forecast.calculateFutureValue(currentValue, growthRate, years);
        System.out.printf("Future Value after %d years: %.2f\n", years, futureValueRecursive);

        System.out.println("\nIterative Forecast (Optimized):");
        double futureValueIterative = forecast.calculateFutureValueIterative(currentValue, growthRate, years);
        System.out.printf("Future Value after %d years: %.2f\n", years, futureValueIterative);
    }
}
