package Battleship;
import java.util.*;

public class GridSpace
{
	boolean Occupied = false;
	boolean hit = false;
	public GridSpace()
	{
		
	}
	public GridSpace(boolean Here)
	{
			Occupied = Here;
	}
	public void printspace()
	{
		System.out.print("_");
	}
	public void printboat()
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
		return hit;
	}
	public void setOccupied(boolean set)
	{
		Occupied = set;
	}
	public void setHit(boolean set)
	{
		hit = set;
	}
}
