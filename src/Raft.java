import java.awt.*;

public class Raft extends GameObject{
    Handler handler;

    public Raft(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler=handler;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.orange);
        g.fillRect(x,y,20,20);
    }

    @Override
    public Rectangle getBounds() {
        return null;
    }

}
