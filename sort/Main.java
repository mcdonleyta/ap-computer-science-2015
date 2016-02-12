import java.util.ArrayList;
import java.util.List;
import Sort.*;

public class Main
{
	public static void main(String args[])
	{
		SortList menu = new SortList();
		menu.add(new Anime("OreShura", 13, 7.0));
		menu.add(new Anime("Nisekoi", 12, 8.0));

		System.out.println("Structure: (Name) (Episode Count)");
		System.out.println("Unsorted list: ");

		for(int i = 0; i < menu.size(); i++)
		{
			System.out.println(menu.get_name(i) + " " + menu.get_episode_count(i));
		}

		System.out.println(" ");

		menu.pare();

		System.out.println("Structure: (Name) (Episode Count)");
		System.out.println("Sorted list: ");

		for(int i = 0; i < menu.size(); i++)
		{
			System.out.println(menu.get_name(i) + " " + menu.get_episode_count(i));
		}
	}
}