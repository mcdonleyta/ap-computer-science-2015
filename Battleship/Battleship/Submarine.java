package Battleship;

public class Submarine extends Boat
{
	boolean space1 = false;
	boolean space2 = false;
	boolean space3 = false;
	boolean sunk = false;
	public Submarine(int x, int y, int _x, int _y)
	{
		int row_start = x;
		int col_start = y;
		int row_dir = _x;
		int col_dir = _y;
	}
	public boolean checkCond()
	{
		return sunk;
	}
}

