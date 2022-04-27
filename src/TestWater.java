import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestWater {
    private Water water;
    private Handler handler;
    private PlayerInventory playerInventory;

    @Test
    public void testConstructorsAndGetters() {

        water = new Water(0, 0,ID.Water, handler, playerInventory);
        assertNotNull(water.getX());
        assertEquals(0, water.getX());
        assertNotNull(water.getY());
        assertEquals(0, water.getY());
        assertEquals(ID.Water, water.getId());
        assertEquals(0, water.getVelX());
        assertEquals(0, water.getVelY());

    }
    @Test
    public void testSetters() {
        water = new Water(0, 0,ID.Water, handler, playerInventory);
        assertEquals(0, water.getX());
        water.setX(1);
        assertEquals(1, water.getX());

        assertEquals(0, water.getY());
        water.setY(1);
        assertEquals(1, water.getY());

        assertEquals(ID.Water, water.getId());
        water.setId(ID.Leaf);
        assertEquals(ID.Leaf, water.getId());
        water.setVelX(1);
        assertEquals(1, water.getVelX());
        water.setVelY(1);
        assertEquals(1, water.getVelY());

    }
    @Test
    public void testGetBounds() {
        water = new Water(0, 0,ID.Water, handler, playerInventory);
        assertNotNull(water.getBounds());
    }
}
