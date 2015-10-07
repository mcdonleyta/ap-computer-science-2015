package Pacman;

import java.util.ArrayList; 
import java.util.List;

public class Display 
{
	private int screen_height = 31;
	private int screen_lenght = 28;
	private List<List<Entity>> map = new ArrayList<List<Entity>>();
	
	public int get_lenght()
	{
		return screen_lenght;
	}

	public int get_height()
	{
		return screen_height;
	}
	
	public void draw()
	{	
		List<Entity> add_row = new ArrayList<Entity>();
		for(int lenght = get_lenght(); lenght >= 0; lenght--)
		{
			for(int height = get_height(); height >= 0; height--)
			{
				if()
				{
					
				}
			}
			
		}
	}
	
	public Display() 
	{
		
	}
}
