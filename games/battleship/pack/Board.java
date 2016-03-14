package pack;
import java.util.ArrayList;
import java.util.Scanner;

public class Board
{
	private int numSub, numCar, numBat, numDes, numCru;
	private int ships = 5;
	ArrayList < ArrayList <GridSpace> > dis = new ArrayList < ArrayList <GridSpace> > ();
	ArrayList < ArrayList <GridSpace> > dis2 = new ArrayList < ArrayList <GridSpace> > ();
	Scanner scan = new Scanner(System.in);
	int r, t;
	String s;

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

	public void place_ships(String name)
	{
		/*System.out.println("Would you like to place the" + name + "horizontally or vertically (Input r for horizontal or c for column)");
		s = scan.nextLine();

		if(s.equals("r"))
		{
			System.out.println("Input a row");
			r = scan.nextInt();
			System.out.println("Input an intial column");
			t = scan.nextInt();

			for(int i = r; i < r + 1; r++)
			{
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
			System.out.println("Input an intial row");
			t = scan.nextInt();

			for(int i = r; i < r + 1; r++)
			{
				for(int j = t; j < a.get_print() + t; j++)
				{
					dis.get(i).set(j, new GridSpace(a));
				}
			}
		}

		display();*/
	}

	public void add_ships()
	{
		addSubmarine();
		addCarrier();
		addBattleship();
		addCruiser();
		addDestroyer();		
	}

	public int get_num_ships()
	{
		return ships;
	}

	public void addSubmarine()
	{
		Ship a = new Submarine();
		numSub = a.get_print();
		String n = a.get_name();
		//place_ships(n);

		for(int i = 0;  i < 1; i++)
		{
			for(int j = 0; j < a.get_print(); j++)
			{
				dis.get(i).set(j, new GridSpace(a));
			}
		}
	}

	public void checkSubmarine()
	{
		numSub--;
		if(numSub == 0)
		{
			System.out.println("");
			System.out.println("You sunk the Submarine");
			System.out.println("");
			ships--;
		}
	}

	public void addCarrier()
	{
		Ship a = new Carrier();
		numCar = a.get_print();
		String n = a.get_name();
		//place_ships(n);

		for(int i = 1;  i < a.get_print() + 1; i++)
		{
			for(int j = 5; j < 6; j++)
			{
				dis.get(i).set(j, new GridSpace(a));
			}
		}
	}

	public void checkCarrier()
	{
		numCar--;
		if(numCar == 0)
		{
			System.out.println("");
			System.out.println("You sunk the Carrier");
			System.out.println("");
			ships--;
		}
	}

	public void addBattleship()
	{
		Ship a = new Battleship();
		numBat = a.get_print();
		String n = a.get_name();
		//place_ships(n);

		for(int i = 6;  i < 7; i++)
		{
			for(int j = 0; j < a.get_print(); j++)
			{
				dis.get(i).set(j, new GridSpace(a));
			}
		}
	}

	public void checkBattleship()
	{
		numBat--;
		if(numBat == 0)
		{
			System.out.println("");
			System.out.println("You sunk the Battleship");
			System.out.println("");
			ships--;
		}
	}

	public void addDestroyer()
	{
		Ship a = new Destroyer();
		numDes = a.get_print();
		String n = a.get_name();
		//place_ships(n);

		for(int i = 9;  i < 10; i++)
		{
			for(int j = 3; j < a.get_print() + 3; j++)
			{
				dis.get(i).set(j, new GridSpace(a));
			}
		}
	}

	public void checkDestroyer()
	{
		numDes--;
		if(numDes == 0)
		{
			System.out.println("");
			System.out.println("You sunk the Destroyer");
			System.out.println("");
			ships--;
		}
	}

	public void addCruiser()
	{
		Ship a = new Cruiser();
		numCru = a.get_print();
		String n = a.get_name();
		//place_ships(n);

		for(int i = 7;  i < a.get_print() + 7; i++)
		{
			for(int j = 6; j < 7; j++)
			{
				dis.get(i).set(j, new GridSpace(a));
			}
		}
	}

	public void checkCruiser()
	{
		numCru--;
		if(numCru == 0)
		{
			System.out.println("");
			System.out.println("You sunk the Cruiser");
			System.out.println("");
			ships--;
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
		int g = 0;
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
		g = buff.getFlag();

		if(buff.getFlag() == 0)
		{
			System.out.println("Miss");
			buff.setSpace();
			dis.get(x).set(y, buff);
			f = 0;
		}else
		if(buff.getFlag() == 6)
		{
			System.out.println("You cannot select these coordinates, please try again");
			f = -1;
		}else
		if(buff.getFlag() > 0 && buff.getFlag() < 6)
		{
			System.out.println("Hit!");

			switch (g)
			{
				case 1: 
					checkSubmarine();
					break;
				case 2:
					checkCarrier();
					break;
				case 3:
					checkBattleship();
					break;
				case 4:
					checkDestroyer();
					break;
				case 5:
					checkCruiser();
					break;
				default:
					break;
			}

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