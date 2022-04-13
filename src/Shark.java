import java.awt.*;

public class Shark extends GameObject{



    public Shark(int x, int y, ID id) {
        super(x, y, id);
        velX=1;
        velY=1;

    }

    public Rectangle getBounds(){
        return new Rectangle(x,y,20,20);
    }
    @Override
    public void tick() {
        x+=velX;
        y+=velY;
        if(y<=0 || y>=Game.HEIGHT-50) velY*=-1;
         if(x<=0 || x>=Game.WIDTH-20) velX*=-1;

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x,y,20,20);
    }
}
