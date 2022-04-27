import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestRaft {
    private Raft raft;
    private Handler handler;
    private PlayerInventory playerInventory;

    @Test
    public void testConstructorsAndGetters() {

        raft = new Raft(0, 0,ID.Raft, handler, playerInventory);
        assertNotNull(raft.getX());
        assertEquals(0, raft.getX());
        assertNotNull(raft.getY());
        assertEquals(0, raft.getY());
        assertEquals(ID.Raft, raft.getId());
        assertEquals(0, raft.getVelX());
        assertEquals(0, raft.getVelY());

    }
    @Test
    public void testSetters() {
        raft = new Raft(0, 0,ID.Raft, handler, playerInventory);
        assertEquals(0, raft.getX());
        raft.setX(1);
        assertEquals(1, raft.getX());

        assertEquals(0, raft.getY());
        raft.setY(1);
        assertEquals(1, raft.getY());

        assertEquals(ID.Raft, raft.getId());
        raft.setId(ID.Water);
        assertEquals(ID.Water, raft.getId());
        raft.setVelX(1);
        assertEquals(1, raft.getVelX());
        raft.setVelY(1);
        assertEquals(1, raft.getVelY());

    }
    @Test
    public void testGetBounds() {
        raft = new Raft(0, 0,ID.Raft, handler, playerInventory);
        assertNotNull(raft.getBounds());
    }
}
