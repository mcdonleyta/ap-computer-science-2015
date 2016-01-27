package Items;

public abstract class MyparableItem implements Myparable
{
	public int compareTo(Myparable a, int which)
	{
		if(getValue() > a.getValue())
		{
			return 1;
		}
		else if(getValue() == a.getValue())
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}
}
