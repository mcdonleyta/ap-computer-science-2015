package Battleship;
import java.util.*;
public class Board extends GridSpace
{
	
	public Board()
	{
		ArrayList<ArrayList<GridSpace>> myBoard = new ArrayList<ArrayList<GridSpace>>();
		for(int j = 0;j<10;j++)
		{
		ArrayList<GridSpace> myBuffer = new ArrayList<GridSpace>();
			for(int i = 0; i < 10; i++)
			{
				myBuffer.add(new GridSpace());
			}
		myBoard.add(myBuffer);
		}
	}
}
