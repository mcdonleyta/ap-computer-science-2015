import Battleship.*;
import java.util.*;

public class main
{
	public static void main(String[] args)
	{
		boolean win = false;
		boolean playerturn = true;
		int x;
		int y;
		Scanner input = new Scanner(System.in);
		Carrier p1Carrier = new Carrier(0,0,1,0,2,0,3,0,4,0);
		Battleship p1Battleship = new Battleship(2,2,2,3,2,4,2,5);
		Cruiser p1Cruiser = new Cruiser(5,5,4,5,3,5);
		Submarine p1Submarine = new Submarine(9,9,9,8,9,7);
		Destroyer p1Destroyer = new Destroyer(6,7,5,7);
		
		Carrier p2Carrier = new Carrier(0,0,1,0,2,0,3,0,4,0);
		Battleship p2Battleship = new Battleship(2,2,2,3,2,4,2,5);
		Cruiser p2Cruiser = new Cruiser(5,5,4,5,3,5);
		Submarine p2Submarine = new Submarine(9,9,9,8,9,7);
		Destroyer p2Destroyer = new Destroyer(7,7,6,7);
		
		Board p1ShipBoard = new Board();
		Board p1PlayBoard = new Board();
		p1ShipBoard.addShip(0,0,1,0,5);
		p1ShipBoard.addShip(2,2,2,3,4);
		p1ShipBoard.addShip(5,5,5,4,3);
		p1ShipBoard.addShip(9,9,9,8,3);
		p1ShipBoard.addShip(6,7,5,7,2);
		p1PlayBoard.printBoard();
		p1ShipBoard.printBoard();
		
		Board p2ShipBoard = new Board();
		Board p2PlayBoard = new Board();
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
				System.out.println("Name the X Cord of your attack");
				x = input.nextInt();
				System.out.println("Name the Y Cord of your attack");
				y = input.nextInt();
				if(p2ShipBoard.checkSpot(x -1, y -1) == true)
				{
					System.out.println("You Hit");
					p1PlayBoard.setHitBoard(x-1,y-1);
					p1PlayBoard.printBoard();
				}
			}
		}
	}
}
