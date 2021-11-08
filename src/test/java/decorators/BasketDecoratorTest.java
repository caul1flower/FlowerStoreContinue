package decorators;

import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {
    private CactusFlower cactus;
    private Item decoratedBucket = new FlowerBucket();

    @BeforeEach
    void setUp() {
        Flower[] flowers = new Flower[3];
        int[] color = {127, 0, 0};
        for (int i = 0; i < flowers.length; i++){
            flowers[i] = new CactusFlower();
            flowers[i].setColor(color);
        }
        FlowerPack pack = new FlowerPack(flowers[0], flowers.length);
        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowerPack(pack);
        decoratedBucket = new BasketDecorator(bucket);
    }

    @Test
    void getPrice() {
        assertEquals(4, decoratedBucket.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("A bucket of flowers with basket.", decoratedBucket.getDescription());
    }
}