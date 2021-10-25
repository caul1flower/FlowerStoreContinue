package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class StoreTest {
    private Store store;

    @BeforeEach
    void setUp() {
        Flower chamomile = new Flower(FlowerType.TULIP);
        chamomile.setPrice(10);
        chamomile.setColor(new int[]{127, 20, 30});
        chamomile.setSepalLength(10);
        FlowerPack packChamomile = new FlowerPack(chamomile, 10);

        Flower rose = new Flower(FlowerType.ROSE);
        rose.setPrice(50);
        rose.setColor(new int[]{127, 10, 20});
        rose.setSepalLength(50);
        FlowerPack packRose = new FlowerPack(rose, 10);

        Flower tulip = new Flower(FlowerType.TULIP);
        tulip.setPrice(50);
        tulip.setColor(new int[]{127, 10, 20});
        tulip.setSepalLength(50);
        FlowerPack packTulip = new FlowerPack(tulip, 10);

        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(packChamomile);
        flowerBucket.addFlowerPack(packRose);
        flowerBucket.addFlowerPack(packTulip);
        store = new Store();

        List<FlowerBucket> buckets = new ArrayList<>();
        buckets.add(flowerBucket);
        store.setFlowerBuckets(buckets);
    }


    @Test
    void search() {
        assertFalse(store.search(1000));
        assertTrue(store.search(5001));
    }
}