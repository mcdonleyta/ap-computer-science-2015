package battleship;

import java.util.ArrayList;

/**
 * Created by jsdsp on 2/11/16.
 */
class Board {
    static Pos size = new Pos(10, 10);

    ArrayList<Boat> boats;

    Board() {
        boats = new ArrayList<>();
    }

    private int rand0tox() {
        return (int) (Math.random() * size.x);
    }
    private int rand0toy() {
        return (int) (Math.random() * size.y);
    }
    private boolean randBool() {
        return Math.random() < 0.5;
    }

    private boolean occupied(ArrayList<Pos> spaces) {
        boolean ret = false;
        boolean done = false;
        for(Pos p : spaces) {
            for(Boat b : boats) {
                ret = b.occupies(p);
                if(ret) {
                    done = true;
                    break;
                }
            }
            if(done)
                break;
        }
        return ret;
    }

    void populate() {
        for(int a = 1; a <= 5; a++) {
            boolean failed = true;
            while (failed) {
                Boat b = new Boat(a, randBool(), new Pos(rand0tox(), rand0toy()));
                failed = b.didConstructionFail() || occupied(b.getOccupiedSpaces());
                if (!failed)
                    boats.add(b);
            }
        }

    }

    void updateBoatsAlive() {
        for(int a = 0; a < boats.size(); a++)
            if(boats.get(a).isDestroyed()) {
                boats.remove(a);
                a--; //prevents skipping an index
            }
    }

}
