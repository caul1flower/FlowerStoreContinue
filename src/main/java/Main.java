import decorators.PaperDecorator;
import flowerstore.*;

public class Main {
    public static void main(String[] args){
        Flower[] flowers = new Flower[3];
        int[] color = {127, 0, 0};
        for (int i = 0; i < flowers.length; i++){
            flowers[i] = new Flower(FlowerType.ROSE);
            flowers[i].setColor(color);
        }
        FlowerPack pack = new FlowerPack(flowers[0], flowers.length);
        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowerPack(pack);
        FlowerBucket bucket2 = new FlowerBucket();
    }
}
