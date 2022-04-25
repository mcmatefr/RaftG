import java.awt.*;

public class Wood extends GameObject{
private Handler handler;
private PlayerInventory playerInventory;
    public Wood(int x, int y, ID id, Handler handler,PlayerInventory playerInventory) {
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
        g.setColor(Color.PINK);
        g.fillRect((int)x,(int)y,20,20);

        g.drawString("Wood: "+this.playerInventory.getWoodCount(),10,144);

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
                    this.playerInventory.increaseWoodCount();
                    handler.removeObject(this);
                    System.out.println("Wood: " + this.playerInventory.getWoodCount());

                }
            }
            if (tempObject.getId() == ID.Bounds) {
                if (getBounds().intersects(tempObject.getBounds())) {

                    handler.removeObject(this);


                }
            }
            if (tempObject.getId() == ID.Net) {
                if (getBounds().intersects(tempObject.getBounds())) {

                    this.playerInventory.increaseWoodCount();
                    handler.removeObject(this);
                    System.out.println("Wood: " + this.playerInventory.getWoodCount());


                }
            }

        }
    }
}
