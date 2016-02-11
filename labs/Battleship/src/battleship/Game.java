package battleship;

/**
 * Created by jsdsp on 2/11/16.
 */
public class Game {

    public Player p1;
    public Player p2;
    Player whosTurn;
    Player whosNotTurn;

    public Game() {
        p1 = new Player();
        p2 = new Player();
        whosTurn = p1;
        whosNotTurn = p2;
    }

    //returns winner if someone won
    public String doTurn() {

        Display.printBoard(whosTurn);
        Pos shot = Display.getShot();
        if(shot.x < Board.size.x && shot.y < Board.size.y && shot.x >= 0 && shot.y >= 0) {
            boolean hit = false;
            for (Boat b : whosNotTurn.board.boats) {
                hit = b.isHit(shot);
                if (hit)
                    break;
            }

            Display.showHitStatus(hit);
        }
        else {
            Display.invalidInput();
        }

        String ret = "none";
        if(p1.didLose())
            ret = "Player 2";
        else if(p2.didLose())
            ret = "Player 1";

        if(whosTurn == p1) {
            whosTurn = p2;
            whosNotTurn = p1;
        }
        else {
            whosTurn = p1;
            whosNotTurn = p2;
        }

        return ret;
    }
}
