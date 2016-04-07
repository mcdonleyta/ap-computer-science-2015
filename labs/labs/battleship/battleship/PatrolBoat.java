package battleship;

import java.util.*;

public class PatrolBoat extends Boat{
	
	String name;
	
	public PatrolBoat(int xpos, int ypos, int dir)
	{
		super(xpos,ypos,2,dir);
		name = "patrol boat";
	}
}
