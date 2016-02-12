package battleship;

import java.util.*;
import java.util.Scanner;

public class Player{
	
	private Board usersBoard;
	private String username;
	
	public Player(String un)
	{
		username = un;
		Board usersBoard = new Board();
		System.out.println("Now time to place your ships, " + username + "!");
		placeBoats();
	}
	
	public void placeBoats()
	{
		usersBoard.addAndPlaceBoats();
	}
	
	public void inputMove(Player x)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("What's the horizontal unit of the torpedo's trajectory vector, Captain " + username + "? ");
		String s_xpos = scan.nextLine();
		System.out.print("And the vertical unit, Captain " + username + "? ");
		String s_ypos = scan.nextLine();
		
		int xpos = Integer.parseInt(s_xpos);
		int ypos = Integer.parseInt(s_ypos);
		
		x.checkHitAt(xpos,ypos);
	}
	
	public void checkHitAt(int x, int y)       //to only be used by other player checking if they got a hit on their move
	{
		usersBoard.isBoatAt(x,y);
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void checkShips()
	{
		usersBoard.checkShipsAfloat();
	}
	
	public int getShips()
	{
		usersBoard.getShipsAfloat();
	}
	
	public void outputBoard()
	{
		usersBoard.draw();
	}
	
}
