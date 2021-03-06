import java.awt.*;

/**
 * Ehseg, szomjusag es lepesszam megjelenitese
 */
public class HUD {

    public static float HUNGRY =100;
    public static int STEPS=0;
    public static float THIRSTY =100;


    /**
     * Frissites
     */
    public void tick(){

        HUNGRY=Game.clamp(HUNGRY,0,100);
        THIRSTY=Game.clamp(THIRSTY,0,100);

    }

    /**
     * Megjelenites
     * @param g grafikus parameter
     */
    public void render(Graphics g){


        g.setColor(Color.white);

        g.drawString("Hungry: "+ (int)HUNGRY, 10, 24);
        g.drawString("Thirsty: "+ (int)THIRSTY, 10, 44);
        g.drawString("Steps: "+ STEPS, 10, 64);


        if(HUD.HUNGRY==0 || HUD.THIRSTY==0){

            g.drawString("You lost!", Game.WIDTH/2, Game.HEIGHT/2);
        }
        if(HUD.STEPS==1500){
            g.drawString("You win!", Game.WIDTH/2, Game.HEIGHT/2);
        }



    }


}
