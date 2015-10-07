package pacman;

import java.util.*;

public class Player extends MoveableEntity
{
	public Player()
	{	
		setYpos(20);
		setXpos(20);
		setEntityChar('C');
	}
	
	public void up()
	{
		setXpos(getXpos()-1);
	}
	public void left()
	{
		setYpos(getYpos()-1);
	}
	public void down()
	{
		setXpos(getXpos()+1);
	}
	public void right()
	{
		setYpos(getYpos()+1);
	}
	
}
