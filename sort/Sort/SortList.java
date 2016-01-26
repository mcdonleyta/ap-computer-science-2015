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
		myList.add(p);
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