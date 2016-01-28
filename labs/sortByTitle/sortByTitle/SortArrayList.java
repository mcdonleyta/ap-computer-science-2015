package sort;

import java.util.*;

public class SortArrayList
{
	List<CompablesItem> sortedList = new ArrayList<CompablesItem>();
	public void add(CompablesItem c)
	{
		int i = 0;
		
		if(sortedList.size()==0)
		{
			sortedList.add(c);
		}else
		if(sortedList.get(sortedList.size()-1).compareTo(c)<0)
		{
			sortedList.add(c);
		}else
		{
			for(CompablesItem k : sortedList)
			{
				if(k.compareTo(c)>0)
				{
					sortedList.add(i,c);
					break;
				}
				i++;
			}
		}
		
	}
	
	public void output()
	{
		for(CompablesItem c : sortedList)
		{
			System.out.println(c.getName() + " " + c.getValue());
		}
	}
	
}
