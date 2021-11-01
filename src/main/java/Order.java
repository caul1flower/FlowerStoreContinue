import delivery.Delivery;
import flowerstore.Item;
import lombok.Getter;
import lombok.Setter;
import payment.Payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter @Setter
public class Order {
    private List<Item> items = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment paymentStrategy){
        this.payment = paymentStrategy;
    }
    public void setDeliveryStrategy(Delivery deliveryStrategy){
        this.delivery = deliveryStrategy;
    }
    public double calculateTotalPrice() {
        double price = 0;
        for (Item item : items) {
            price += item.getPrice();
        }
        return price;
    }
    public void processOrder(){
        double price = calculateTotalPrice();
        System.out.println("Total price of your order: " + price);
        System.out.println(payment.pay(price));
        System.out.println(delivery.deliver(items));
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        for (int i = 0; i < items.size(); i++){
            if (Objects.equals(items.get(i), item)) {
                items.remove(i);
                break;
            }
        }
    }
}
