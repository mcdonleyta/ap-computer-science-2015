import java.util.ArrayList;
import java.util.List;
import Sort.*;

//Mr. M: You haven't completed either of the two parts of the lab. Please complete the following to recover lost points:
// 1) menu.add(...) must implement a sorted insert using the Parable interface
// 2) you should come up with a solution such that the menu can now be sorted based on the title of the anime

public class Main
{
	public static void main(String args[])
	{
		SortList menu = new SortList();
		menu.add(new Anime("OreShura", 13, 7.0));
		menu.add(new Anime("Nisekoi", 12, 8.0));

<<<<<<< HEAD
		System.out.println("Structure: (Name) (Episode Count)");
		System.out.println("Unsorted list: ");

		for(int i = 0; i < menu.size(); i++)
		{
			System.out.println(menu.get_name(i) + " " + menu.get_episode_count(i));
		}
=======
		menu.add(new Anime("Nisekoi", 20));   //Mr. M: This isn't complete test data. Many problems will be hidden.
		menu.add(new Anime("OreShura", 13));

		for(int i = 0; i < menu.size(); i++)
		{
			Anime a = menu.get(i);
			System.out.println("Structure: (Name) (Episode Count)") //Mr. M: I think you intend for these two lines to be outside of the loop
			System.out.println("Unsorted list: ");                  //       Also, the sorting happens in the menu.add() method
			                                                        //             so we can only see in code they are added in unsorted order
			System.out.println(a.get_name() + " " + a.get_episode_count());
		} 
>>>>>>> 15b19a4820a7036c9b085f7096c28d5d98943201

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
