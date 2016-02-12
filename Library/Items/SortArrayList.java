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
		//MR M: u = 0;
		if(myList.size() > 1)
		{
		for(Myparable i: myList)
		{
			u++;                //MR. M: 'u' needs to be reset to 0 at the start of add(...)
			if(i.compareTo(a) == 1)
			{
				myList.add(u,a);
				break;
			}
			//MR. M: Missing a corner case: What if 'a' is greater than everything in the list?
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
