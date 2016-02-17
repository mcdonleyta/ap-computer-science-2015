//Mr. M: I really appreciate the full functionality and extra features you put into this. It's easy for a few bugs to sneak into
// the implementation as the design grows larger. However, the actual design and implemenation are pretty good. Nice job!

package Default;
import Default.Obj.*;

//Game is Driver
public class Game {

    private Player p1;
    private Player p2;
    private Boolean isOver;
    private Display d;

    public void turn(Boolean which) {
        GridSpace g;
        Boolean isSink, isKill;
        d.printBoard(p1.getBoard()); //MR. M: You probably didn't mean to print out the same board twice
        d.printBoard(p1.getBoard()); // I would delete these lines and move them into the correct player's IF clause
        if(which) {
            d.anyKey(p1.getName() + " ");
            d.clrScreen();
            //MR. M: d.printBoard(p2.getBoard());
            g = p1.move();                       //MR. M: Move checks valid unused locations using p1's board
            isSink = p2.hit(g.getX(), g.getY()); //       but we record the shots on P2's board
            if(isSink) {                         // => so when P2 tries to make an identical shot, they can not!
                p2.sunkMessage(p1.getName());
                p2.decreaseHealth();
                if(p2.getHealth() == 0) {
                    isOver = true;
                }
            }
        }
        else {
            d.anyKey(p2.getName() + " ");
            d.clrScreen();
            //MR. M: d.printBoard(p1.getBoard());
            g = p2.move();
            isSink = p1.hit(g.getX(), g.getY());
            if(isSink) {
                p1.sunkMessage(p2.getName());
                p1.decreaseHealth();
                if(p1.getHealth() == 0) {
                    isOver = true;
                }
            }
        }
    }

    public void turns() {
        Boolean which = true;
        while(!isOver) {
            turn(which);
            which = !which;
        }

    }

    public Game() {
        isOver = false;
        d = new Display();
        p1 = new Player(d.input("What is the first player's name"));
        p2 = new Player(d.input("What is the second player's name"));
        p1.addBoats();
        d.clrScreen();
        p2.addBoats();
        d.clrScreen();
    }

}
