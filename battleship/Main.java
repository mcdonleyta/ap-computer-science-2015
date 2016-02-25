import pack.*;
import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Board player1 = new Board();
		Board player2 = new Board();
		player1.add_ships();
		player2.add_ships();
		
		int row, col, var;
		boolean win = false;
		boolean play1 = false;
		boolean play2 = false;
		boolean check = false;
		String input;

		while(win == false)
		{
			while(play1 == false)
			{
				System.out.println("");
				System.out.println("Number of player 2 ships: " + player2.get_num_ships());
				System.out.println("");
				if(player2.get_num_ships() == 0)
				{
					break;
				}

				System.out.println("Player 1's board: ");
				player1.display();
				System.out.println("");
				System.out.println("Player 1's view of Player 2's Board: ");
				player1.display2();

				System.out.println("Input a row and a column, with a space between the two numbers:");
				row = scan.nextInt();
				col = scan.nextInt();
				var = player2.attack(row, col);
				player1.update(row, col, var);

				if(var == 0)
				{
					play1 = true;
				}
			}

			if(player2.get_num_ships() == 0)
			{
				System.out.println("Player 1 won!");
				break;
			}

			play1 = false;

			while(play2 == false)
			{
				System.out.println("");
				System.out.println("Number of player 1 ships: " + player1.get_num_ships());
				System.out.println("");

				if(player1.get_num_ships() == 0)
				{
					break;
				}

				System.out.println("Player 2's board: ");
				player2.display();
				System.out.println("");
				System.out.println("Player 2's view of Player 1's Board: ");
				player2.display2();
				
				System.out.println("Input a row and a column, with a space between the two numbers:");
				row = scan.nextInt();
				col = scan.nextInt();
				var = player1.attack(row, col);
				player2.update(row, col, var);

				if(var == 0)
				{
					play2 = true;
				}
			}

			if(player1.get_num_ships() == 0)
			{
				System.out.println("Player 2 won!");
				break;
			}

			play2 = false;
		}
	}
}