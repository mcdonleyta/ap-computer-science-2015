// Mr. M: The structure and style of your code is very clean. Nice work!

package battleship;

/**
 * Created by jsdsp on 2/11/16.
 */
public class Game {

    Player p1;
    Player p2;
    private Player whosTurn;   //Mr. M: This was a great choice for the variable names. A good example of "self documenting code"
    private Player whosNotTurn;// this makes the code a lot easier to understand

    public Game() {
        p1 = new Player("Player 1");
        p2 = new Player("Player 2");
        whosTurn = p1;
        whosNotTurn = p2;
    }

    //returns winner if someone won
    public Boolean doTurn() {

        Display.printBoard(whosTurn);
        Display.printEnemyShipsRemaining(whosNotTurn);
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

        whosNotTurn.board.updateBoatsAlive();

        Boolean ret = false;
        if(p1.didLose()) {
            Display.winner(p2);
            ret = true;
        }
        else if(p2.didLose()) {
            Display.winner(p1);
            ret = true;
        }

        if(whosTurn == p1) {
            whosTurn = p2;
            whosNotTurn = p1;
        }
        else {
            whosTurn = p1;
            whosNotTurn = p2;
        }

        try {
            Thread.sleep(1000);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        return ret;
    }
}
