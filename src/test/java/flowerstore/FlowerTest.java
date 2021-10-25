package flowerstore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlowerTest {
    private Flower flower;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(15);
        flower.setColor(new int[]{128,0,0});
        flower.setSepalLength(2.5);
    }
    @Test
     void getPrice() {
        assertEquals(15, flower.getPrice());
    }
    @Test
    void getFlowerType() {
        assertEquals(FlowerType.CHAMOMILE, flower.getFlowerType());
    }
    @Test
    void getColor() {
        int[] flowerColor = flower.getColor();
        int[] currColor = new int[] {128, 0, 0};
        for (int i = 0; i < flowerColor.length; i++){
            assertEquals(currColor[i],flowerColor[i]);
        }
    }
    @Test
    void getSepalLength() {
        assertEquals(2.5, flower.getSepalLength());
    }
}