import Battleship.*;
import java.util.*;

public class main
{
	public static void main(String[] args)
	{
		Board ShipBoard1 = new Board();
		Board PlayBoard1 = new Board();
		Board ShipBoard2 = new Board();
		Board PlayBoard2 = new Board();
		Player player1 = new Player();
		Player player2 = new Player();
		boolean win = false;
		int playerturn = 0;
		Scanner input = new Scanner(System.in);
		player1.setup();
		//Divide for next ship
		System.out.println("What is the starting x cord of your Carrier?");
		int x = input.nextInt();
		System.out.println("What is the starting y cord of your Carrier?");
		int y = input.nextInt();
		System.out.println("What is the x cord of the direction the Carrier is going?");
		int _x = input.nextInt();
		System.out.println("What is the y cord of the direction the Carrier is going?");
		int _y = input.nextInt();
		Carrier p1Carrier = new Carrier(x - 1,y - 1,_x - 1,_y - 1);
		player1.addShip(p1Carrier);
		ShipBoard1.addShip(x - 1,y - 1,_x - 1,_y - 1, 5);
		ShipBoard1.printBoard();
		//Divide for next Ship
		System.out.println("What is the starting x cord of your Battleship?");
		x = input.nextInt();
		System.out.println("What is the starting y cord of your Battleship?");
		y = input.nextInt();
		System.out.println("What is the x cord of the direction the Battleship is going?");
		_x = input.nextInt();
		System.out.println("What is the y cord of the direction the Battleship is going?");
		_y = input.nextInt();
		Battleship p1Battleship = new Battleship(x - 1,y - 1,_x - 1,_y - 1);
		player1.addShip(p1Battleship);
		ShipBoard1.addShip(x - 1,y - 1,_x - 1,_y - 1, 4);
		ShipBoard1.printBoard();
		//Divide for next ship
		System.out.println("What is the starting x cord of your Cruiser?");
		x = input.nextInt();
		System.out.println("What is the starting y cord of your Cruiser?");
		y = input.nextInt();
		System.out.println("What is the x cord of the direction the Cruiser is going?");
		_x = input.nextInt();
		System.out.println("What is the y cord of the direction the Cruiser is going?");
		_y = input.nextInt();
		Cruiser p1Cruiser = new Cruiser(x - 1,y - 1,_x - 1,_y - 1);
		player1.addShip(p1Cruiser);
		ShipBoard1.addShip(x - 1,y - 1,_x - 1,_y - 1, 3);
		ShipBoard1.printBoard();
		//Divide for next ship
		System.out.println("What is the starting x cord of your Submarine?");
		x = input.nextInt();
		System.out.println("What is the starting y cord of your Submarine?");
		y = input.nextInt();
		System.out.println("What is the x cord of the direction the Submarine is going?");
		_x = input.nextInt();
		System.out.println("What is the y cord of the direction the Submarine is going?");
		_y = input.nextInt();
		Submarine p1Submarine = new Submarine(x - 1,y - 1,_x - 1,_y - 1);
		player1.addShip(p1Submarine);
		ShipBoard1.addShip(x - 1,y - 1,_x - 1,_y - 1, 3);
		ShipBoard1.printBoard();
		//Divide for next ship
		System.out.println("What is the starting x cord of your Destroyer?");
		x = input.nextInt();
		System.out.println("What is the starting y cord of your Destroyer?");
		y = input.nextInt();
		System.out.println("What is the x cord of the direction the Destroyer is going?");
		_x = input.nextInt();
		System.out.println("What is the y cord of the direction the Destroyer is going?");
		_y = input.nextInt();
		Destroyer p1Destroyer = new Destroyer(x - 1,y - 1,_x - 1,_y - 1);
		player1.addShip(p1Destroyer);
		ShipBoard1.addShip(x - 1,y - 1,_x - 1,_y - 1, 2);
		ShipBoard1.printBoard();
		
		//Divide for player
		
		System.out.println("Now for Second Player");
		System.out.println("What is the starting x cord of your Carrier?");
		x = input.nextInt();
		System.out.println("What is the starting y cord of your Carrier?");
		y = input.nextInt();
		System.out.println("What is the x cord of the direction the Carrier is going?");
		_x = input.nextInt();
		System.out.println("What is the y cord of the direction the Carrier is going?");
		_y = input.nextInt();
		Carrier p2Carrier = new Carrier(x - 1,y - 1,_x - 1,_y - 1);
		player2.addShip(p1Carrier);
		ShipBoard2.addShip(x - 1,y - 1,_x - 1,_y - 1, 5);
		ShipBoard2.printBoard();
		//Divide for next Ship
		System.out.println("What is the starting x cord of your Battleship?");
		x = input.nextInt();
		System.out.println("What is the starting y cord of your Battleship?");
		y = input.nextInt();
		System.out.println("What is the x cord of the direction the Battleship is going?");
		_x = input.nextInt();
		System.out.println("What is the y cord of the direction the Battleship is going?");
		_y = input.nextInt();
		Battleship p2Battleship = new Battleship(x - 1,y - 1,_x - 1,_y - 1);
		player2.addShip(p1Battleship);
		ShipBoard2.addShip(x -1,y - 1,_x - 1,_y - 1, 4);
		ShipBoard2.printBoard();
		//Divide for next ship
		System.out.println("What is the starting x cord of your Cruiser?");
		x = input.nextInt();
		System.out.println("What is the starting y cord of your Cruiser?");
		y = input.nextInt();
		System.out.println("What is the x cord of the direction the Cruiser is going?");
		_x = input.nextInt();
		System.out.println("What is the y cord of the direction the Cruiser is going?");
		_y = input.nextInt();
		Cruiser p2Cruiser = new Cruiser(x - 1,y - 1,_x - 1,_y - 1);
		player2.addShip(p1Cruiser);
		ShipBoard2.addShip(x - 1,y - 1,_x - 1,_y - 1, 3);
		ShipBoard2.printBoard();
		//Divide for next ship
		System.out.println("What is the starting x cord of your Submarine?");
		x = input.nextInt();
		System.out.println("What is the starting y cord of your Submarine?");
		y = input.nextInt();
		System.out.println("What is the x cord of the direction the Submarine is going?");
		_x = input.nextInt();
		System.out.println("What is the y cord of the direction the Submarine is going?");
		_y = input.nextInt();
		Submarine p2Submarine = new Submarine(x - 1,y - 1,_x - 1,_y - 1);
		player2.addShip(p1Submarine);
		ShipBoard2.addShip(x - 1,y - 1,_x - 1,_y - 1, 3);
		ShipBoard2.printBoard();
		//Divide for next ship
		System.out.println("What is the starting x cord of your Destroyer?");
		x = input.nextInt();
		System.out.println("What is the starting y cord of your Destroyer?");
		y = input.nextInt();
		System.out.println("What is the x cord of the direction the Destroyer is going?");
		_x = input.nextInt();
		System.out.println("What is the y cord of the direction the Destroyer is going?");
		_y = input.nextInt();
		Destroyer p2Destroyer = new Destroyer(x - 1,y - 1,_x - 1,_y - 1);
		player2.addShip(p1Destroyer);
		ShipBoard2.addShip(x - 1,y - 1,_x - 1,_y - 1, 2);
		ShipBoard2.printBoard();
		
		while(win == false)
		{
			System.out.println("Next Player Turn");
			System.out.println("List X Cord of you attack");
			x = input.nextInt();
			System.out.println("List Y Cord of you attack");
			y = input.nextInt();
			if(playerturn == 0)
			{
				boolean spotcheck;
				spotcheck = ShipBoard2.checkSpot(x-1,y-1);
				if(spotcheck == true)
				{
					System.out.println("Hit");
					PlayBoard1.setHitBoard(x-1,y-1);
					ShipBoard2.setHitBoard(x-1,y-1);
					PlayBoard1.printBoard();
					ShipBoard1.printBoard();
				}
				else
				{
					System.out.println("Miss");
					PlayBoard1.setSpot(x-1,y-1);
					PlayBoard1.printBoard();
					ShipBoard1.printBoard();
				}
				playerturn = 1;
			}
			else
			{
				boolean spotcheck = true;
				spotcheck = ShipBoard1.checkSpot(x-1,y-1);
				if(spotcheck == true)
				{
					System.out.println("Hit");
					PlayBoard2.setHitBoard(x-1,y-1);
					ShipBoard1.setHitBoard(x-1,y-1);
					PlayBoard2.printBoard();
					ShipBoard2.printBoard();
				}
				else
				{
					System.out.println("Miss");
					PlayBoard2.setSpot(x-1,y-1);
					PlayBoard2.printBoard();
					ShipBoard2.printBoard();
				}
				playerturn = 0;
			}
			
		}
	}
}
