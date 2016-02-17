package Default;

import Default.Obj.*;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String playerName;
    private Board playerBoard;
    private Display playerOut;
    private List<Boat> boats;
    private List<String> boatTypes;
    private String lastSunk;
    private int health;

    public String getName() { return playerName; }
    public Board getBoard() { return playerBoard; }
    public int getHealth() {return health; }

    public GridSpace move() {
        Boolean complete = false;
        Boolean isFail = false;
        GridSpace g;
        do {
            g = playerOut.playerMove(isFail, playerName);
            if (playerBoard.get(g.getX(), g.getY()).getHit())
                isFail = true;
            else
                complete = true;
        }while(!complete);
        return g;
    }

    //Returns true if boat is sunk
    public Boolean hit(int _x, int _y) {
        if(playerBoard.get(_x, _y).getBoat()) {
            for(Boat ba: boats) {
                for(BoatSpace bb: ba.getBoats()) {
                    if(bb.getX() == _x && bb.getY() == _y) {
                        bb.hit();
                        ba.hit(_x, _y);
                        lastSunk = ba.getType();
                        return ba.getSunk();
                    }
                }
            }
        }
        playerBoard.get(_x, _y).hit(); //MR. M: This line of code needs to be moved before the if(..) otherwise 
                                       //the player board may not be updated if we "return ba.getSunk();"
        return false;
    }

    public void addBoats() {
        String ret;
        int startX = 0, startY = 0;
        String Direction = "North";
        Boat b = new Boat();
        List<BoatSpace> spaces = new ArrayList<BoatSpace>(0);
        Boolean isFail = false;
        for(String s: boatTypes) {
            playerOut.printBoard(playerBoard);
            do {
                ret = playerOut.playerAddBoat(isFail, s);
                isFail = false;
                startX = Integer.parseInt(ret.substring(0, 1));
                startY = Integer.parseInt(ret.substring(1, 2));
                Direction = ret.substring(2);
                if(startX < 10 && startX >= 0 && startY < 10 && startY >= 0) {
                    if(s.equals("AircraftCarrier"))
                        b = new AircraftCarrier();
                    else if(s.equals("Battleship"))
                        b = new BBattleship();
                    else if(s.equals("Submarine"))
                        b = new Submarine();
                    else if(s.equals("Destroyer"))
                        b = new Destroyer();
                    else if(s.equals("PatrolBoat"))
                        b = new PatrolBoat();
                    else
                        b = new Boat();
                    spaces = b.placeShip(startX, startY, Direction);
                    for(BoatSpace x: spaces) {
                        if (playerBoard.get(x.getX(), x.getY()).getBoat())
                            isFail = true;
                        if(x.getX() > 9 || x.getX() < 0 || x.getY() > 9 || x.getY() < 0)
                            isFail = true;
                    }
                }
                else
                    isFail = true;
            } while(isFail);
            playerBoard.addBoat(startX, startY, Direction, s, false);
            boats.add(b);
            health++;
        }
    }

    public void sunkMessage(String pName) {
        playerOut.output(pName + " sunk your " + lastSunk + "!");
        playerOut.output(playerName + " ");
    }

    public void decreaseHealth() { health--; }

    public Player(String _playerName) {
        playerName = _playerName;
        playerBoard = new Board();
        playerOut = new Display();
        boats = new ArrayList<Boat>(0);
        health = 0;
        boatTypes = new ArrayList<String>(0);
        playerBoard.genBoard();
        boatTypes.add("AircraftCarrier");
        boatTypes.add("Battleship");
        boatTypes.add("Submarine");
        boatTypes.add("Destroyer");
        boatTypes.add("PatrolBoat");
    }

}
