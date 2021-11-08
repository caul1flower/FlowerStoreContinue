package users;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Sender implements User{
    private int id;

    public Sender(){
        this.id =  IDCounter.id();
    }
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void update(String status) {
        System.out.println("order.Order for " + id + " is " + status);
    }
}