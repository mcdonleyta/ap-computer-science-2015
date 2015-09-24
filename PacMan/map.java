package PacMan;

import java.util.*;
import java.util.Scanner;
import java.lang.Integer; 
import java.util.ArrayList;

public class map
{
 
 private int screenVert = 31;
 private int screenHorizon = 28;
 private List <List <entity>> myBoard = new ArrayList<List<entity>>();
 public int row;
 public int c; 
 private List<moveEntity> buffer = new ArrayList<moveEntity>();
 public void populate()
{
	
	for (row = 0; row<screenVert; row++)
	{
		List <entity> myBoardRow = new ArrayList<entity>();
		
		for(c = 0; c < screenHorizon; c++) 
		{
			myBoardRow.add(new entity());
		}
		myBoard.add(myBoardRow);
	}
	
	for (row = 0; row<screenVert;row++)
	{
		List <entity> myBoardRow = new ArrayList<entity>();
		
		for(c = 0; c < screenHorizon; c++) 
		{
			myBoardRow.add(new moveEntity());
		}
		buffer.add(myBoardRow);
	}

}
public void draw()
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
for (int i = 0; i < row ; i++)
	{
		for(int j = 0; j < c ; j++) 
		{
		char temp;
		temp = buffer.get(i).get(j).getDisplayEntity();
		System.out.print(temp);
		}
		System.out.println();
	}
	
}
public void move()
{

}
public map()
{
	populate();
	
}

}

