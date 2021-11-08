package decorators;

import flowerstore.Item;
import lombok.ToString;

@ToString
public class PaperDecorator extends ItemDecorator{
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice(){
        return 13+super.getPrice();
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " with paper.";
    }
}
