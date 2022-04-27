import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestWaste {
    private Waste waste;
    private Handler handler;
    private PlayerInventory playerInventory;

    @Test
    public void testConstructorsAndGetters() {

        waste = new Waste(0, 0,ID.Waste, handler, playerInventory);
        assertNotNull(waste.getX());
        assertEquals(0, waste.getX());
        assertNotNull(waste.getY());
        assertEquals(0, waste.getY());
        assertEquals(ID.Waste, waste.getId());
        assertEquals(0, waste.getVelX());
        assertEquals(0, waste.getVelY());

    }
    @Test
    public void testSetters() {
        waste = new Waste(0, 0,ID.Waste, handler, playerInventory);
        assertEquals(0, waste.getX());
        waste.setX(1);
        assertEquals(1, waste.getX());

        assertEquals(0, waste.getY());
        waste.setY(1);
        assertEquals(1, waste.getY());

        assertEquals(ID.Waste, waste.getId());
        waste.setId(ID.Water);
        assertEquals(ID.Water, waste.getId());
        waste.setVelX(1);
        assertEquals(1, waste.getVelX());
        waste.setVelY(1);
        assertEquals(1, waste.getVelY());

    }
    @Test
    public void testGetBounds() {
        waste = new Waste(0, 0,ID.Waste, handler, playerInventory);
        assertNotNull(waste.getBounds());
    }
}
