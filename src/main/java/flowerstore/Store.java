package flowerstore;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public boolean search(double price){
        for (FlowerBucket bucket: flowerBuckets){
            if (bucket.getPrice() <= price ) return true;
        }
        return false;
    }
    public void setFlowerBuckets(List<FlowerBucket> flowerBuckets) {
        this.flowerBuckets = new ArrayList<>(flowerBuckets);
    }
}