package pacman;

import java.util.*;

public class MoveableEntity extends Entity
{
	private int ypos;  //row number
	private int xpos;  //col number
	
	public MoveableEntity()
	{	
		ypos = 10;
		xpos = 20;
		setEntityChar('C');
	}
	
	public int getYpos()
	{
		return ypos;
	}
	public int getXpos()
	{
		return xpos;
	}
	public void setYpos(int r)
	{
		ypos=r;
	}
	public void setXpos(int c)
	{
		xpos=c;
	}
}
