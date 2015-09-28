package pacman;

import java.util.*;

public class Entity
{

	private char entityChar;
	private int passable; //treat as bool
	
	public Entity()
	{
		entityChar = '?';
		passable = 1;
	}
	public Entity(char c, int p)
	{
		entityChar = c;
		passable = p;
	}
	
	public void setEntityChar(char ascii)
	{
		//eventually add checks and safety
		entityChar = ascii;
	}
		
	public char getEntityChar()
	{
		return entityChar;
	}
		
}
