import pacman.*;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.util.*;

public class Pacman
{
	public static void main(String[] args)
	{
		int good = 1;
		String input;
		BufferedReader reader;
		Player pman = new Player();
		Display world = new Display();
		world.addMoveableEntity(pman);
		world.draw();
		
		while(good==1)
		{
			Scanner scan = new Scanner(System.in);
			input = scan.next();
				switch(input)
				{
					case "w": pman.up();
							world.draw();
							break;
					case "a": pman.left();
							world.draw();
							break;
					case "s": pman.down();
							world.draw();
							break;
					case "d": pman.right();
							world.draw();
							break;
					case "q": good=0;
							break;
					default: System.out.println("Not a valid command");
							break;
				}
				System.out.println(pman.getYpos() + "," + pman.getXpos());
				
		}
	
		
	}
}
