package flowerstore;
import lombok.Setter;

@Setter
public class CactusFlower extends Flower{
    private double price;
    private double sepalLength;
    private int[] color;
    private FlowerType flowertype;

    public CactusFlower(){
        setFlowertype(FlowerType.CACTUS);
    }
    public double price(){
        return this.price;
    }
}
