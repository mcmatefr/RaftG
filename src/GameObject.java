import java.awt.*;

/**
 * Abstract osztaly a GameObject-eknek
 */
public abstract class  GameObject {

    protected float x, y;
    protected ID id;
    protected float velX = 0, velY = 0;

    /**
     * GameObject constructor
     * @param x koordinata
     * @param y koordinata
     * @param id identitas
     */
    public GameObject(float x, float y, ID id) {
        this.x = x;
        this.y = y;
        this.id=id;
    }

    /**
     * Frissites
     */
    public abstract void tick();

    /**
     * Megjelenites
     * @param g grafikus parameter
     */
    public abstract void render(Graphics g);

    /**
     * Object-ek hatarat adja meg
     * @return teglalap
     */
    public abstract Rectangle getBounds();

    /**
     * Getter az id-ra
     * @return enum id
     */
    public ID getId() {
        return id;
    }

    /**
     * Setter az id-ra
     * @param id enum id
     */
    public void setId(ID id) {
        this.id = id;
    }

    /**
     * Getter koordinatara
     * @return x koordinata
     */
    public float getX() {
        return x;
    }

    /**
     * Setter a koordinatara
     * @param x koordinata
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Getter a koordinatara
     * @return y koordinata
     */
    public float getY() {
        return y;
    }

    /**
     * Setter az y koordinatara
     * @param y koordinata
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Getter a sebessegre
     * @return sebesseg
     */
    public float getVelX() {
        return velX;
    }

    /**
     * Setter a sebessegre
     * @param velX sebesseg
     */
    public void setVelX(float velX) {
        this.velX = velX;
    }

    /**
     * Getter a sebessegre
     * @return sebesseg
     */
    public float getVelY() {
        return velY;
    }

    /**
     * Setter a sebessere
     * @param velY sebesseg
     */
    public void setVelY(float velY) {
        this.velY = velY;
    }

}
