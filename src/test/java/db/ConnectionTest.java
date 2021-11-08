package db;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {

    @Test
    void getConnection() {
        Connection con1 = Connection.getConnection();
        Connection con2 = Connection.getConnection();
        Connection con3 = Connection.getConnection();
        Connection con4 = Connection.getConnection();
        assertEquals(con1, con2);
        assertEquals(con2, con3);
        assertEquals(con3, con4);
    }
}