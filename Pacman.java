import pacman.*;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class Pacman
{
	public static void main(String[] args)
	{
		int good = 1;
		String input;
		BufferedReader reader;
		MoveableEntity pman = new MoveableEntity();
		Display world = new Display();
		
		while(good)
		{
			reader = new BufferedReader(new InputStreamReader(System.in));
			if(input = reader.readLine())!=null)
			{
				switch(input)
				{
					case w: 
					case a:
					case s:
					case d:
				}
			
			}

			
		world.draw();	
		}
	
		
	}
}
