import java.awt.*;
import java.util.Random;

public class Raft extends GameObject{
    private Handler handler;
    private PlayerInventory playerInventory;
    private Random r;

    public Raft(int x, int y, ID id, Handler handler,PlayerInventory playerInventory) {
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
        g.setColor(Color.orange);
        g.fillRect(x,y,20,20);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, 20, 20);
    }
    public void collision() {

        r = new Random();
        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.Player) {

                if (!(getBounds().intersects(tempObject.getBounds()))) {

                    if (r.nextInt(100) < 25 ) {
                        this.playerInventory.increaseFishCount();
                        System.out.println("Fish: " + this.playerInventory.getFishCount());
                    }
                }
            }
        }
   }
}
