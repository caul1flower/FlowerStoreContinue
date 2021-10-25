package flowerstore;

public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }
    public double getPrice(){
        return flower.getPrice() * amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public Flower getFlower() {
        return this.flower;
    }
}
