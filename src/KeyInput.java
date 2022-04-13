import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class KeyInput extends KeyAdapter {

    private Handler handler;
    private Random r;
    private PlayerInventory playerInventory;


    public KeyInput(Handler handler, PlayerInventory playerInventory) {
        this.handler = handler;
        this.playerInventory = playerInventory;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);
            if (tempObject.getId() == ID.Player) {
                if (key == KeyEvent.VK_W) {
                    tempObject.setY(tempObject.getY() - 20);
                    HUD.STEPS++;
                    HUD.THIRSTY--;
                    HUD.HUNGRY--;
                    addNewObject();
                }

                if (key == KeyEvent.VK_S) {
                    tempObject.setY(tempObject.getY() + 20);
                    HUD.STEPS++;
                    HUD.THIRSTY--;
                    HUD.HUNGRY--;
                    addNewObject();
                }
                if (key == KeyEvent.VK_A) {
                    tempObject.setX(tempObject.getX() - 20);
                    HUD.STEPS++;
                    HUD.THIRSTY--;
                    HUD.HUNGRY--;
                    addNewObject();
                }
                if (key == KeyEvent.VK_D) {
                    tempObject.setX(tempObject.getX() + 20);
                    HUD.STEPS++;
                    HUD.THIRSTY--;
                    HUD.HUNGRY--;
                    addNewObject();
                }
                if (key == KeyEvent.VK_E) {
                    tempObject.setY(tempObject.getY() - 20);
                    tempObject.setX(tempObject.getX() + 20);
                    HUD.STEPS++;
                    HUD.THIRSTY--;
                    HUD.HUNGRY--;
                    addNewObject();
                }
                if (key == KeyEvent.VK_Q) {
                    tempObject.setY(tempObject.getY() - 20);
                    tempObject.setX(tempObject.getX() - 20);
                    HUD.STEPS++;
                    HUD.THIRSTY--;
                    HUD.HUNGRY--;
                    addNewObject();
                }
                if (key == KeyEvent.VK_Y) {
                    tempObject.setY(tempObject.getY() + 20);
                    tempObject.setX(tempObject.getX() - 20);
                    HUD.STEPS++;
                    HUD.THIRSTY--;
                    HUD.HUNGRY--;
                    addNewObject();
                }
                if (key == KeyEvent.VK_X) {
                    tempObject.setY(tempObject.getY() + 20);
                    tempObject.setX(tempObject.getX() + 20);
                    HUD.STEPS++;
                    HUD.THIRSTY--;
                    HUD.HUNGRY--;
                    addNewObject();
                }
            }
            if (tempObject.getId() == ID.Barrell || tempObject.getId() == ID.Leaf || tempObject.getId() == ID.Waste || tempObject.getId() == ID.Wood) {
                if (key == KeyEvent.VK_W || key == KeyEvent.VK_S || key == KeyEvent.VK_D ||
                        key == KeyEvent.VK_A || key == KeyEvent.VK_E || key == KeyEvent.VK_Q || key == KeyEvent.VK_Y || key == KeyEvent.VK_X) {
                    tempObject.setY(tempObject.getY() + 20);
                }
            }

//            if (tempObject.getId() == ID.Shark) {
//                if (key == KeyEvent.VK_S || key == KeyEvent.VK_W || key == KeyEvent.VK_D ||
//                        key == KeyEvent.VK_A || key == KeyEvent.VK_E || key == KeyEvent.VK_Q || key == KeyEvent.VK_Y || key == KeyEvent.VK_X) {
//                    //tempObject.setY(tempObject.getY() + 20);
//                    //tempObject.setX(tempObject.getX() + 20);
//
//                    if(tempObject.getY()<=0 || tempObject.getY()>=Game.HEIGHT-50) tempObject.setY(tempObject.getY() + (20*(-1)));
//                    if(tempObject.getX()<=0 || tempObject.getX()>=Game.WIDTH-20) tempObject.setX(tempObject.getX() + (20*(-1)));
//                }
//            }


        }
        if (key == KeyEvent.VK_ESCAPE) System.exit(1);
    }

    public void keyReleased(KeyEvent e) {
//        int key = e.getKeyCode();
//         for (int i=0; i<handler.object.size();i++){
//           GameObject tempObject= handler.object.get(i);
//         if (tempObject.getId()==ID.Player){
//             if (key == KeyEvent.VK_W) tempObject.setY(tempObject.getY() - 20);
//
//             if (key == KeyEvent.VK_S) tempObject.setY(tempObject.getY() + 20);
//             if (key == KeyEvent.VK_A) tempObject.setX(tempObject.getX() - 20);
//             if (key == KeyEvent.VK_D) tempObject.setX(tempObject.getX() + 20);
//        }
//        }
    }

    public void addNewObject() {

        int count = 0;
        r = new Random();
        if (r.nextInt(100) < 32 && count <= 3) {
            handler.addObject(new Wood((r.nextInt(Game.WIDTH)) / 20 * 20 - 40, -20, ID.Wood, handler));
            count++;
        }
        if (r.nextInt(100) < 32 && count <= 3) {
            handler.addObject(new Leaf((r.nextInt(Game.WIDTH)) / 20 * 20 - 40, -20, ID.Leaf, handler, playerInventory));
            count++;
        }
        if (r.nextInt(100) < 32 && count <= 3) {
            handler.addObject(new Waste((r.nextInt(Game.WIDTH)) / 20 * 20 - 40, -20, ID.Waste, handler));
            count++;
        }
        if (r.nextInt(100) < 4 && count <= 3) {
            handler.addObject(new Barrell((r.nextInt(Game.WIDTH)) / 20 * 20 - 40, -20, ID.Barrell, handler));
            count++;
        }

    }

}
