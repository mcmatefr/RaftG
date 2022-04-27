import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class TestNet {
    private Net net;
    private Handler handler;
    private PlayerInventory playerInventory;

    @Test
    public void testConstructorsAndGetters() {

        net = new Net(0, 0,ID.Net, handler);
        assertNotNull(net.getX());
        assertEquals(0, net.getX());
        assertNotNull(net.getY());
        assertEquals(0, net.getY());
        assertEquals(ID.Net, net.getId());
        assertEquals(0, net.getVelX());
        assertEquals(0, net.getVelY());

    }
    @Test
    public void testSetters() {
        net = new Net(0, 0,ID.Net, handler);
        assertEquals(0, net.getX());
        net.setX(1);
        assertEquals(1, net.getX());

        assertEquals(0, net.getY());
        net.setY(1);
        assertEquals(1, net.getY());

        assertEquals(ID.Net, net.getId());
        net.setId(ID.Water);
        assertEquals(ID.Water, net.getId());
        net.setVelX(1);
        assertEquals(1, net.getVelX());
        net.setVelY(1);
        assertEquals(1, net.getVelY());

    }
    @Test
    public void testGetBounds() {
        net = new Net(0, 0,ID.Leaf, handler);
        assertNotNull(net.getBounds());
    }
}
