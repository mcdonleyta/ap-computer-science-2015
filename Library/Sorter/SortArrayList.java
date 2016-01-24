package Sort;
import Items.*;

public class SortArrayList
{
	ArrayList <Myparable> myList = new ArrayList <Myparable>();
	int u = 0;
	public void add(Myparable a)
	{
		for(Myparable i: myList)
		{
			if(i.compareTo(a) == 1)
			{
				myList.add(u,a);
			}
			u++;
		}
	}
}
