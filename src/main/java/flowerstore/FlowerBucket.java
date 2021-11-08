package flowerstore;

import lombok.ToString;
import java.util.ArrayList;
import java.util.List;

@ToString
public class FlowerBucket extends Item{
    List<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }
    public double getPrice(){
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    @Override
    public String getDescription() {
        return "A bucket of flowers.";
    }
}
