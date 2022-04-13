public class Spawn {

    private Handler handler;
    private HUD hud;
    private int stepsKeep = 0;

    public Spawn(Handler handler, HUD hud) {
        this.handler = handler;
        this.hud = hud;
    }

    public void tick(){
        stepsKeep++;

    }
}
