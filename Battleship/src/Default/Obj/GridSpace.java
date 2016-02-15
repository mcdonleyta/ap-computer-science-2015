package Default.Obj;

public class GridSpace {

    private char icon;
    private Boolean isHit;
    private Boolean isBoat;
    int x, y;

    public char getIcon() {return icon;}
    public void setIcon(char _icon) {icon = _icon;}
    public Boolean getHit() {return isHit;}
    public Boolean hit() {
        isHit = true;
        icon = 'X';
        return false;
    }
    public Boolean getBoat() {return isBoat;}
    public int getX() {return x;}
    public int getY() {return y;}

    public GridSpace() {
        isHit = false;
        icon = 'O';
        x = -1;
        y = -1;
        isBoat = false;
    }

    public GridSpace(int _x, int _y) {
        isHit = false;
        icon = 'O';
        x = _x;
        y = _y;
        isBoat = false;
    }

    public GridSpace(int _x, int _y ,Boolean _isBoat) {
        isHit = false;
        icon = 'O';
        x = _x;
        y = _y;
        isBoat = _isBoat;
    }

}
