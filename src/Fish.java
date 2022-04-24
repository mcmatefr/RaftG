import java.awt.*;

public class Fish extends GameObject{
    PlayerInventory playerInventory;
    Handler handler;
    public Fish(int x, int y, ID id, Handler handler, PlayerInventory playerInventory) {
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
        g.setColor(Color.black);
        g.drawString("Fish: "+this.playerInventory.getFishCount(),10,164);


    }

    @Override
    public Rectangle getBounds() {
        return null;
    }
}

