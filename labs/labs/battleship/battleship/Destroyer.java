package battleship;

import java.util.*;

public class Destroyer extends Boat{
	
	String name;
	
	public Destroyer(int xpos, int ypos, int dir)
	{
		super(xpos,ypos,3,dir);
		name = "destroyer";
	}
}
