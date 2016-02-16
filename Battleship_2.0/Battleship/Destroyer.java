package Battleship;

public class Destroyer extends Boat
{
	boolean space1 = false;
	boolean space2 = false;
	boolean sunk = false;
	int x1, x2;
	int y1, y2;
	public Destroyer(int _x1, int _y1, int _x2, int _y2)
	{
		x1 = _x1;
		y1 = _y1;
		x2 = _x2;
		y2 = _y2;
	}
	public boolean checkCond()
	{
		if(space1 == true && space2 == true)
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
	}
}
