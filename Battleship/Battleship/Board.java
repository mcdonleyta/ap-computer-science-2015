package Battleship;
import java.util.*;
public class Board extends GridSpace
{
	public ArrayList<ArrayList<GridSpace>> myBoard = new ArrayList<ArrayList<GridSpace>>();
	public Board()
	{
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
	public void printBoard()
	{
		for(int i = 0; i<10; i++)
		{
			for(int j = 0; j<10;j++)
			{
				if(myBoard.get(i).get(j).getOccupied() == true && myBoard.get(i).get(j).getHit() == true)
				{
					myBoard.get(i).get(j).printHit();
					System.out.print("sdasd");
				}
				else if(myBoard.get(i).get(j).getOccupied() == true)
				{
					myBoard.get(i).get(j).printboat();
				}
				else
				{
					myBoard.get(i).get(j).printspace();
				}
			}
			System.out.println("");
		}
	}
	public void addShip(int x, int y, int _x, int _y, int num)
	{
		boolean set = true;
		int check = 1;
		int add = 0;
		myBoard.get(y).get(x).setOccupied(set);
		while(check < num)
		{
			if(_x > x && y == _y)
			{
				myBoard.get(_y).get(_x + add).setOccupied(set);
				add++;
			}
			else if(x > _x && y == _y)
			{
				myBoard.get(_y).get(_x + add).setOccupied(set);
				add--;
			}
			else if(x == _x && y < _y)
			{
				myBoard.get(_y + add).get(_x).setOccupied(set);
				add++;
			}
			else if(x == _x && y > _y)
			{
				myBoard.get(_y + add).get(_x).setOccupied(set);
				add--;
			}
		check++;
		}
		System.out.println("Done");
	}
	public boolean checkSpot(int x, int y)
	{
		return myBoard.get(y).get(x).getOccupied();
	}
	public void setSpot(int x, int y)
	{
		boolean tru = true;
		myBoard.get(y).get(x).setOccupied(tru);
	}
	public void setHitBoard(int x, int y)
	{
		boolean tru = true;
		myBoard.get(y).get(x).setHit(tru);
	}
}
	
