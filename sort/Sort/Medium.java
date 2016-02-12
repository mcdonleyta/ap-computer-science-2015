package Sort;

public abstract class Medium implements Parable
{
	private static int uniqueID;
	private int myID;

	public Medium()
	{
		myID = ++uniqueID;
	}

	public double getValue()
	{
		return myID;
	}

	public int pare(Parable p, int a)
	{
		if (getValue() == p.getValue())
			return 0;
		else if (getValue() < p.getValue())
			return -1;
		else
			return 1;
	}

	/*public int pare(Parable p, String a)
	{
		if (getValue() == p.getValue())
			return 0;
		else if (getValue() < p.getValue())
			return -1;
		else
			return 1;
	}

	public int pare(Parable p, double a)
	{
		if (getValue() == p.getValue())
			return 0;
		else if (getValue() < p.getValue())
			return -1;
		else
			return 1;
	}*/
}