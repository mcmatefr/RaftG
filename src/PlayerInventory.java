public class PlayerInventory {
    private int leafCount = 0;
    private int woodCount =0;
    private int wasteCount=0;
    private int potatoCount=0;
    private int fishCount =0;
//    private boolean visited = false;
 //   private int stepsCount=0;

    public int getLeafCount() {
        return this.leafCount;
    }

    public void setLeafCount(int leafCount) {
        this.leafCount = leafCount;
    }

    public void increaseLeafCount() {
        this.leafCount++;
    }

    public int getWoodCount() {
        return woodCount;
    }

    public void setWoodCount(int woodCount) {
        this.woodCount = woodCount;
    }
    public void increaseWoodCount() {
        this.woodCount++;
    }

    public int getWasteCount() {
        return wasteCount;
    }

    public void setWasteCount(int wasteCount) {
        this.wasteCount = wasteCount;
    }
    public void increaseWasteCount() {
        this.wasteCount++;
    }

    public int getPotatoCount() {
        return potatoCount;
    }

    public void setPotatoCount(int potatoCount) {
        this.potatoCount = potatoCount;
    }
    public void increasePotatoCount() {
        this.potatoCount++;
    }
    public void decreasePotatoCount() {
        this.potatoCount--;
    }

    public int getFishCount() {
        return fishCount;
    }

    public void setFishCount(int fishCount) {
        this.fishCount = fishCount;
    }
    public void increaseFishCount() {
        this.fishCount++;
    }
    public void decreaseFishCount() {
        this.fishCount--;
    }


//    public boolean isVisited() {
//        return visited;
//    }
//
//    public void setVisited(boolean visited) {
//        this.visited = visited;
//    }

//    public int getStepsCount() {
//        return stepsCount;
//    }
//
//    public void setStepsCount(int stepsCount) {
//        this.stepsCount = stepsCount;
//    }
//    public void increaseStepsCount() {
//        this.stepsCount++;
//    }
}