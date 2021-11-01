package decorators;

import flowerstore.Item;
import lombok.ToString;

@ToString
public class ItemDecorator extends Item {
    protected Item item;

    public ItemDecorator(Item item){
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
