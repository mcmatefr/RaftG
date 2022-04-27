import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestFish {
    private Fish fish;
    private Handler handler;
    private PlayerInventory playerInventory;

    @Test
    public void testConstructorsAndGetters() {

        fish = new Fish(0, 0,ID.Fish, handler, playerInventory);
        assertNotNull(fish.getX());
        assertEquals(0, fish.getX());
        assertNotNull(fish.getY());
        assertEquals(0, fish.getY());
        assertEquals(ID.Fish, fish.getId());
        assertEquals(0, fish.getVelX());
        assertEquals(0, fish.getVelY());

    }
    @Test
    public void testSetters() {
        fish = new Fish(0, 0,ID.Fish, handler, playerInventory);
        assertEquals(0, fish.getX());
        fish.setX(1);
        assertEquals(1, fish.getX());

        assertEquals(0, fish.getY());
        fish.setY(1);
        assertEquals(1, fish.getY());

        assertEquals(ID.Fish, fish.getId());
        fish.setId(ID.Water);
        assertEquals(ID.Water, fish.getId());
        fish.setVelX(1);
        assertEquals(1, fish.getVelX());
        fish.setVelY(1);
        assertEquals(1, fish.getVelY());

    }
    @Test
    public void testGetBounds() {
        fish = new Fish(0, 0,ID.Fish, handler, playerInventory);
        assertNotNull(fish.getBounds());
    }
}
