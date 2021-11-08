package users;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Receiver implements User{
    public int id;
    public Receiver() {
        this.id = IDCounter.id();
    }

    @Override
    public void update(String status){
        System.out.println("order.Order for " + id + " is " + status);
    }
}
