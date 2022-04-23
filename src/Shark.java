import java.awt.*;
import java.util.Random;

public class Shark extends GameObject {

    private Handler handler;
//    Random r = new Random();
//    int choose = 0;

    public Shark(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
        velX=1;
        velY=1;


    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 20, 20);
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;
        if(y<=0 || y>=Game.HEIGHT-50) velY*=-1;
         if(x<=0 || x>=Game.WIDTH-20) velX*=-1;
//
//        for (int i = 0; i < handler.object.size(); i++) {
//            GameObject tempObject = handler.object.get(i);
//            if (tempObject.getId() == ID.Raft) {
//                velY *= -1;
//                velX *= -1;
//            }
//        }

//        choose = r.nextInt(10);
        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);
            if (tempObject.getId() == ID.Raft) {
                if (getBounds().intersects(tempObject.getBounds())) {
                    x+=(velX*5) * -1;
                    y+=(velY*5) *-1;
                    velX*=-1;
                    velY*=-1;
                }
//                else if (choose ==0){
//                    velX = (r.nextInt(4 - -4) + -4);
//                    velY = (r.nextInt(4 - -4) + -4);
//
//                }
            }
        }

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, 20, 20);
    }
}
