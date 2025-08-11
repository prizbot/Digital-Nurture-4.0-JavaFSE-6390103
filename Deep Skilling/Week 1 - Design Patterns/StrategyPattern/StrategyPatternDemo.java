public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "Alice Smith"));
        context.executePayment(250.00);

        // Pay using PayPal
        context.setPaymentStrategy(new PayPalPayment("alice@example.com"));
        context.executePayment(99.99);
    }
}
