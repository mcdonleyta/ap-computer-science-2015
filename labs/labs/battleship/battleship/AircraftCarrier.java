package battleship;

import java.util.*;

public class AircraftCarrier extends Boat{
	
	String name;
	
	public AircraftCarrier(int xpos, int ypos, int dir)
	{
		super(xpos,ypos,5,dir);
		name = "aircraft carrier";
	}
}
