import java.awt.*;

public class Cooker extends GameObject {
    private Handler handler;
    PlayerInventory playerInventory;

    public Cooker(int x, int y, ID id, Handler handler, PlayerInventory playerInventory) {
        super(x, y, id);
        this.handler = handler;
        this.playerInventory=playerInventory;

    }

    @Override
    public void tick() {
        collision();
    }

    @Override
    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.yellow);
        g.fillRect(x, y, 20, 20);

    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, 20, 20);
    }

    public void collision() {


        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);
            if (tempObject.getId() == ID.Player) {
                if (getBounds().intersects(tempObject.getBounds())) {
//                   // if(playerInventory.getPotatoCount()>0){
//                        playerInventory.setPotatoCount(playerInventory.getPotatoCount()-1);
//                        System.out.println("Potato: "+playerInventory.getPotatoCount());
//                        if ((HUD.STEPS - KeyInput.STEPSCOUNT2) / 25 >= 0) {
//                            HUD.HUNGRY = HUD.HUNGRY + 60;
//
//                       // }
//                    }
                        if(playerInventory.getFishCount()>0 && (HUD.STEPS - KeyInput.STEPSCOUNT2) / 25 >= 0){

                                HUD.HUNGRY = HUD.HUNGRY + 60;

                            }




                }
            }
        }
    }
}
