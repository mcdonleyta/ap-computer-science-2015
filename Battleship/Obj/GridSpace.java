package Obj;

public class GridSpace {

	private char icon;
	private Boolean isHit;
	int x, y;
	
	public char getIcon() {return icon;}
	public void setIcon(char _icon) {icon = _icon;}
	public Boolean getHit() {return isHit;}
	public Boolean hit() {
		isHit = true;
		icon = 'x';
		return false;
	}
	public Boolean getBoat() {return false;}
	public int getX() {return x;}
	public int getY() {return y;}

	public GridSpace() {
		isHit = false;
		icon = 'O';
		x = -1;
		y = -1;
	}

	public GridSpace(int _x, int _y) {
		isHit = false;
		icon = 'O';
		x = _x;
		y = _y;
	}

}
