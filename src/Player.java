import java.awt.*;

/**
 * Player osztaly
 */
public class Player extends GameObject {
   private Handler handler;
    private PlayerInventory playerInventory;
    private int timer =100;

    /**
     * Player constructor
     * @param x koordinata
     * @param y koordinata
     * @param id identitas
     * @param handler objektum karbantartasa
     * @param playerInventory valtozok kezelese
     */
    public Player(int x, int y, ID id, Handler handler, PlayerInventory playerInventory) {
        super(x, y, id);
        this.handler = handler;
        this.playerInventory=playerInventory;


    }

    /**
     * Object-ek hatarat adja meg
     * @return teglalap
     */
    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 20, 20);
    }
    /**
     * Frissites
     */
    @Override
    public void tick() {
        x += velX;
        y += velY;
        x = Game.clamp(x, 0, Game.WIDTH - 40);
        y = Game.clamp(y, 0, Game.HEIGHT - 60);
        collision();
    }

    /**
     * Utkozes vizsgalata
     */
    public void collision() {
        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);
            if (tempObject.getId() == ID.Shark ) {
                if (getBounds().intersects(tempObject.getBounds()) &&  this.playerInventory.getPikeCount()<1) {
                    HUD.HUNGRY = 0;
                    HUD.THIRSTY = 0;
                }

            }



        }
    }

    /**
     * Megjelenites
     * @param g grafikus parameter
     */
    @Override
    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.white);
        g.fillRect((int)x, (int)y, 20, 20);

    }

}
