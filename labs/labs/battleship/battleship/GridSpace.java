package battleship;

import java.util.*;

public class GridSpace{
	
	private boolean ifBoat;
	private char icon;
	private Position pos;
	
	public GridSpace(int x, int y, char i)
	{
		pos = new Position(x,y,1,1);
		icon = i;
	}
	
	public char getIcon()
	{
		return icon;
	}
	
	public Position getPos()
	{
		return pos;
	}
}
