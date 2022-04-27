import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestPlayer {
    private Player player;
    private Handler handler;
    private PlayerInventory playerInventory;

    @Test
    public void testConstructorsAndGetters() {

        player = new Player(0, 0,ID.Player, handler,playerInventory);
        assertNotNull(player.getX());
        assertEquals(0, player.getX());
        assertNotNull(player.getY());
        assertEquals(0, player.getY());
        assertEquals(ID.Player, player.getId());
        assertEquals(0, player.getVelX());
        assertEquals(0, player.getVelY());

    }
    @Test
    public void testSetters() {
        player = new Player(0, 0,ID.Player, handler,playerInventory);
        assertEquals(0, player.getX());
        player.setX(1);
        assertEquals(1, player.getX());

        assertEquals(0, player.getY());
        player.setY(1);
        assertEquals(1, player.getY());

        assertEquals(ID.Player, player.getId());
        player.setId(ID.Water);
        assertEquals(ID.Water, player.getId());
        player.setVelX(1);
        assertEquals(1, player.getVelX());
        player.setVelY(1);
        assertEquals(1, player.getVelY());

    }
    @Test
    public void testGetBounds() {
        player = new Player(0, 0,ID.Player, handler,playerInventory);
        assertNotNull(player.getBounds());

    }
}
