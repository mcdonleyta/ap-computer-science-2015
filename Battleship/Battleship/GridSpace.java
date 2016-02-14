package Battleship;
import java.util.*;

public class GridSpace
{
	boolean Occupied = false;
	public GridSpace()
	{
		
	}
	public GridSpace(boolean Here)
	{
			Occupied = Here;
	}
	public void printspace()
	{
		System.out.print("O");
	}
	public void printboat()
	{
		System.out.print("X");
	}
	public boolean getOccupied()
	{
		return Occupied;
	}
	public void setOccupied(boolean set)
	{
		Occupied = set;
	}
}
