package payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    private PayPalPaymentStrategy pay = new PayPalPaymentStrategy();

    @Test
    void pay() {
        assertEquals("You're going to pay 666.0 using PayPal.", pay.pay(666.0));
    }
}