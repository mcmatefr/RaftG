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

    }

    @Override
    public Rectangle getBounds() {
        return null;
    }
}
