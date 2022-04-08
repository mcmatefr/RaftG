import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Game extends Canvas implements Runnable {

    private static final long serialVersionUID = 1550691097823471818L;
    public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;

    private Thread thread;
    private boolean isRunning = false;
    private Random r;
    private Handler handler;

    //private BufferedImage level = null;


    public Game() {

        handler = new Handler();
        this.addKeyListener(new KeyInput(handler));

        new Window(WIDTH, HEIGHT, "Raft", this);
        //start();

        r = new Random();
        handler.addObject(new Player(WIDTH / 2 - 32, HEIGHT / 2 - 32, ID.Player));
        //for (int i=0; i<50; i++){
        // handler.addObject(new Player(r.nextInt(WIDTH),r.nextInt(HEIGHT),ID.Player));
        //}

//        BufferedImageLoader loader = new BufferedImageLoader();
//        level = loader.loadImage("/level.png");
//
//        loadLevel(level);


    }

    public synchronized void start() {
        isRunning = true;
        thread = new Thread(this);
        thread.start();

    }

    public void stop() {
        isRunning = false;
        try {
            thread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.start();
    }

    public void run() {

        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while (isRunning) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) {
                tick();
                delta--;
            }
            render();
            frames++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                //System.out.println("FPS: "+frames);
                frames = 0;

            }
        }
        stop();
    }

    public void tick() {
        handler.tick();
    }

    public void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();

        g.setColor(Color.black);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        handler.render(g);
        g.dispose();
        bs.show();

    }


    public static void main(String[] args) {
        new Game();
    }
}
