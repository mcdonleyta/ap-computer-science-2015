import PacMan_Game.*;
import java.util.Scanner;

public class PacMan{
     public static void main(String []args)
     {
		Display myDisplay = new Display();
<<<<<<< HEAD
		for(;;)
		{
		myDisplay.DisplayPrint();
		Scanner input = new Scanner(System.in);
		String i = input.nextLine();
		myDisplay.Move(i);
		}

=======
		myDisplay.DisplayPrint();
>>>>>>> 1cb32f618aaf2da5dd4c14642e17849f9121bb50
     }
}
