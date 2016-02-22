package pack;

public class Cruiser extends Ship
{
	private int health;
	private int print;
	private char icon;
	private String name;

	public Cruiser()
	{
		print = 3;
		health = 1;
		icon = 'C';
		name = "Cruiser";
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
