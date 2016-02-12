package Main;
import battleship.*;

/**
 * Created by jsdsp on 2/11/16.
 */
public class Driver {
    public static void main(String[] args) {
        Game g = new Game();
        Boolean isOver = false;
        while(!isOver) {
            isOver = g.doTurn();
        }
    }

}
