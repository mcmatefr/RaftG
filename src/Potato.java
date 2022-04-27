import java.awt.*;

public class Potato extends GameObject{
    PlayerInventory playerInventory;
    Handler handler;
    public Potato(int x, int y, ID id, Handler handler, PlayerInventory playerInventory) {
        super(x, y, id);
        this.handler=handler;
        this.playerInventory=playerInventory;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.GRAY);
        g.drawString("Potato: "+this.playerInventory.getPotatoCount(),10,104);


    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle((int)x,(int)y,20,20);
    }
}
