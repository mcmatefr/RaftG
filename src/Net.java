import java.awt.*;

public class Net extends GameObject{
    private Handler handler;
    public Net(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler=handler;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.cyan);
        g.fillRect((int)x,(int)y,20,20);

    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle((int)x,(int)y,20,20);
    }
}
