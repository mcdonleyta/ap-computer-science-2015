package PacMan_Game;

import PacMan_Game.*;
import java.util.*;

public class Display{
	private int screenHeight = 31;
	private int screenWidth = 28;
	private List<List<Entity> > map = new ArrayList<List<Entity>>();
	private List< List<Entity> > buffer = new ArrayList< List<Entity>>();
	
	public Display()
	{
		for(int i = 0; i<screenHeight; i++)
		{
			List<Entity> map_row = new ArrayList<Entity>();
			for(int j = 0; j<screenWidth; j++)
			{
				map_row.add(new Entity());
			}
			map.add(map_row);
		}
		for(int i = 0; i<screenHeight; i++)
		{
			List<Entity> buffer_row = new ArrayList<Entity>();
			buffer.add(buffer_row);
		}
	}
	public void DisplayPrint()
	{
		char printer;
		for(int row = 0; row <screenHeight; row++)
		{
			for(int col = 0; col < screenWidth; col++)
			{
				printer=map.get(row).get(col).getDisplayEntity();
				List<List<Entity> > buffer = map;
				System.out.print(buffer.get(row).get(col).getDisplayEntity());
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
