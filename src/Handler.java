import java.awt.*;
import java.util.LinkedList;

/**
 * Osszes objektumunk karbantartasa <br>
 * Vegigmegy az objektumokon frissiti oket vagy megjeleniti
 */
public class Handler {

    LinkedList <GameObject> object = new LinkedList<GameObject>();

    /**
     * Vegigmegy az objektumokon es frissiti
     */
    public void tick (){
        for (int i=0; i < object.size(); i++ ){
            GameObject  tempObject = object.get(i);
            tempObject.tick();
        }
    }

    /**
     * Vegigmegy az objektumokon es megjeleniti <br>
     * @param g grafikus parameter
     */
    public void render (Graphics g){
        for (int i=0; i < object.size(); i++ ){
            GameObject  tempObject = object.get(i);
            tempObject.render(g);
        }
    }

    /**
     * Uj objektumot ad a listahoz
     * @param object az uj objektum
     */
    public void addObject (GameObject object){
        this.object.add(object);

    }

    /**
     * Meglevo objektumot torol
     * @param object a meglevo objektum
     */
    public void removeObject (GameObject object){
        this.object.remove(object);

    }

    /**
     * Torol minden objektumot a listarol
     */
    public void clearAll(){
    for (int i = 0; i < object.size(); i++) {
        GameObject tempObject = object.get(i);
        object.clear();
    }
}
}
