package Default.Obj;
import java.util.*;

public class Boat {

    private List<BoatSpace> spaces;
    private int length;

    public Boolean hit(int x, int y) {
        for(int i = 0; i < spaces.size(); i++) {
            if(spaces.get(i).getX() == x && spaces.get(i).getY() == y)
                spaces.remove(i);
        }
        if (getSunk() == true)
            return true;
        return false;
    }

    public Boolean getSunk() {
        if(spaces.size() == 0)
            return true;
        return false;
    }

    public void setLength(int _length) { length = _length; }

    public List<BoatSpace> genShip(int startX, int startY) {
        Random numGen = new Random();
        List<String> Directions = new ArrayList<String>(0);
        String Direction;
        Directions.add("North");
        Directions.add("South");
        Directions.add("East");
        Directions.add("West");
        if(startX == 0 || startX - length >= 0)
            Directions.remove(3);
        else if(startY == 0 || startY - length >= 0)
            Directions.remove(1);
        else if(startX == 9 || 9 - startX - length >= 0)
            Directions.remove(2);
        else if(startY == 9 || 9 - startY - length >= 0)
            Directions.remove(0);
        Direction = Directions.get(numGen.nextInt(Directions.size() - 1));
        placeShip(startX, startY, Direction);
        return spaces;
    }

    public List<BoatSpace> placeShip(int startX, int startY, String Direction) {
        System.out.println(Direction);
        if(Direction.equals("North")) {
            for(int i = startY; i < length + startY; i++) {
                spaces.add(new BoatSpace(startX, i));
            }
        }
        else if(Direction.equals("South")) {
            for(int i = startY; i > startY - length; i--) {
                spaces.add(new BoatSpace(startX, i));
            }
        }
        else if(Direction.equals("East")) {
            for(int i = startX; i < length + startX; i++) {
                spaces.add(new BoatSpace(i, startY));
            }
        }
        else if(Direction.equals("West")) {
            for(int i = startX; i > startX - length; i--) {
                spaces.add(new BoatSpace(i, startY));
            }
        }
        return spaces;
    }

    public Boat() {
        spaces = new ArrayList<BoatSpace>(0);
    }

}
