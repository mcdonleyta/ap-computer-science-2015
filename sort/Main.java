import java.util.ArrayList;
import java.util.List;
import Sort.*;

public class Main
{
	public static void main(String args[])
	{
		SortList menu = new SortList();

		menu.add(new Anime("Nisekoi", 20));
		menu.add(new Anime("OreShura", 13));

		for(int i = 0; i < menu.size(); i++)
		{
			Anime a = menu.get(i);
			System.out.println("Structure: (Name) (Episode Count)")
			System.out.println("Unsorted list: ");
			System.out.println(a.get_name() + " " + a.get_episode_count());
		} 

		/*for(int i = 0; i < menu.size(); i++)
		{
			Anime a = menu.get(i);
			System.out.println("Structure: (Name) (Episode Count)")
			System.out.println(a.get_name() + " " + a.get_episode_count());
		}*/
	}
}