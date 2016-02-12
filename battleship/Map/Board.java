package Map;
import Ship.*;
import java.util.ArrayList;

public class Board
{
	ArrayList < ArrayList <GridSpace> > dis = new ArrayList < ArrayList <GridSpace> > ();
	ArrayList <GridSpace> row = new ArrayList <GridSpace>();

	public void create_board()
	{
		for(int u = 0; u < 10; u++)
		{
			for(int i = 0; i < 10; i++)
			{
				row.add(new GridSpace());
			}

			dis.add(row);
		}
	}

	public void addSubmarine()
	{
		Gridspace sub = new Submarine();
		for(int i = 1; i < 2; i++)
		{
			for(int j = 0; j < sub.get_health(); j++)
			{
				dis.get(i).set(j, sub);
			}
		}
	}

	public Board()
	{
		create_board();
	}

	public void display()
	{
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				System.out.print(dis.get(i).get(i).getSpace());
			}
			System.out.println(" ");
		}
	}

}