package Battleship;

public class Submarine extends Boat
{
	boolean space1 = false;
	boolean space2 = false;
	boolean space3 = false;
	boolean sunk = false;
	int x1, x2, x3;
	int y1, y2, y3;
	public Submarine(int _x1, int _y1, int _x2, int _y2, int _x3, int _y3)
	{
		x1 = _x1;
		y1 = _y1;
		x2 = _x2;
		y2 = _y2;
		x3 = _x3;
		y3 = _y3;
	}
	public boolean checkCond()
	{
		return sunk;
	}
}

