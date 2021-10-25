package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerPack pack1, pack2, pack3;
    private FlowerBucket bucket;

    @BeforeEach
    void setUp() {
        Flower flower1, flower2, flower3;

        flower1 = new Flower(FlowerType.CHAMOMILE);
        flower1.setPrice(10);
        flower2 = new Flower(FlowerType.TULIP);
        flower2.setPrice(20);
        flower3 = new Flower(FlowerType.ROSE);
        flower3.setPrice(30);

        pack1 = new FlowerPack(flower1, 50);
        pack2 = new FlowerPack(flower2, 100);
        pack3 = new FlowerPack(flower3, 150);

        bucket = new FlowerBucket();
    }

    @Test
    void getPrice() {
        assertEquals(0.0, bucket.getPrice());
        bucket.addFlowerPack(pack1);
        assertEquals(500.0, bucket.getPrice());
        bucket.addFlowerPack(pack2);
        assertEquals(2500.0, bucket.getPrice());
        bucket.addFlowerPack(pack3);
        assertEquals(7000.0, bucket.getPrice());
    }
}