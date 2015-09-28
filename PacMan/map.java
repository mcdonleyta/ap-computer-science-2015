package PacMan; //NOW OBSOLETE NOT USED

import java.util.*;
import java.util.Scanner;
import java.lang.Integer; 
import java.util.ArrayList;  

public class map extends moveEntity //reason that this extends moveEntity is because I view the map as a construct made of entities, of which moveEntity extends.
{
 private int screenVert = 31; //can be changed for diffrent game board dimensions but also requires changing x y move cords
 private int screenHorizon = 28;
 private List <List <entity>> myBoard = new ArrayList<List<entity>>(); //gameboard itself
 public int row;
 public int c; //I cant spell coulom (??) EDIT: column but too lazy to change now
 public int x = 15;
 public int y = 14; //starting cords of pacman, will location to moveEntity change later but easier to debug here
 public void populate()
{
	for (row = 0; row<screenVert; row++)
	{
		List <entity> myBoardRow = new ArrayList<entity>(); //creates a row of the gameboard
		
		for(c = 0; c < screenHorizon; c++) 
		{
			if (row == y && c == x)
			{
				myBoardRow.add(new moveEntity());
			}
			else if(row == 0 && c<=screenHorizon +1)
				myBoardRow.add(new entity('0'));
			else if (row == screenHorizon +2 && c<= screenVert)
				myBoardRow.add(new entity('0'));
			else if (c == 0)
				myBoardRow.add(new entity('0'));
			else if (c >= screenHorizon -1 )
				myBoardRow.add(new entity('0'));

			else
				myBoardRow.add(new entity()); //if it aint movin it's a default entity. Can add diffrent entites later
		}
		myBoard.add(myBoardRow); //adds row to board
	}	
}
public void draw() //literally just draws the gameboard
{

for (int i = 0; i < row ; i++)
	{
		for(int j = 0; j < c ; j++) 
		{
		char temp;
		temp = myBoard.get(i).get(j).getDisplayEntity();
		System.out.print(temp);
		}
		System.out.println();
	}
	}
public void move()
{
int userMove;
Scanner myScanner = new Scanner(System.in);
userMove = myScanner.nextInt();
int temp;
int oldX = x; //x without changes from user, current position
int oldY = y; //y ""
if (userMove == 8) //y is c x is row
{
	int temp2 = myBoard.get(x).get(y - 1).getStaticEntity();
	temp =  y-1;
	y = temp;
		if (temp2 == 0)
		{
			y = oldY;
			x = oldX; 
		}
}
else if (userMove == 2) // controls for numpad because reasons will add more options later
{ //BUGGED FIXTHIS
	int temp2 = myBoard.get(x).get(y - 2).getStaticEntity();
	System.out.println(temp2);
	temp = y+1;
	y = temp;
			if ( temp2== 0)
		{
			y = oldY;
			x = oldX; 
		}
}
else if (userMove == 4)
{
	int temp2 = myBoard.get(x - 1).get(y).getStaticEntity();
	temp= x-1;
	x = temp;
		if (temp2 == 0)
		{
			y = oldY;
			x = oldX; 
		}
}
else if(userMove == 6) //BUGGED FIXTHIS
{
	int temp2 = myBoard.get(x+4).get(y).getStaticEntity();
	temp = x+1;
	x = temp;		
		if (temp2 == 0)
		{
			y = oldY;
			x = oldX; 
		}
}
else 
{
	System.out.print("Something went wrong"); //add safety in case user fails to input something readable 
}

}
public void clearBoard() //clears the gameboard so a new one can be constructed with the same location in memory 
{
	myBoard.clear();
}
public map()
{
	populate(); // calls populate first time map is created to avoid acting on something that does not exist
	
}

}

