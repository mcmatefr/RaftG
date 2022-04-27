import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestPurifier {
    private Purifier purifier;
    private Handler handler;
    private PlayerInventory playerInventory;

    @Test
    public void testConstructorsAndGetters() {

        purifier = new Purifier(0, 0,ID.Purifier, handler);
        assertNotNull(purifier.getX());
        assertEquals(0, purifier.getX());
        assertNotNull(purifier.getY());
        assertEquals(0, purifier.getY());
        assertEquals(ID.Purifier, purifier.getId());
        assertEquals(0, purifier.getVelX());
        assertEquals(0, purifier.getVelY());

    }
    @Test
    public void testSetters() {
        purifier = new Purifier(0, 0,ID.Purifier, handler);
        assertEquals(0, purifier.getX());
        purifier.setX(1);
        assertEquals(1, purifier.getX());

        assertEquals(0, purifier.getY());
        purifier.setY(1);
        assertEquals(1, purifier.getY());

        assertEquals(ID.Purifier, purifier.getId());
        purifier.setId(ID.Water);
        assertEquals(ID.Water, purifier.getId());
        purifier.setVelX(1);
        assertEquals(1, purifier.getVelX());
        purifier.setVelY(1);
        assertEquals(1, purifier.getVelY());

    }
    @Test
    public void testGetBounds() {
        purifier = new Purifier(0, 0,ID.Purifier, handler);
        assertNotNull(purifier.getBounds());
    }
}
