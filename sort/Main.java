import java.util.ArrayList;
import java.util.List;
import Sort.*;

public class Main //implements Parable
{

	public void pare()
	{
		/*for(int j = 0; j < menu.size(); j++)
		{
			Anime b = menu.get(j);

			for(int k = 0; menu.size(); k++)
			{
				Anime c = menu.get(k);

				if(b.get_episode_count() < c.get_episode_count())
				{
					menu.remove(j);

					menu.add(j-1, b);
				}
			}
		}*/
		System.out.println("test");
	}

	public static void main(String args[])
	{
		ArrayList <Anime> menu = new ArrayList <Anime>();

		menu.add(new Anime("Nisekoi", 20));
		menu.add(new Anime("OreShura", 13));

		for(int i = 0; i < menu.size(); i++)
		{
			Anime a = menu.get(i);
			System.out.println(a.get_name() + " " + a.get_episode_count());
		} 

		pare();

		for(int i = 0; i < menu.size(); i++)
		{
			Anime a = menu.get(i);
			System.out.println(a.get_name() + " " + a.get_episode_count());
		}
	}
}