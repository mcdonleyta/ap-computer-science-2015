package Battleship;

public class Battleship extends Boat
{
	boolean space1 = false;
	boolean space2 = false;
	boolean space3 = false;
	boolean space4 = false;
	boolean sunk = false;
	public Battleship(int x, int y, int _x, int _y)
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
