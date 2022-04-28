import java.awt.*;

/**
 * Tuzhely osztaly
 */
public class Cooker extends GameObject {
    private Handler handler;
    PlayerInventory playerInventory;
    /**
     * Tuzhely constructor
     * @param x koordinata
     * @param y koordinata
     * @param id identitas
     * @param handler objektum karbantartasa
     * @param playerInventory valtozok kezelese
     */
    public Cooker(int x, int y, ID id, Handler handler, PlayerInventory playerInventory) {
        super(x, y, id);
        this.handler = handler;
        this.playerInventory=playerInventory;

    }

    /**
     * Frissites
     */
    @Override
    public void tick() {
        collision();
    }
    /**
     * Megjelenites
     */
    @Override
    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.yellow);
        g.fillRect((int)x, (int)y, 20, 20);

    }
    /**
     * Object-ek hatarat adja meg
     * @return teglalap
     */
    @Override
    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 20, 20);
    }

    /**
     * Utkozesvizsgalat
     */
    public void collision() {


        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);
            if (tempObject.getId() == ID.Player) {
                if (getBounds().intersects(tempObject.getBounds())) {

                        if(playerInventory.getFishCount()>0 && (HUD.STEPS - KeyInput.STEPSCOUNT2) / 25 >= 0){

                                HUD.HUNGRY = HUD.HUNGRY + 60;

                            }




                }
            }
        }
    }
}
