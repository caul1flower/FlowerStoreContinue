package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack flowerPack;
    private Flower flower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(10);
        flower.setColor(new int[]{127,0,0});
        flower.setSepalLength(5);
        flowerPack = new FlowerPack(flower, 5);
    }

    @Test
    void getPrice() {
        assertEquals(50, flowerPack.getPrice());
    }

    @Test
    void getFlower() {
        assertEquals(flower, flowerPack.getFlower());
    }

    @Test
    void getAmount() {
        assertEquals(5, flowerPack.getAmount());
    }
}