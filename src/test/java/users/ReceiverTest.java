package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {
    Receiver rec1 = new Receiver();
    Receiver rec2 = new Receiver();
    Receiver rec3 = new Receiver();
    Receiver rec4 = new Receiver();

    @Test
    void update() {
        assertEquals(1, rec2.id - rec1.id);
        assertEquals(2, rec3.id - rec1.id);
        assertEquals(3, rec4.id - rec1.id);
    }
}