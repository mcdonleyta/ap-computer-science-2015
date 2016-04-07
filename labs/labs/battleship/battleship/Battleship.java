package battleship;

import java.util.*;

public class Battleship extends Boat{
	
	String name;
	
	public Battleship(int xpos, int ypos, int dir)
	{
		super(xpos,ypos,5,dir);
		name = "battleship";
	}
}
