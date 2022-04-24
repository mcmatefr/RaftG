import java.awt.*;
import java.util.Random;

public class Raft extends GameObject {
    private Handler handler;
    private GameObject smartShark;
    private PlayerInventory playerInventory;




    public Raft(int x, int y, ID id, Handler handler, PlayerInventory playerInventory) {
        super(x, y, id);
        this.handler = handler;
        this.playerInventory = playerInventory;

    }

    @Override
    public void tick() {
//        collision();
    }

    @Override
    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.orange);
        g.fillRect((int)x, (int)y, 20, 20);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 20, 20);
    }


//    public void collision() {
//
//        for(int i =0; i< handler.object.size(); i++){
//            if(handler.object.get(i).getId()==ID.SmartShark) smartShark=handler.object.get(i);
//        }
//
//        for (int i = 0; i < handler.object.size(); i++) {
//            GameObject tempObject = handler.object.get(i);
//
//            if (tempObject.getId() == ID.Player) {
//                if (getBounds().intersects(tempObject.getBounds())) {
//
//                    handler.addObject(new Shark(0, 0, ID.Shark,handler));
//                    handler.removeObject(smartShark);
//
//                }
//            }
//
//
//        }
//    }

}

