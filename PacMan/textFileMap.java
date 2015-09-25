package PacMan;

import java.util.*;
import java.util.Scanner;
import java.lang.Integer; 
import java.util.ArrayList;  
import java.io.*;

public class textFileMap
{
 private int screenVert = 31; //can be changed for diffrent game board dimensions but also requires changing x y move cords
 private int screenHorizon = 28;
 private List <List <entity>> myBoard = new ArrayList<List<entity>>(); //gameboard itself
 public int row;
 public int c; //I cant spell coulom (??) EDIT: column but too lazy to change now
 public int x = 15;
 public int y = 14; 
 public ArrayList <Character> charList =  new Arraylist <Character> ();
 
	public void startEntities()
	{
	
	try{
	BufferedReader reader = new BufferedReader(new FileReader(new File(getClass().getResource("board.txt").getPath())));
	String line;
	while((line = reader.readLine()) != null)
	{
		for(char c : line.toCharArray())
		{
			charList.add(c);
		}
	}
	}
	catch(Exception e){
		e.printStackTrace();
	}
		
	}
	public void putInGameBoard()
	{
		for ( int i = 0; i >= charList.size(); i++) {
				{
					char temp = charList.get(i);
					if (temp == '.'
				}
		
	}
	public textFileMap()
	{
		startEntities();
	}
	
}
