import java.awt.*;
import java.util.Random;

public class Shark extends GameObject {

    private Handler handler;
    private GameObject player;
    private GameObject water;
    private GameObject raft;


    public Shark(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
        velX=1;
        velY=1;



    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 20, 20);
    }

    @Override
    public void tick() {
        for(int i =0; i< handler.object.size(); i++){
            if(handler.object.get(i).getId()==ID.Player) player=handler.object.get(i);
            if(handler.object.get(i).getId()==ID.Raft) raft=handler.object.get(i);

        }

        x += velX;
        y += velY;

        float diffX = x - player.getX() -8;
        float diffY = y - player.getY() -8;
        float distance = (float) Math.sqrt((x-player.getX())*(x-player.getX())+(y-player.getY())*(y-player.getY()));
        if(y<=0 || y>=Game.HEIGHT-50) velY*=-1;
         if(x<=0 || x>=Game.WIDTH-20) velX*=-1;

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);
            if (tempObject.getId() == ID.Raft) {
                if (getBounds().intersects(tempObject.getBounds())  ) {
//                    velX=1;
//                    velY=1;
                    if (raft.getBounds().intersects(player.getBounds())) {
                        x += (velX * 5) * -1;
                        y += (velY * 5) * -1;
                        velX *= -1;
                        velY *= -1;
                    }
                }

            }
            if (tempObject.getId() == ID.Water) {
                if (player.getBounds().intersects(tempObject.getBounds())) {
                    velX = (float) ((-1.0 / distance) * diffX);
                    velY = (float) ((-1.0 / distance) * diffY);
                }


            }
        }

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect((int)x, (int)y, 20, 20);
    }
}
