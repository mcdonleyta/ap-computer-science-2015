package Items;
import java.util.*;

public class SortArrayList
{
	int u = 0;
	ArrayList <Myparable> myList;
	public SortArrayList()
	{
		myList = new ArrayList <Myparable>();
    }
	public void add(Myparable a)
	{
		if(myList.size() > 1)
		{
		for(Myparable i: myList)
		{
			u++;
			if(i.compareTo(a) == 1)
			{
				myList.add(u,a);
				break;
			}
		}
	}
	else
	{
		myList.add(a);
	}
	}
	public Myparable get(int i)
	{
		return myList.get(i);
	}
	public int size()
	{
		return myList.size();
	}
}
