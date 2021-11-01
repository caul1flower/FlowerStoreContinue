package payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
        return "You're going to pay " + price + " using PayPal.";
    }
}