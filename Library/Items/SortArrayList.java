package Items;
import java.util.*;

public class SortArrayList
{
	int u = 0;
	SortArrayList()
	{
		ArrayList <Myparable> myList = new ArrayList <Myparable>();
    }
	public void add(Myparable a)
	{
		for(Myparable i: myList)
		{
			if(i.compareTo(a) == 1)
			{
				myList.add(u,a);
				break;
			}
			u++;
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
