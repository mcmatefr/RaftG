import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class TestBarrell {
    private Barrell barrell;
    private Handler handler;
    private PlayerInventory playerInventory;

    @Test
    public void testConstructorsAndGetters() {

        barrell = new Barrell(0, 0,ID.Barrell, handler, playerInventory);
        assertNotNull(barrell.getX());
        assertEquals(0, barrell.getX());
        assertNotNull(barrell.getY());
        assertEquals(0, barrell.getY());
        assertEquals(ID.Barrell, barrell.getId());
        assertEquals(0, barrell.getVelX());
        assertEquals(0, barrell.getVelY());

    }
    @Test
    public void testSetters() {
        barrell = new Barrell(0, 0,ID.Barrell, handler, playerInventory);
        assertEquals(0, barrell.getX());
        barrell.setX(1);
        assertEquals(1, barrell.getX());

        assertEquals(0, barrell.getY());
        barrell.setY(1);
        assertEquals(1, barrell.getY());

        assertEquals(ID.Barrell, barrell.getId());
        barrell.setId(ID.Water);
        assertEquals(ID.Water, barrell.getId());
        barrell.setVelX(1);
        assertEquals(1, barrell.getVelX());
        barrell.setVelY(1);
        assertEquals(1, barrell.getVelY());

    }
    @Test
    public void testGetBounds() {
        barrell = new Barrell(0, 0,ID.Barrell, handler, playerInventory);
        assertNotNull(barrell.getBounds());
    }
//    @Test
//    public void testRender() {
//        barrell = new Barrell(0, 0,ID.Barrell, handler, playerInventory);
//        Object g;
//        Graphics2D g2d = (Graphics2D) g;
//        barrell.render(Graphics g);
//
//    }
}
