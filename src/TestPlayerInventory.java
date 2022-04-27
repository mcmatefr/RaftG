import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestPlayerInventory {

    private PlayerInventory playerInventory;


    @Test
    public void testGetters() {

        playerInventory=new PlayerInventory();
        assertNotNull(playerInventory.getLeafCount());
        assertEquals(0, playerInventory.getLeafCount());
        assertNotNull(playerInventory.getWoodCount());
        assertEquals(0, playerInventory.getWoodCount());
        assertNotNull(playerInventory.getWasteCount());
        assertEquals(0, playerInventory.getWasteCount());
        assertNotNull(playerInventory.getPotatoCount());
        assertEquals(0, playerInventory.getPotatoCount());
        assertNotNull(playerInventory.getFishCount());
        assertEquals(0, playerInventory.getFishCount());
        assertNotNull(playerInventory.getPikeCount());
        assertEquals(0, playerInventory.getPikeCount());

    }
    @Test
    public void testSetters() {
        playerInventory=new PlayerInventory();
        assertNotNull(playerInventory.getLeafCount());
        playerInventory.setLeafCount(playerInventory.getLeafCount()+1);
        assertEquals(1, playerInventory.getLeafCount());
        assertNotNull(playerInventory.getWoodCount());
        playerInventory.setWoodCount(playerInventory.getWoodCount()+1);
        assertEquals(1, playerInventory.getWoodCount());
        assertNotNull(playerInventory.getWasteCount());
        playerInventory.setWasteCount(playerInventory.getWasteCount()+1);
        assertEquals(1, playerInventory.getWasteCount());
        assertNotNull(playerInventory.getPotatoCount());
        playerInventory.setPotatoCount(playerInventory.getPotatoCount()+1);
        assertEquals(1, playerInventory.getPotatoCount());
        assertNotNull(playerInventory.getFishCount());
        playerInventory.setFishCount(playerInventory.getFishCount()+1);
        assertEquals(1, playerInventory.getFishCount());
        assertNotNull(playerInventory.getPikeCount());
        playerInventory.setPikeCount(playerInventory.getPikeCount()+1);
        assertEquals(1, playerInventory.getPikeCount());
    }
    @Test
    public void testIncreaseLeafCount() {
        playerInventory=new PlayerInventory();
        playerInventory.increaseLeafCount();
        assertEquals(1,playerInventory.getLeafCount());
    }
    @Test
    public void testIncreaseWoodCount() {
        playerInventory=new PlayerInventory();
        playerInventory.increaseWoodCount();
        assertEquals(1,playerInventory.getWoodCount());
    }
    @Test
    public void testIncreaseWasteCount() {
        playerInventory=new PlayerInventory();
        playerInventory.increaseWasteCount();
        assertEquals(1,playerInventory.getWasteCount());
    }
    @Test
    public void testIncreasePotatoCount() {
        playerInventory=new PlayerInventory();
        playerInventory.increasePotatoCount();
        assertEquals(1,playerInventory.getPotatoCount());
    }
    @Test
    public void testIncreaseFishCount() {
        playerInventory=new PlayerInventory();
        playerInventory.increaseFishCount();
        assertEquals(1,playerInventory.getFishCount());
    }
    @Test
    public void testIncreasePikeCount() {
        playerInventory=new PlayerInventory();
        playerInventory.increasePikeCount();
        assertEquals(50,playerInventory.getPikeCount());
    }
    @Test
    public void testDecreasePotatoCount() {
        playerInventory=new PlayerInventory();
        playerInventory.setPotatoCount(2);
        playerInventory.decreasePotatoCount();

        assertEquals(1,playerInventory.getPotatoCount());
    }
    @Test
    public void testDecreaseFishCount() {
        playerInventory=new PlayerInventory();
        playerInventory.setFishCount(2);
        playerInventory.decreaseFishCount();

        assertEquals(1,playerInventory.getFishCount());
    }
    @Test
    public void testDecreasePikeCount() {
        playerInventory=new PlayerInventory();
        playerInventory.setPikeCount(2);
        playerInventory.decreasePikeCount();

        assertEquals(1,playerInventory.getPikeCount());
    }
}
