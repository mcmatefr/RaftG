import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class TestBounds {

    private Bounds bounds;
    private Handler handler;


    @Test
    public void testConstructorsAndGetters() {

        bounds = new Bounds(0, 0,ID.Barrell, handler);
        assertNotNull(bounds.getX());
        assertEquals(0, bounds.getX());
        assertNotNull(bounds.getY());
        assertEquals(0, bounds.getY());
        assertEquals(ID.Bounds, bounds.getId());
        assertEquals(0, bounds.getVelX());
        assertEquals(0, bounds.getVelY());

    }
    @Test
    public void testSetters() {
        bounds = new Bounds(0, 0, ID.Bounds, handler);
        assertEquals(0, bounds.getX());
        bounds.setX(1);
        assertEquals(1, bounds.getX());

        assertEquals(0, bounds.getY());
        bounds.setY(1);
        assertEquals(1, bounds.getY());

        assertEquals(ID.Barrell, bounds.getId());
        bounds.setId(ID.Water);
        assertEquals(ID.Water, bounds.getId());
        bounds.setVelX(1);
        assertEquals(1, bounds.getVelX());
        bounds.setVelY(1);
        assertEquals(1, bounds.getVelY());

    }
    @Test
    public void testGetBounds() {
        bounds = new Bounds(0, 0, ID.Bounds, handler);
        assertNotNull(bounds.getBounds());
    }

}
