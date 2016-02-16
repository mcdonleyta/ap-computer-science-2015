package Battleship;
import java.util.*;

public class Player
{
	ArrayList<Boat> Boats = new ArrayList<Boat>();
	public Player()
	{
		
	}
	public void setup()
	{
		System.out.println("Welcome to Battleship");
	}
	public void addShip(Boat b)
	{
		Boats.add(b);
	}
}
