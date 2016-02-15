package Default;

/*This Class is basically useless*/
public class Battleship {

    public static void main(String[] args) {

        Display d = new Display();
        Player p = new Player(d.input("What is your name"));
        p.addBoats();
        d.printBoard(p.getBoard());

    }

}
