package Sort;
import java.util.ArrayList;
import java.util.List;

public class SortList
{
	private int asize;

	public void set_size(int s)
	{
		size = s;
	}

	public void createList()
	{
		List <Parable> myList = new ArrayList <Parable>();
	}

	public void add(Parable p)
	{
		myList.add(p); //Mr. M: You should implement a sorted insertion here based on compareTo(...) from the Parable interface
                               // The code has been discussed in class and was one of the answers to a previous written assignment. 
	}

	public SortList()
	{
		createList();
	}

	public int size()
	{
		return asize;
	}
}
