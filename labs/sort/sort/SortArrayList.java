package sort;

import java.util.*;

public class SortArrayList
{
	List<Compables> sortedList = new ArrayList<Compables>();
	public void add(Compables c)
	{
		int i = 0;
		
		for(Compables k : sortedList)
		{
			if(k.compareTo(c)==1)
			{
				sortedList.add(i,c);
				break;
			}
			i++;
		}
		
		if(sortedList.size()==0)
			sortedList.add(c);
		
	}
	
	public void output()
	{
		System.out.println(sortedList.size());
		for(Compables c : sortedList)
		{
			System.out.println(c.getValue());
		}
	}
	
}
