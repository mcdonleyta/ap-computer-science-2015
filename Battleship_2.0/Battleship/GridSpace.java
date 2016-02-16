package Battleship;
import java.util.*;

public class GridSpace
{
	boolean Occupied = false;
	boolean Hit = false;
	public GridSpace()
	{
		
	}
	public GridSpace(boolean Here)
	{
			Occupied = Here;
	}
	public void printSpace()
	{
		System.out.print("_");
	}
	public void printBoat()
	{
		System.out.print("X");
	}
	public void printHit()
	{
		System.out.print("O");
	}
	public boolean getOccupied()
	{
		return Occupied;
	}
	public boolean getHit()
	{
		return Hit;
	}
	public void setOccupied(boolean set)
	{
		Occupied = set;
	}
	public void setHit(boolean set)
	{
		Hit = set;
	}
}
