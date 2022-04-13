public class PlayerInventory {
    private int leafCount = 0;

    public int getLeafCount() {
        return this.leafCount;
    }

    public void setLeafCount(int leafCount) {
        this.leafCount = leafCount;
    }

    public void increaseLeafCount() {
        this.leafCount++;
    }
}
