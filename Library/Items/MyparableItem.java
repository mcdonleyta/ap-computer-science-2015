package Items;

public abstract class MyparableItem implements Myparable
{
	public int compareTo(Myparable a)
	{
		if(getValue() > a.getvalue())
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
