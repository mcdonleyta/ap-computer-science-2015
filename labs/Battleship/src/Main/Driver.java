package Main;
import battleship.*;

/**
 * Created by jsdsp on 2/11/16.
 */
public class Driver {
    public static void main(String[] args) {
        Game g = new Game();
        String winner = "none";
        while(winner.equals("none")) {
            winner = g.doTurn();
        }
    }

}
