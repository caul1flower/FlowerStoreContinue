package users;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    Sender user1 = new Sender();
    Sender user2 = new Sender();

    @Test
    void update() {
        assertEquals(1, user2.getId() - user1.getId());
    }
}