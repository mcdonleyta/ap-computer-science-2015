package Sort;
import java.util.ArrayList;
import java.util.List;

public class SortList
{
	List <Parable> myList = new ArrayList <Parable>();

	public void createList()
	{
		List <Parable> createdList = myList;
	}

	public void add(Parable p)
	{
		myList.add(p);
	}

	public void get(int index)
	{
		myList.get(index);

	}

	public int get_episode_count(int index)
	{
		Anime name = (Anime) myList.get(index);
		int n = name.get_episode_count();
		return n;
	}

	public void pare()
	{
		for(int j = 0; j < myList.size(); j++)
		{
			Anime t2 = (Anime) myList.get(j);
			for(int k = 1; k < myList.size() - 1; k++)
			{
				Anime t1 = (Anime) myList.get(k);
				if(t2.get_episode_count() > t1.get_episode_count())
				{
					myList.add(k, myList.get(j));
					myList.remove(j);
				}
			}
		}
	}

	public String get_name(int index)
	{
		Anime name = (Anime) myList.get(index);
		String n = name.get_name();
		return n;
	}

	public SortList()
	{
		createList();
	}

	public int size()
	{
		return myList.size();
	}
}