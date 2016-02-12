package battleship;

import java.util.ArrayList;

/**
 * Created by jsdsp on 2/11/16.
 */
class Boat {
    private int size;
    int health;
    private ArrayList<Pos> occupiedSpaces;
    private ArrayList<Pos> destroyedSpaces;

    boolean constructionFailed;

    Boat(int _size, boolean isHorizontal, Pos firstSpace) {
        constructionFailed = false;
        size = _size;
        health = size;
        occupiedSpaces = new ArrayList<>();
        destroyedSpaces = new ArrayList<>();

        if(isHorizontal && firstSpace.x+size-1 < Board.size.x && firstSpace.y < Board.size.y && firstSpace.x >= 0 && firstSpace.y >= 0) {
            for (int a = 0; a < size; a++) {
                occupiedSpaces.add(new Pos(firstSpace.x + a, firstSpace.y));
            }
        } else if(firstSpace.y+size-1 < Board.size.y && firstSpace.x < Board.size.x && firstSpace.x >= 0 && firstSpace.y >= 0){
            for(int a = 0; a < size; a++) {
                occupiedSpaces.add(new Pos(firstSpace.x, firstSpace.y + a));
            }
        }
        else {
            constructionFailed = true;
        }
    }

    boolean didConstructionFail() {
        return constructionFailed;
    }

    ArrayList<Pos> getOccupiedSpaces() {
        return occupiedSpaces;
    }
    ArrayList<Pos> getDestroyedSpaces() {return destroyedSpaces;}

    boolean isHit(Pos space) {
        boolean toReturn = false;
        for(int a = 0; a < occupiedSpaces.size(); a++) {
            if(space.x == occupiedSpaces.get(a).x && space.y == occupiedSpaces.get(a).y) {
                destroyedSpaces.add(space);
                occupiedSpaces.remove(a);
                health--;
                toReturn = true;
                break;
            }
        }
        return toReturn;
    }

    boolean isDestroyed() {
        return health <= 0;
    }

    boolean occupies(Pos p) {
        boolean ret = false;
        for(Pos o : occupiedSpaces) {
            if (p.x == o.x && p.y == o.y)
                ret = true;
        }
        return ret;
    }
}
