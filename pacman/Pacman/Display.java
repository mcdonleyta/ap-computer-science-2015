package Pacman;
import java.util.ArrayList;
import java.util.List;

public class Display
{
	private int screen_height = 31;
	private int screen_width = 28;
	private List<List<Entity> > map = new ArrayList <List <Entity> > ();

	//Entity entity = new Entity();

	public int get_height()
	{
		return screen_height;
	}

	public int get_width()
	{
		return screen_width;
	}

	public void transfer_entities()
	{
		List<Entity> add_row = new ArrayList<Entity> ();

		for(int length = get_width(); length >= 0; length--)
		{
			for(int height = get_height(); height >= 0; height--) 
			{
				add_row.add(new Entity());
			}

			map.add(add_row);
		}
	}

	public void draw()
	{
		transfer_entities();

		//map.get(0).set(0,'X');

		for(int length = get_width(); length >= 0; length--)
		{
			for (int height = get_height(); height >= 0; height--) 
			{
				System.out.print(map.get(length).get(height));
			}

			System.out.println();
		}
	}

	public Display()
	{
		
	}
}