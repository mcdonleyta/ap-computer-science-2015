import java.util.Scanner;
import java.lang.Integer; 
import java.util.ArrayList;
import java.lang.Object;

import PacMan.*;

public class PacMan
{
public static void main (String[] args)
{
	System.out.println("This is a text-based PacMan Game. Use 8,6,2,4 on your numpad to move, and 0 to end your game."); 
	int cont;
	int count;
	textFileMap board = new textFileMap();
	for (;;)
	{
	board.draw();
	cont = board.move();
	count = board.getCounter();
	if (cont == 0) {
		System.out.println("Number of Pacs maned = ");
		System.out.print (count);
		break;
	}
	}
 

}


      
}
