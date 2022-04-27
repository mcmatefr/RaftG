import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestWood {
    private Wood wood;
    private Handler handler;
    private PlayerInventory playerInventory;

    @Test
    public void testConstructorsAndGetters() {

        wood = new Wood(0, 0,ID.Wood, handler, playerInventory);
        assertNotNull(wood.getX());
        assertEquals(0, wood.getX());
        assertNotNull(wood.getY());
        assertEquals(0, wood.getY());
        assertEquals(ID.Wood, wood.getId());
        assertEquals(0, wood.getVelX());
        assertEquals(0, wood.getVelY());

    }
    @Test
    public void testSetters() {
        wood = new Wood(0, 0,ID.Wood, handler, playerInventory);
        assertEquals(0, wood.getX());
        wood.setX(1);
        assertEquals(1, wood.getX());

        assertEquals(0, wood.getY());
        wood.setY(1);
        assertEquals(1, wood.getY());

        assertEquals(ID.Wood, wood.getId());
        wood.setId(ID.Water);
        assertEquals(ID.Water, wood.getId());
        wood.setVelX(1);
        assertEquals(1, wood.getVelX());
        wood.setVelY(1);
        assertEquals(1, wood.getVelY());

    }
    @Test
    public void testGetBounds() {
        wood = new Wood(0, 0,ID.Wood, handler, playerInventory);
        assertNotNull(wood.getBounds());
    }
}
