import Battleship.*;
import java.util.*;

public class main
{
	public static void main(String[] args)
	{
		Board test = new Board();
		Player player1 = new Player();
		Scanner input = new Scanner(System.in);
		player1.setup();
		System.out.println("What is the starting x cord of your Battleship?");
		int x = input.nextInt();
		System.out.println("What is the starting y cord of your Battleship?");
		int y = input.nextInt();
		System.out.println("What is the x cord of the direction the Battleship is going?");
		int _x = input.nextInt();
		System.out.println("What is the y cord of the direction the Battleship is going?");
		int _y = input.nextInt();
		player1.addShip(new Battleship(x - 1,y - 1,_x - 1,_y - 1));
		test.addShip(x -1,y - 1,_x - 1,_y - 1, 4);
		test.printBoard();
		//Divide for next ship
		System.out.println("What is the starting x cord of your Destroyer?");
		x = input.nextInt();
		System.out.println("What is the starting y cord of your Destroyer?");
		y = input.nextInt();
		System.out.println("What is the x cord of the direction the Destroyer is going?");
		_x = input.nextInt();
		System.out.println("What is the y cord of the direction the Destroyer is going?");
		_y = input.nextInt();
		player1.addShip(new Destroyer(x - 1,y - 1,_x - 1,_y - 1));
		test.addShip(x - 1,y - 1,_x - 1,_y - 1, 2);
		test.printBoard();
	}
}
