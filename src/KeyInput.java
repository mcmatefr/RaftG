import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    private Handler handler;


    public KeyInput(Handler handler) {
        this.handler = handler;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);
            if (tempObject.getId() == ID.Player) {
                if (key == KeyEvent.VK_W) tempObject.setY(tempObject.getY() - 1);
                if (key == KeyEvent.VK_S) tempObject.setY(tempObject.getY() + 1);
                if (key == KeyEvent.VK_A) tempObject.setX(tempObject.getX() - 1);
                if (key == KeyEvent.VK_D) tempObject.setX(tempObject.getX() + 1);
            }
        }
        System.out.println(key);
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        // for (int i=0; i<handler.object.size();i++){
        //   GameObject tempObject= handler.object.get(i);
        // if (tempObject.getId()==ID.Player){
        //   if (key == KeyEvent.VK_W) handler.setUp(false);
        // if (key == KeyEvent.VK_S) handler.setDown(false);
        // if (key == KeyEvent.VK_A) handler.setLeft(false);
        // if (key == KeyEvent.VK_D) handler.setRight(false);
        //}
        //}
    }
}
