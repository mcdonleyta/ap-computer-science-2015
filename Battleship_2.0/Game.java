import Battleship.*;
import java.util.*;

public class Game
{
		boolean win = false;
		boolean playerturn = true;
		int x = -1;
		int y = -1;
		boolean p1CarrierSunk = false;
		boolean p1BattleshipSunk = false;
		boolean p1CruiserSunk = false;
		boolean p1SubmarineSunk = false;
		boolean p1DestroyerSunk = false;
		boolean p2CarrierSunk = false;
		boolean p2BattleshipSunk = false;
		boolean p2CruiserSunk = false;
		boolean p2SubmarineSunk = false;
		boolean p2DestroyerSunk = false;
		Scanner input = new Scanner(System.in);
	public Game()
	{
		Carrier p1Carrier = new Carrier(0,0,1,0,2,0,3,0,4,0);
		Battleship p1Battleship = new Battleship(2,2,2,3,2,4,2,5);
		Cruiser p1Cruiser = new Cruiser(5,5,5,4,5,3);
		Submarine p1Submarine = new Submarine(9,9,9,8,9,7);
		Destroyer p1Destroyer = new Destroyer(6,7,5,7);
		
		Carrier p2Carrier = new Carrier(0,0,1,0,2,0,3,0,4,0);
		Battleship p2Battleship = new Battleship(2,2,2,3,2,4,2,5);
		Cruiser p2Cruiser = new Cruiser(5,5,5,4,5,3);
		Submarine p2Submarine = new Submarine(9,9,9,8,9,7);
		Destroyer p2Destroyer = new Destroyer(6,7,5,7);
		
		Board p1ShipBoard = new Board();
		PlayBoard p1PlayBoard = new PlayBoard();
		p1ShipBoard.addShip(0,0,1,0,5);
		p1ShipBoard.addShip(2,2,2,3,4);
		p1ShipBoard.addShip(5,5,5,4,3);
		p1ShipBoard.addShip(9,9,9,8,3);
		p1ShipBoard.addShip(6,7,5,7,2);
		p1PlayBoard.printBoard();
		p1ShipBoard.printBoard();
		
		Board p2ShipBoard = new Board();
		PlayBoard p2PlayBoard = new PlayBoard();
		p2ShipBoard.addShip(0,0,1,0,5);
		p2ShipBoard.addShip(2,2,2,3,4);
		p2ShipBoard.addShip(5,5,5,4,3);
		p2ShipBoard.addShip(9,9,9,8,3);
		p2ShipBoard.addShip(6,7,5,7,2);
		p2PlayBoard.printBoard();
		p2ShipBoard.printBoard();
		
		while(win == false)
		{
			if(playerturn == true)
			{
				System.out.println("Player 1 Turn");
				x = -1;
				y = -1;
				p1PlayBoard.printBoard();
				p1ShipBoard.printBoard();
				while(x < 0 || x > 10)
				{
				System.out.println("Name the X Cord of your attack between 1-10");
				x = input.nextInt();
				}
				while(y < 0 || y > 10)
				{
				System.out.println("Name the Y Cord of your attack between 1-10");
				y = input.nextInt();
				}
				System.out.println("____________________________");
				System.out.println("|       What Happened      |");

				if(p2ShipBoard.checkSpot(x -1, y -1) == true)
				{
					System.out.println("|          You Hit         |");
					
					p1PlayBoard.setHitBoard(x-1,y-1);
					p2ShipBoard.setHitBoard(x-1,y-1);
					
					p2Carrier.setSpace(x-1,y-1);
					if(p1Carrier.checkCond() == true && p2CarrierSunk == false)
					{
						p2CarrierSunk = true;
						System.out.println("|  You sank their Carrier  |");
					}
					p2Battleship.setSpace(x-1,y-1);
					if(p2Battleship.checkCond() == true && p2BattleshipSunk == false)
					{
						p2BattleshipSunk = true;
						System.out.println("| You sank their Battleship|");
					}
					p2Cruiser.setSpace(x-1,y-1);
					if(p2Cruiser.checkCond() == true && p2CruiserSunk == false)
					{
						p2CruiserSunk = true;
						System.out.println("|  You sank their Cruiser  |");
					}
					p2Submarine.setSpace(x-1,y-1);
					if(p2Submarine.checkCond() == true && p2SubmarineSunk == false)
					{
						p2SubmarineSunk = true;
						System.out.println("| You sank their Submarine |");
					}
					p2Destroyer.setSpace(x-1,y-1);
					if(p2Destroyer.checkCond() == true && p2DestroyerSunk == false)
					{
						p2DestroyerSunk = true;
						System.out.println("| You sank their Destroyer |");
					}
					
					if(p2Carrier.checkCond() == true && p2Battleship.checkCond() == true && p2Cruiser.checkCond() == true && p2Submarine.checkCond() == true && p2Destroyer.checkCond() == true)
					{
						win = true;
						System.out.println("|      Player 1 Turn       |");
					}
				}
				else
				{
					System.out.println("|        You Missed        |");
					p1PlayBoard.setChosenBoard(x-1,y-1);
				}
				playerturn = false;
				System.out.println("____________________________");
				System.out.println("Press Any Key To Continue To Next Player Turn");
				new java.util.Scanner(System.in).nextLine();
			}
			else if(playerturn == false)
			{
				System.out.println("|      Player 2 Turn       |");
				x = -1;
				y = -1;
				p2PlayBoard.printBoard();
				p2ShipBoard.printBoard();
				while(x < 0 || x > 10)
				{
				System.out.println("Name the X Cord of your attack between 1-10");
				x = input.nextInt();
				}
				while(y < 0 || y > 10)
				{
				System.out.println("Name the Y Cord of your attack between 1-10");
				y = input.nextInt();
				}
				System.out.println("____________________________");
				System.out.println("|       What Happened      |");
				if(p1ShipBoard.checkSpot(x -1, y -1) == true)
				{
					System.out.println("|         You Hit          |");
					
					p2PlayBoard.setHitBoard(x-1,y-1);
					p1ShipBoard.setHitBoard(x-1,y-1);
					
					p1Carrier.setSpace(x-1,y-1);
					if(p1Carrier.checkCond() == true && p1CarrierSunk == false)
					{
						p1CarrierSunk = true;
						System.out.println("|  You sank their Carrier  |");
					}
					p1Battleship.setSpace(x-1,y-1);
					if(p1Battleship.checkCond() == true && p1BattleshipSunk == false)
					{
						p1BattleshipSunk = true;
						System.out.println("|You sank their Battleship |");
					}
					p1Cruiser.setSpace(x-1,y-1);
					if(p1Cruiser.checkCond() == true && p1CruiserSunk == false)
					{
						p1CruiserSunk = true;
						System.out.println("|  You sank their Cruiser  |");
					}
					p1Submarine.setSpace(x-1,y-1);
					if(p1Submarine.checkCond() == true && p1SubmarineSunk == false)
					{
						p1SubmarineSunk = true;
						System.out.println("| You sank their Submarine |");
					}
					p1Destroyer.setSpace(x-1,y-1);
					if(p1Destroyer.checkCond() == true && p1DestroyerSunk == false)
					{
						p1DestroyerSunk = true;
						System.out.println("| You sank their Destroyer |");
					}
					
					if(p1Carrier.checkCond() == true && p1Battleship.checkCond() == true && p1Cruiser.checkCond() == true && p1Submarine.checkCond() == true && p1Destroyer.checkCond() == true)
					{
						win = true;
						System.out.println("Player 2 Wins");
					}
				}
				else
				{
					System.out.println("|       You Missed         |");
					p2PlayBoard.setChosenBoard(x-1,y-1);
				}
				playerturn = true;
				System.out.println("____________________________");
				System.out.println("Press Any Key To Continue To Next Player Turn");
				new java.util.Scanner(System.in).nextLine();
			}
		}
	}
}
