import java.awt.*;

public class HUD {

    public static float HUNGRY =100;
    public static int STEPS=0;
    public static float THIRSTY =100;




    public void tick(){

        HUNGRY=Game.clamp(HUNGRY,0,100);
        THIRSTY=Game.clamp(THIRSTY,0,100);

    }
    public void render(Graphics g){

//        g.setColor(Color.gray);
//        g.fillRect(15,15,200,34);
//        g.setColor(Color.green);
//        g.fillRect(15,15,HUNGRY*2,34);
        g.setColor(Color.white);
//        g.drawRect(15,15,200,34);
        g.drawString("Hungry: "+ (int)HUNGRY, 10, 24);
        g.drawString("Thirsty: "+ (int)THIRSTY, 10, 44);
        g.drawString("Steps: "+ STEPS, 10, 64);

    }


}
