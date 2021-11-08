package flowerstore;

public class FlowerPack extends Item{
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }
    public double getPrice(){
        return flower.getPrice() * amount;
    }

    @Override
    public String getDescription() {
        return "A bucket of flowers.";
    }

    public int getAmount() {
        return this.amount;
    }

    public Flower getFlower() {
        return this.flower;
    }
}
