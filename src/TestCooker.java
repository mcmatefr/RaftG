import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestCooker {
    private Cooker cooker;
    private Player player;
    private Handler handler;
    private PlayerInventory playerInventory;

    @Test
    public void testConstructorsAndGetters() {

        cooker = new Cooker(0, 0,ID.Cooker, handler, playerInventory);
        assertNotNull(cooker.getX());
        assertEquals(0, cooker.getX());
        assertNotNull(cooker.getY());
        assertEquals(0, cooker.getY());
        assertEquals(ID.Cooker, cooker.getId());
        assertEquals(0, cooker.getVelX());
        assertEquals(0, cooker.getVelY());

    }
    @Test
    public void testSetters() {
        cooker = new Cooker(0, 0,ID.Cooker, handler, playerInventory);
        assertEquals(0, cooker.getX());
        cooker.setX(1);
        assertEquals(1, cooker.getX());

        assertEquals(0, cooker.getY());
        cooker.setY(1);
        assertEquals(1, cooker.getY());

        assertEquals(ID.Cooker, cooker.getId());
        cooker.setId(ID.Water);
        assertEquals(ID.Water, cooker.getId());
        cooker.setVelX(1);
        assertEquals(1, cooker.getVelX());
        cooker.setVelY(1);
        assertEquals(1, cooker.getVelY());

    }
    @Test
    public void testGetBounds() {
        cooker = new Cooker(0, 0,ID.Cooker, handler, playerInventory);
        assertNotNull(cooker.getBounds());
    }

    @Test
    public void testCollision (){
        playerInventory=new PlayerInventory();
        handler=new Handler();
        cooker = new Cooker(0, 0,ID.Cooker, handler, playerInventory);
        player = new Player(0, 0,ID.Player, handler, playerInventory);
        this.playerInventory.setFishCount(5);
        HUD.STEPS =50;
        KeyInput.STEPSCOUNT2=0;
        HUD.HUNGRY=0;
        cooker.collision();
        assertEquals(60, HUD.HUNGRY);
    }
}
