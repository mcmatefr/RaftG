import java.awt.*;

public class Purifier extends GameObject{
    private Handler handler;
    PlayerInventory playerInventory;
//    int count = 0;
//    int stepsCount =(HUD.STEPS-KeyInput.STEPSCOUNT)/25;

    public Purifier(int x, int y, ID id,Handler handler) {
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
        g.setColor(Color.lightGray);
        g.fillRect(x,y,20,20);
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

                  // System.out.println(KeyInput.STEPSCOUNT);

                  if ((HUD.STEPS-KeyInput.STEPSCOUNT)%25>=0){
                    //if(stepsCount-count>0){


                      HUD.THIRSTY=HUD.THIRSTY+40;
//                      count++;


                  }
                }
            }
        }
    }
}
