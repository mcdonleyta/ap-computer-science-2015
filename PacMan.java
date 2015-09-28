import PacMan_Game.*;
import java.util.Scanner;

public class PacMan{
     public static void main(String []args)
     {
		Display myDisplay = new Display();
		for(;;)
		{
		myDisplay.DisplayPrint();
		Scanner input = new Scanner(System.in);
		String i = input.nextLine();
		myDisplay.Move(i);
		}

     }
}
