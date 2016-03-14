import java.util.ArrayList;
import java.util.List;
import Sort.*;

public class Main
{
	public static void main(String args[])
	{
		int c = 1;
		double j = 1.0;
		String k = "Name";
		SortList menu = new SortList();
		menu.add(new Anime("OreShura", 12, 7.0));
		menu.add(new Anime("Sword Art Online", 25, 7.5));
		menu.add(new Anime("Nisekoi", 20, 8.0));
		menu.add(new Anime("Noragami", 13, 8.1));
		menu.add(new Anime("Eureka Seven", 52, 7.9));

		System.out.println("Structure: (Name) (Episode Count) (Rating)");
		System.out.println("Unsorted list: ");

		/*for(int i = 0; i < menu.size(); i++)
		{
			System.out.println(menu.get_name(i) + " " + menu.get_episode_count(i));
		}*/

		for(int i = 0; i < menu.size(); i++)
		{
			Anime a = (Anime) menu.get(i);                
			System.out.println(a.get_name() + " " + a.get_episode_count() + " " + a.get_rating());
		} 

		System.out.println(" ");

		menu.pare(c);

		System.out.println("Sorted by episode count");
		System.out.println("Structure: (Name) (Episode Count)");
		System.out.println("Sorted list: ");

		for(int i = 0; i < menu.size(); i++)
		{
			System.out.println(menu.get_name(i) + " " + menu.get_episode_count(i));
		}

		System.out.println(" ");

		menu.pare(j);

		System.out.println("Sorted by Rating");
		System.out.println("Structure: (Name) (Rating)");
		System.out.println("Sorted list: ");

		for(int i = 0; i < menu.size(); i++)
		{
			System.out.println(menu.get_name(i) + " " + menu.get_rating(i));
		}

		System.out.println(" ");

		menu.pare(k);

		System.out.println("Sorted by Name");
		System.out.println("Sorted list: ");

		for(int i = 0; i < menu.size(); i++)
		{
			System.out.println(menu.get_name(i));
		}
	}
}