package PacMan;

import java.util.*;
import java.util.Scanner;
import java.lang.Integer; 
import java.util.ArrayList;  
import java.io.*;

public class textFileMap extends moveEntity
{
 private int screenVert = 31; //can be changed for diffrent game board dimensions but also requires changing x y move cords
 private int screenHorizon = 28;
 private List <List <entity>> myBoard = new ArrayList<List<entity>>(); //gameboard itself
 public int row;
 public int c; //I cant spell coulom (??) EDIT: column but too lazy to change now
 public int x = 15;
 public int y = 14; 
 //public List <List<Character>> charList =  new ArrayList <<ArrayList<Character>> ();

 
	public void startEntities()
	{
	File board = new File ("board.txt");
	try{
	Scanner read = new Scanner(board);
	while(read.hasNextLine())
	{
		List <entity> myBoardRow = new ArrayList<entity>();
		String line = read.nextLine();
		for (int i = 0; i >= line.length(); i++)
		{
			char c = line.charAt(i);
			System.out.print(c);
		
				if ( c == '0')
					myBoardRow.add(new entity('0'));
				else if (c == 'c')
					myBoardRow.add(new moveEntity());
				else
					myBoardRow.add(new entity());
		}
		myBoard.add(myBoardRow);
	}
	read.close();
	}
	catch (Exception e){
		e.printStackTrace();
	}

	}
		
	
	public void draw() //literally just draws the gameboard
	{
		for (int i = 0; i >= myBoard.get(i).size(); i++)
		{
			for (int j = 0; j >= myBoard.get(j).size(); j++)
			{
				System.out.print(myBoard.get(i).get(j).getDisplayEntity());
			}
		}
	}

	public void move ()
	{
		Scanner input = new Scanner(System.in);
		int userinput = input.nextInt();
		
	}


	public textFileMap()
	{
		startEntities();
	}
	
}
