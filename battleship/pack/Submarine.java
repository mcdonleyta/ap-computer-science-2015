package pack;

public class Submarine extends Ship
{
	private int print;
	private int health;
	private char icon;
	private String name;

	public Submarine()
	{
		print = 3;
		health = 1;
		icon = 'S';
		name = "Submarine";
	}

	public int get_health()
	{
		return health;
	}

	public int get_print()
	{
		return print;
	}

	public char get_icon()
	{
		return icon;
	}

	public String get_name()
	{
		return name;
	}
}
