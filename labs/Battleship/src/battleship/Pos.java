package battleship;

/**
 * Created by jsdsp on 2/11/16.
 */
public class Pos {
    public Pos() {

    }
    public Pos(int _x, int _y) {
        x = _x;
        y = _y;
    }
    public int x;
    public int y;

    public String toString() {
        return "(" + Integer.toString(x) + ", " + Integer.toString(y) + ")";
    }
}
