package pack;

public class GridSpace
{
	private char space;
	private int flag;

	public GridSpace()
	{
		space = '*';
		flag = 0;
	}

	public GridSpace(Ship s)
	{
		String n = s.get_name();
		switch (n)
		{
			case "Submarine":
				flag = 1;
				Submarine sub = new Submarine();
				space = sub.get_icon();
				break;
			case "Carrier":
				flag = 2;
				Carrier car = new Carrier();
				space = car.get_icon();
				break;
			case "Battleship":
				flag = 1;
				Battleship bat = new Battleship();
				space = bat.get_icon();
				break;
			case "Destroyer":
				flag = 4;
				Destroyer des = new Destroyer();
				space = des.get_icon();
				break;
			case "Cruiser":
				flag = 5;
				Cruiser cru = new Cruiser();
				space = cru.get_icon();
				break;
			default:
				space = '*';
				flag = 0;
				break;
		}
	}

	public char getSpace()
	{
		return space;
	}

	public void setSpace()
	{
		if(getFlag() == 0)
		{
			space = 'O';
		}else
		if(getFlag() > 0)
		{
			space = 'X';
		}
	}

	public void boardSpace(int x)
	{
		if(x == 0)
		{
			space = '0';
		}else
		if(x == 1)
		{
			space = 'X';
		}
	}

	public int getFlag()
	{
		return flag;
	}
}