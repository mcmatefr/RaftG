import java.awt.*;

public class Player extends GameObject {
   private Handler handler;
    private PlayerInventory playerInventory;
    private int timer =100;
//    protected int leaf = 0;
//    protected int wood = 0;
//    protected int waste = 0;
//    protected int potato = 0;
//    protected int water = 0;

    public Player(int x, int y, ID id, Handler handler, PlayerInventory playerInventory) {
        super(x, y, id);
        this.handler = handler;
        this.playerInventory=playerInventory;

        //velX=1;
    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 20, 20);
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;
        x = Game.clamp(x, 0, Game.WIDTH - 40);
        y = Game.clamp(y, 0, Game.HEIGHT - 60);
        collision();
    }

    public void collision() {
        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);
            if (tempObject.getId() == ID.Shark ) {
                if (getBounds().intersects(tempObject.getBounds()) &&  this.playerInventory.getPikeCount()<1) {
                    HUD.HUNGRY = 0;
                    HUD.THIRSTY = 0;
                }

            }
//           if (tempObject.getId() == ID.Leaf) {
//               if (getBounds().intersects(tempObject.getBounds())) {
//                    leaf++;
//                    handler.removeObject(this);
//                    System.out.println(leaf);
//
//               }
//            }


        }
    }

    @Override
    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.white);
        g.fillRect((int)x, (int)y, 20, 20);

    }

//    public int getLeaf() {
//        return leaf;
//    }
//
//    public void setLeaf(int leaf) {
//        this.leaf = leaf;
//    }

//    public int getWood() {
//        return wood;
//    }
//
//    public void setWood(int wood) {
//        this.wood = wood;
//    }
//
//    public int getWaste() {
//        return waste;
//    }
//
//    public void setWaste(int waste) {
//        this.waste = waste;
//    }
//
//    public int getPotato() {
//        return potato;
//    }

//    public void setPotato(int potato) {
//        this.potato = potato;
//    }
//
//    public int getWater() {
//        return water;
//    }
//
//    public void setWater(int water) {
//        this.water = water;
//    }
}
