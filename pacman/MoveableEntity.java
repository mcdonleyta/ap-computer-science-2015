package pacman;

import pacman.*;
import java.util.*;

public class MoveableEntity extends Entity
{
	private int ypos;  //row number
	private int xpos;  //col number
	
	public MoveableEntity()
	{
		ypos = 10;
		xpos = 20;
		entityChar = 'C';
	}
	
	public int getYpos()
	{
		return ypos;
	}
	public int getXpos()
	{
		return xpos;
	}
	public int setYpos(int r)
	{
		ypos=r;
	}
	public int setXpos(int c)
	{
		xpos=c;
	}
}
