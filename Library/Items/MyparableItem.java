package Items;

public abstract class MyparableItem implements Myparable
{
	public abstract double getValue();
	public int compareTo(Myparable a)
	{
		Myparable myA = (Myparable) a;
		if(myA.getValue() > a.getvalue())
		{
			return 1;
		}
		else if(myA.getValue() == a.getValue())
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}
}
