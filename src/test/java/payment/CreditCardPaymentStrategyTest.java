package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {
    private CreditCardPaymentStrategy pay = new CreditCardPaymentStrategy();

    @Test
    void pay() {
        assertEquals("You're going to pay 666.0 using credit card.", pay.pay(666.0));
    }
}