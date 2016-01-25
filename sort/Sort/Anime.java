package Sort;

public class Anime extends Medium
{
	private String name;
	private int episode_count;

	public String get_name()
	{
		return name;
	}
	public int get_episode_count()
	{
		return episode_count;
	}

	private Anime()
	{

	}

	public Anime(String n, int c)
	{
		name = n;
		episode_count = c;
	}
}