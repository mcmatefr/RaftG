import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestShark {
    private Shark shark;
    private Handler handler;
    private PlayerInventory playerInventory;

    @Test
    public void testConstructorsAndGetters() {

        shark = new Shark(0, 0,ID.Shark, handler, playerInventory);
        assertNotNull(shark.getX());
        assertEquals(0, shark.getX());
        assertNotNull(shark.getY());
        assertEquals(0, shark.getY());
        assertEquals(ID.Shark, shark.getId());
        assertEquals(1, shark.getVelX());
        assertEquals(1, shark.getVelY());

    }
    @Test
    public void testSetters() {
        shark = new Shark(0, 0,ID.Shark, handler, playerInventory);
        assertEquals(0, shark.getX());
        shark.setX(1);
        assertEquals(1, shark.getX());

        assertEquals(0, shark.getY());
        shark.setY(1);
        assertEquals(1, shark.getY());

        assertEquals(ID.Shark, shark.getId());
        shark.setId(ID.Water);
        assertEquals(ID.Water, shark.getId());
        shark.setVelX(1);
        assertEquals(1, shark.getVelX());
        shark.setVelY(1);
        assertEquals(1, shark.getVelY());

    }
    @Test
    public void testGetBounds() {
        shark = new Shark(0, 0,ID.Shark, handler, playerInventory);
        assertNotNull(shark.getBounds());
    }
}
