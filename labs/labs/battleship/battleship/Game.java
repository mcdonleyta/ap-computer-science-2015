package battleship;

import java.util.*;

public class Game{
	
	private Player one;
	private Player two;
	
	private Display display;
	
	public Game()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("User 1 username: ");
		one = new Player(scan.nextLine());
		System.out.print("User 2 username: ");
		two = new Player(scan.nextLine());
	}
	
	public boolean playRound()
	{
		display.output(one);
		System.out.println(one.getUsername() + "\'s turn.");
		one.inputMove(two);
		
		display.output(two);
		System.out.println(two.getUsername() + "\'s turn.");
		two.inputMove(one);	
		
		return checkIfDone();	
		
	}
	
	public boolean checkIfDone()
	{
		one.checkShips();
		two.checkShips();
		if(one.getShips()==0)
		{
			System.out.println("Congrats, " + two.getUsername() + "! You sunk all of " + one.getUsername() + "\'s ships!");
			return false;
		}else
		if(two.getShips()==0)
		{
			System.out.println("Congrats, " + one.getUsername() + "! You sunk all of " + two.getUsername() + "\'s ships!");
			return false;
		}else
			return true;
	}
	
	
}
