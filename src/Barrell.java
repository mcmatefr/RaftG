import java.awt.*;
import java.util.Random;

public class Barrell extends GameObject{
    private Handler handler;
    private PlayerInventory playerInventory;
    private Random r;
    public Barrell(int x, int y, ID id, Handler handler, PlayerInventory playerInventory) {
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
        g.setColor(Color.darkGray);
        g.fillRect((int)x,(int)y,20,20);

    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle((int)x,(int)y,30,30);
    }

    public void collision() {
        r = new Random();

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.Player) {
                if (getBounds().intersects(tempObject.getBounds())) {
                    for (int count =0; count<5;) {
                        if (r.nextInt(100) < 25 && count <=5) {
                            this.playerInventory.increaseWasteCount();
                            System.out.println("Waste: " + this.playerInventory.getWasteCount());
                            count++;
                        }
                        if (r.nextInt(100) < 25 && count <=5) {
                            this.playerInventory.increasePotatoCount();
                            System.out.println("Potato: " + this.playerInventory.getPotatoCount());
                            count++;
                        }
                        if (r.nextInt(100) < 25 && count <=5) {
                            this.playerInventory.increaseLeafCount();
                            System.out.println("Leaf: " + this.playerInventory.getLeafCount());
                            count++;
                        }
                        if (r.nextInt(100) < 25 && count <=5) {
                            this.playerInventory.increaseWoodCount();
                            System.out.println("Wood: " + this.playerInventory.getWoodCount());
                            count++;
                        }
                    }
                    handler.removeObject(this);
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
