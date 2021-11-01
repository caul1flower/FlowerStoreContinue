package flowerstore;
import lombok.Setter;

@Setter
public class RomashkaFlower extends Flower{
    private double price;
    private double sepalLength;
    private int[] color;
    private FlowerType flowertype;

    public RomashkaFlower(){
        setFlowertype(FlowerType.ROMASHKA);
    }
    public double price(){
        return this.price;
    }
}
