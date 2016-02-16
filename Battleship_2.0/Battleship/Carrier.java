package Battleship;

public class Carrier extends Boat
{
	boolean space1 = false;
	boolean space2 = false;
	boolean space3 = false;
	boolean space4 = false;
	boolean space5 = false;
	boolean sunk = false;
	int x1, x2, x3, x4, x5;
	int y1, y2, y3, y4, y5;
	public Carrier(int _x1, int _y1, int _x2, int _y2, int _x3, int _y3, int _x4, int _y4, int _x5, int _y5)
	{
		x1 = _x1;
		y1 = _y1;
		x2 = _x2;
		y2 = _y2;
		x3 = _x3;
		y3 = _y3;
		x4 = _x4;
		y4 = _y4;
		x5 = _x5;
		y5 = _y5;
	}
	public boolean checkCond()
	{
		if(space1 == true && space2 == true && space3 == true && space4 == true && space5 == true)
		{
			sunk = true;
		}
		return sunk;
	}
	public void setSpace(int x, int y)
	{
		if(x1 == x && y1 == y)
		{
			space1 = true;
		}
		else if(x2 == x && y2 == y)
		{
			space2 = true;
		}
		else if(x3 == x && y3 == y)
		{
			space3 = true;
		}
		else if(x4 == x && y4 == y)
		{
			space4 = true;
		}
		else if(x5 == x && y5 == y)
		{
			space5 = true;
		}
	}
}
