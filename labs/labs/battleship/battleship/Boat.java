package battleship;

import java.util.*;

public class Boat{
	
	protected boolean isSunk;
	private Position pos;
	private int dir;
	protected List<Character> icons = new ArrayList<Character>();
	protected List<Boolean> health = new ArrayList<Boolean>();
	
	public Boat(int x, int y, int length, int direction)
	{
		pos = new Position(x,y,length,direction);       //direction: 1 = vertical, 2 = horizontal
		for(int i=0;i<length;i++)
		{
			health.add(true);
			icons.add('#');
		}
		isSunk = false;
	}
	
	protected boolean isSunk()
	{
		boolean ret=true;
		
		for(int i=0;i<health.size();i++)
		{
			if(health.get(i)==true)        //the boat must be hit in every location to be sunk
				ret=false;
		}
		
		return ret;
	}
	
	public void takeHit(int x)
	{
		icons.set(x,'*');
		health.set(x,false);
	}
	
	protected int getLength()
	{
		return health.size();
	}
	
	public Position getPos()
	{
		return pos;
	}
	
	protected int getDir()
	{
		return dir;
	}
	
	public char getIcon(int x)
	{
		return icons.get(x);
	}
}
