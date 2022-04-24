import java.awt.*;

public class SmartShark extends GameObject{
    private Handler handler;
    private GameObject player;


    public SmartShark(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
        velX=1;
        velY=1;

        for(int i =0; i< handler.object.size(); i++){
            if(handler.object.get(i).getId()==ID.Player) player=handler.object.get(i);
        }


    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 20, 20);
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        float diffX = x - player.getX() -8;
        float diffY = y - player.getY() -8;
        float distance = (float) Math.sqrt((x-player.getX())*(x-player.getX())+(y-player.getY())*(y-player.getY()));
        velX= (float)((-1.0/distance)*diffX);
        velY= (float)((-1.0/distance)*diffY);

        if(y<=0 || y>=Game.HEIGHT-50) velY*=-1;
        if(x<=0 || x>=Game.WIDTH-20) velX*=-1;



    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect((int)x, (int)y, 20, 20);
    }
}
