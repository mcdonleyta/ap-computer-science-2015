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
		
		int row, col;
		int var;
		boolean win = false;
		boolean play1 = false;
		boolean play2 = false;
		boolean check = false;
		String input;

		while(win == false)
		{
			while(play1 == false)
			{
				if(player2.get_num_ships() == 0)
				{
					play1 = true;
					win = true;
				}

				System.out.println("Player 1's board: ");
				player1.display();
				System.out.println("");
				System.out.println("Player 1's view of Player 2's Board: ");
				player1.display2();

				System.out.println("Input a row");
				row = scan.nextInt();
				System.out.println("Input a column");
				col = scan.nextInt();
				var = player2.attack(row, col);
				player1.update(row, col, var);

				if(var == 0)
				{
					play1 = true;
				}
			}

			play1 = false;

			while(play2 == false)
			{
				if(player1.get_num_ships() == 0)
				{
					play2 = true;
					win = true;
				}

				System.out.println("Player 2's board: ");
				player2.display();
				System.out.println("");
				System.out.println("Player 2's view of Player 1's Board: ");
				player2.display2();
				
				System.out.println("Input a row");
				row = scan.nextInt();
				System.out.println("Input a column");
				col = scan.nextInt();
				var = player1.attack(row, col);
				player2.update(row, col, var);

				if(var == 0)
				{
					play2 = true;
				}
			}

			play2 = false;
		}
	}
}