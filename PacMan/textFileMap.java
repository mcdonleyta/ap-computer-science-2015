package PacMan;

import java.util.*;
import java.util.Scanner;
import java.lang.Integer; 
import java.util.ArrayList;  
import java.io.*;

public class textFileMap extends moveEntity
{
 private List <List <entity>> myBoard = new ArrayList<List<entity>>(); //gameboard itself
 public moveEntity pacman = new moveEntity();
 
	public void startEntities()
	{
	File board = new File ("board.txt");
	try{
	Scanner read = new Scanner(board);
	while(read.hasNextLine())
	{

		List <entity> myBoardRow = new ArrayList<entity>();
		String line = read.nextLine();
		for (int i = 1; i <= line.length(); i++)
		{
			char c = line.charAt(i-1);		
				if ( c == '0')
					myBoardRow.add(new entity('0'));
				else if (c == 'c')
					myBoardRow.add(pacman);
				else
					myBoardRow.add(new entity());
//	System.out.print(c);
			
		}
		myBoard.add(myBoardRow);
		//System.out.println();
	
	}
	read.close();
	}
	catch (Exception e){
		e.printStackTrace();
	}

	}
		
	
	public void draw() //literally just draws the gameboard
	{
		for (int i = 0; i <= myBoard.get(i).size() -1; i++)
		{
			for (int j = 0; j <= myBoard.get(j).size()-1 ; j++)
			{
				System.out.print(myBoard.get(i).get(j).getDisplayEntity());
			}
			System.out.println();
		}
	}

	public void move ()
	{
		Scanner input = new Scanner(System.in);
		int userinput = input.nextInt();
		int indexX = 0;
		int indexY = 0;
		for(int i = 1; i<= myBoard.size(); i++){
			indexY =  myBoard.get(i).indexOf(pacman);
			indexX = i;
				if (indexY != -1)
					break;
		}
		if (userinput == 8) {
			char collision = myBoard.get(indexX-1).get(indexY).getDisplayEntity();
		if ( collision != '0') 
				{
					myBoard.get(indexX-1).set(indexY,pacman);
					myBoard.get(indexX).set(indexY,new entity());
				}
			else
				System.out.print("Error");
		}
		else if (userinput == 6) {
			char collide = myBoard.get(indexX).get(indexY +1).getDisplayEntity();
				if (collide != '0') {
					myBoard.get(indexX).set(indexY+1 ,pacman);
					myBoard.get(indexX).set(indexY, new entity());
				}
			}
		else if (userinput == 2) {
				char collide = myBoard.get(indexX +1).get(indexY).getDisplayEntity();
				if(collide != '0') {
					myBoard.get(indexX +1).set(indexY,pacman);
					myBoard.get(indexX).set(indexY, new entity());
				}
			}
		else if (userinput == 4) {
			char collide = myBoard.get(indexX).get(indexY-1).getDisplayEntity();
			if (collide != '0') {
				myBoard.get(indexX).set(indexY - 1,pacman);
				myBoard.get(indexX).set(indexY, new entity());
			}
		}
			
				
	}


	public textFileMap()
	{
		startEntities();
	}
	
}
