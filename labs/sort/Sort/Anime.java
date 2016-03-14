package Sort;

public class Anime extends Medium
{
	private String name;
	private int episode_count;
	private double rating;

	public String get_name()
	{
		return name;
	}
	public int get_episode_count()
	{
		return episode_count;
	}

	public double get_rating()
	{
		return rating;
	}

	public double getValue()
	{
		return get_episode_count();
	}

	private Anime()
	{

	}

	public Anime(String n, int c, double r)
	{
		super();
		name = n;
		episode_count = c;
		rating = r;
	}
}