// FinancialForecast.java
public class FinancialForecast {

    /**
     * Recursively calculates the future value given:
     * @param currentValue - Present value
     * @param growthRate - Growth rate in percentage (e.g., 5 for 5%)
     * @param years - Number of years into the future
     * @return - Predicted value after given years
     */
    public double calculateFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return calculateFutureValue(currentValue * (1 + growthRate / 100), growthRate, years - 1);
    }

    /**
     * Optimized iterative approach to avoid deep recursion
     */
    public double calculateFutureValueIterative(double currentValue, double growthRate, int years) {
        for (int i = 0; i < years; i++) {
            currentValue *= (1 + growthRate / 100);
        }
        return currentValue;
    }
}
