package users;

public class IDCounter {
    private static int id;
    public static int id(){
        id += 1;
        return id;
    }
}
