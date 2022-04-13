import java.awt.*;

public class Leaf extends GameObject{
    public static int leaf = 0;
    Handler handler;
    public Leaf(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler=handler;
    }

    @Override
    public void tick() {
        collision();
    }

    @Override
    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.green);
        g.fillRect(x,y,20,20);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x,y,30,30);
    }

    public void collision() {
        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.Player) {
                if (getBounds().intersects(tempObject.getBounds())) {
                    leaf++;
                    handler.removeObject(this);
                    System.out.println(leaf);

                }
            }


        }
    }
}
