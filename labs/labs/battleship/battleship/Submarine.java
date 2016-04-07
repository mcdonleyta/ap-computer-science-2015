package battleship;

import java.util.*;

public class Submarine extends Boat{
	
	String name;
	
	public Submarine(int xpos, int ypos, int dir)
	{
		super(xpos,ypos,3,dir);
		name = "submarine";
	}
}
