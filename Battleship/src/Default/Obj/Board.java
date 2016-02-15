package Default.Obj;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List< ArrayList<GridSpace> > board;

    public void genBoard() {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                board.get(i).add(new GridSpace(j, i));
            }
        }
    }
    public void addBoat(int startX, int startY, String Direction, String type, Boolean autoGen) {
        Boat b;
        List<BoatSpace> boatSpaces;
        if(type.equals("AircraftCarrier"))
            b = new AircraftCarrier();
        else if(type.equals("Battleship"))
            b = new BBattleship();
        else if(type.equals("Submarine"))
            b = new Submarine();
        else if(type.equals("Destroyer"))
            b = new Destroyer();
        else if(type.equals("PatrolBoat"))
            b = new PatrolBoat();
        else
            b = new PatrolBoat();
        if(autoGen)
            boatSpaces = b.genShip(startX, startY);
        else
            boatSpaces = b.placeShip(startX, startY, Direction);
        for(BoatSpace h: boatSpaces) {
            board.get(h.getY()).set(h.getX(), new BoatSpace(h.getX(), h.getY()));
        }
    }

    public GridSpace get(int x, int y) {
        return board.get(y).get(x);
    }

    public Board() {
        board = new ArrayList< ArrayList<GridSpace> >(10);
        for(int i = 0; i < 10; i++)
            board.add(new ArrayList<GridSpace>(10));
    }

}
