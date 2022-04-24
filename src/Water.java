import java.awt.*;
import java.util.Random;

public class Water extends GameObject {

    private PlayerInventory playerInventory;

    private Handler handler;
    private GameObject shark;

    public Water(int x, int y, ID id, Handler handler, PlayerInventory playerInventory) {
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
        g.setColor(Color.black);
        g.fillRect((int)x, (int)y, 20, 20);

    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 20, 20);
    }

    public void collision() {

        for(int i =0; i< handler.object.size(); i++){
            if(handler.object.get(i).getId()==ID.Shark) shark=handler.object.get(i);
        }

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.Raft) {
                if (getBounds().intersects(tempObject.getBounds())) {

//                    handler.addObject(new SmartShark((int)shark.getX(), (int)shark.getY(), ID.SmartShark,handler));
                    handler.removeObject(this);
//                    handler.addObject(new RaftBounds(Game.WIDTH / 2 - 20, Game.HEIGHT / 2 - 30, ID.Raft, handler));
//                    handler.addObject(new RaftBounds(Game.WIDTH / 2 - 20, Game.HEIGHT / 2 - 10, ID.Raft, handler));
//                    handler.addObject(new RaftBounds(Game.WIDTH / 2, Game.HEIGHT / 2 - 30, ID.Raft, handler));
//                    handler.addObject(new RaftBounds(Game.WIDTH / 2, Game.HEIGHT / 2 - 10, ID.Raft, handler));

                }
            }


        }
   }
}
