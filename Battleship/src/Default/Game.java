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
        d.printBoard(p1.getBoard());
        d.printBoard(p1.getBoard());
        if(which) {
            d.anyKey(p1.getName() + " ");
            d.clrScreen();
            g = p1.move();
            isSink = p2.hit(g.getX(), g.getY());
            if(isSink) {
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
