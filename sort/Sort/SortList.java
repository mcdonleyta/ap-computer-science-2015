package Sort;
import java.util.ArrayList;
import java.util.List;

public class SortList
{
	List <Parable> myList = new ArrayList <Parable> ();

	public void createList()
	{
		List <Parable> createdList = myList;
	}

	public void add(Parable p)
	{
		myList.add(p);
	}

	public Anime get(int index)
	{
		return (Anime) myList.get(index);
	}

	public int get_episode_count(int index)
	{
		Anime name = (Anime) myList.get(index);
		int n = name.get_episode_count();
		return n;
	}

	public double get_rating(int index)
	{
		Anime name = (Anime) myList.get(index);
		double n = name.get_rating();
		return n; 
	}

	public void pare(int episode)
	{
		boolean check = false;
		Anime one, two;
		Anime temp;

		for(int i = 0; i < size() - 1; i++)
		{
			one = (Anime) myList.get(i);
			two = (Anime) myList.get(i + 1);

			if(one.get_episode_count() > two.get_episode_count())
			{
				temp = (Anime) one;
				myList.set(i, two);
				myList.set(i + 1, temp);

				check = true;
				if(check == true)
				{
					check = false;
					i = 0;
				}
			}
		}
	}

	public void pare(double rating)
	{
		boolean check = false;
		Anime one, two;
		Anime temp;

		for(int i = 0; i < size() - 1; i++)
		{
			one = (Anime) myList.get(i);
			two = (Anime) myList.get(i + 1);

			if(one.get_rating() > two.get_rating())
			{
				temp = (Anime) one;
				myList.set(i, two);
				myList.set(i + 1, temp);

				check = true;
				if(check == true)
				{
					check = false;
					i = 0;
				}
			}
		}
	}

	public void pare(String name)
	{
		boolean check;
		Anime one, two;
		Anime temp;

		for(int i = 0; i < size() - 1; i++)
		{
			one = (Anime) myList.get(i);
			two = (Anime) myList.get(i + 1);

			if(one.get_name().compareTo(two.get_name()) > 0)
			{
				temp = (Anime) one;
				myList.set(i, two);
				myList.set(i + 1, temp);

				check = true;
				if(check == true)
				{
					check = false;
					i = 0;
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