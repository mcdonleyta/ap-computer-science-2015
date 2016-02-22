package pack;
import java.util.ArrayList;
import java.util.Scanner;

public class Board
{
	ArrayList < ArrayList <GridSpace> > dis = new ArrayList < ArrayList <GridSpace> > ();
	ArrayList < ArrayList <GridSpace> > dis2 = new ArrayList < ArrayList <GridSpace> > ();
	Scanner scan = new Scanner();
	int r, t;
	String s;
	//ArrayList <GridSpace> row = new ArrayList <GridSpace>();

	public Board()
	{
		create_board();
		board2();
	}

	public void create_board() 
	{
		for(int u = 0; u < 10; u++)
		{
			ArrayList <GridSpace> row = new ArrayList <GridSpace>();
			for(int i = 0; i < 10; i++)
			{
				row.add(new GridSpace());
			}

			dis.add(row);
		}
	}

	public void board2()
	{
		for(int u = 0; u < 10; u++)
		{
			ArrayList <GridSpace> row = new ArrayList <GridSpace>();
			for(int i = 0; i < 10; i++)
			{
				row.add(new GridSpace());
			}

			dis2.add(row);
		}
	}

	public void add_ships()
	{
		addSubmarine();
		//addCarrier();
		//addBattleship();
		//addCruiser();
		//addDestroyer();		
	}

	public void addSubmarine()
	{
		Ship a = new Submarine();
		/*System.out.println("Would you like to place it as a row or column? (Input as r or c");
		s = scan.nextLine();

		if(s.equals("r"))
		{
			System.out.println("Input a row");
			r = scan.nextInt();
			for(int i = r; i < r +1; r++)
			{
				System.out.println("Input an intial column");
				t = scan.nextInt();
				for(int j = t; j < a.get_print() + t; j++)
				{
					dis.get(i).set(j, new GridSpace(a));
				}
			}
		}else
		if(s.equals("c"))
		{
			System.out.println("Input a column");
			r = scan.nextInt();
			for(int i = r; i < r +1; r++)
			{
				System.out.println("Input an intial row");
				t = scan.nextInt();
				for(int j = t; j < a.get_print() + t; j++)
				{
					dis.get(i).set(j, new GridSpace(a));
				}
			}
		}*/

		//display();

		for(int i = 0;  i < 1; i++)
		{
			for(int j = 0; j < a.get_print(); j++)
			{
				dis.get(i).set(j, new GridSpace(a));
			}
		}
	}

	public void addCarrier()
	{
		Ship a = new Carrier();
		for(int i = 1;  i < a.get_print() + 1; i++)
		{
			for(int j = 5; j < 6; j++)
			{
				dis.get(i).set(j, new GridSpace(a));
			}
		}
	}

	public void addBattleship()
	{
		Ship a = new Battleship();
		for(int i = 6;  i < 7; i++)
		{
			for(int j = 0; j < a.get_print(); j++)
			{
				dis.get(i).set(j, new GridSpace(a));
			}
		}
	}

	public void addDestroyer()
	{
		Ship a = new Destroyer();
		for(int i = 9;  i < 10; i++)
		{
			for(int j = 3; j < a.get_print() + 3; j++)
			{
				dis.get(i).set(j, new GridSpace(a));
			}
		}
	}

	public void addCruiser()
	{
		Ship a = new Cruiser();
		for(int i = 7;  i < a.get_print() + 7; i++)
		{
			for(int j = 6; j < 7; j++)
			{
				dis.get(i).set(j, new GridSpace(a));
			}
		}
	}

	public void display()
	{
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				System.out.print(dis.get(i).get(j).getSpace());
			}
			System.out.println("");
		}
	}

	public int attack(int x, int y)
	{
		int f = 0;
		boolean check = false;

		while(check == false)
		{	
			if((x < 0 || x > 9) || (y < 0 || y > 9))
			{
				System.out.println("These coordinates are invalid, please try again.");
			}else
			{
				check = true;
			}
		}

		GridSpace buff = dis.get(x).get(y);

		if(buff.getFlag() == 0)
		{
			System.out.println("Miss");
			buff.setSpace();
			dis.get(x).set(y, buff);
			f = 0;
		}else
		if(buff.getFlag() > 0)
		{
			System.out.println("Hit");
			buff.setSpace();
			dis.get(x).set(y, buff);
			f = 1;
		}

		return f;
	}

	public void update(int row, int col, int f)
	{
		GridSpace buff = dis2.get(row).get(col);

		if(f == 0)
		{
			buff.boardSpace(f);
			dis2.get(row).set(col, buff);
		}else
		if(f == 1)
		{
			buff.boardSpace(f);
			dis2.get(row).set(col, buff);
		}
	}

	/*public String check(int x, int y)
	{

	}*/

	public void display2()
	{
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				System.out.print(dis2.get(i).get(j).getSpace());
			}
			System.out.println("");
		}
	}

}