import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestLeaf {
    private Leaf leaf;
    private Handler handler;
    private PlayerInventory playerInventory;

    @Test
    public void testConstructorsAndGetters() {

        leaf = new Leaf(0, 0,ID.Leaf, handler, playerInventory);
        assertNotNull(leaf.getX());
        assertEquals(0, leaf.getX());
        assertNotNull(leaf.getY());
        assertEquals(0, leaf.getY());
        assertEquals(ID.Leaf, leaf.getId());
        assertEquals(0, leaf.getVelX());
        assertEquals(0, leaf.getVelY());

    }
    @Test
    public void testSetters() {
        leaf = new Leaf(0, 0,ID.Leaf, handler, playerInventory);
        assertEquals(0, leaf.getX());
        leaf.setX(1);
        assertEquals(1, leaf.getX());

        assertEquals(0, leaf.getY());
        leaf.setY(1);
        assertEquals(1, leaf.getY());

        assertEquals(ID.Leaf, leaf.getId());
        leaf.setId(ID.Water);
        assertEquals(ID.Water, leaf.getId());
        leaf.setVelX(1);
        assertEquals(1, leaf.getVelX());
        leaf.setVelY(1);
        assertEquals(1, leaf.getVelY());

    }
    @Test
    public void testGetBounds() {
        leaf = new Leaf(0, 0,ID.Leaf, handler, playerInventory);
        assertNotNull(leaf.getBounds());
    }
}
