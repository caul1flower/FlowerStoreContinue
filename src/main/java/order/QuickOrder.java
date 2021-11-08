package order;

import delivery.Delivery;
import flowerstore.Item;
import payment.Payment;
import java.util.List;

public class QuickOrder{
    public Order create(List<Item> items, Payment payment, Delivery delivery){
        return new Order(items, payment, delivery);
    }
}
