import java.awt.*;

public class Leaf extends GameObject{

    private Handler handler;
    private PlayerInventory playerInventory;

    public Leaf(int x, int y, ID id, Handler handler, PlayerInventory playerInventory) {
        super(x, y, id);

        this.handler=handler;
        this.playerInventory=playerInventory;

    }

    @Override
    public void tick() {
        collision();
    }

    @Override
    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.green);
        g.fillRect((int)x,(int)y,20,20);
        g.drawString("Leaf: "+this.playerInventory.getLeafCount(),10,84);
        g.drawString("Fish: "+this.playerInventory.getFishCount(),10,164);
        g.drawString("Potato: "+this.playerInventory.getPotatoCount(),10,104);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle((int)x,(int)y,30,30);
    }

    public void collision() {
        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.Player) {
                if (getBounds().intersects(tempObject.getBounds())) {
                    this.playerInventory.increaseLeafCount();
                    handler.removeObject(this);
                    System.out.println("Leaf: "+this.playerInventory.getLeafCount());


                }
            }

            if (tempObject.getId() == ID.Bounds) {
                if (getBounds().intersects(tempObject.getBounds())) {

                    handler.removeObject(this);


                }
            }


        }
    }
}
