import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestPotato {
    private Potato potato;
    private Handler handler;
    private PlayerInventory playerInventory;

    @Test
    public void testConstructorsAndGetters() {

        potato = new Potato(0, 0,ID.Potato, handler, playerInventory);
        assertNotNull(potato.getX());
        assertEquals(0, potato.getX());
        assertNotNull(potato.getY());
        assertEquals(0, potato.getY());
        assertEquals(ID.Potato, potato.getId());
        assertEquals(0, potato.getVelX());
        assertEquals(0, potato.getVelY());

    }
    @Test
    public void testSetters() {
        potato = new Potato(0, 0,ID.Potato, handler, playerInventory);
        assertEquals(0, potato.getX());
        potato.setX(1);
        assertEquals(1, potato.getX());

        assertEquals(0, potato.getY());
        potato.setY(1);
        assertEquals(1, potato.getY());

        assertEquals(ID.Potato, potato.getId());
        potato.setId(ID.Water);
        assertEquals(ID.Water, potato.getId());
        potato.setVelX(1);
        assertEquals(1, potato.getVelX());
        potato.setVelY(1);
        assertEquals(1, potato.getVelY());

    }
    @Test
    public void testGetBounds() {
        potato = new Potato(0, 0,ID.Potato, handler, playerInventory);
        assertNotNull(potato.getBounds());
    }
}
