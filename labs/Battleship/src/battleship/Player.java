package battleship;

/**
 * Created by jsdsp on 2/11/16.
 */
public class Player {

    Board board;
    Player() {
        board = new Board();
        board.populate();
    }

    boolean didLose() {
        return board.boats.isEmpty();
    }



}
