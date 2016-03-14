package pack;

public class Carrier extends Ship
{
	private int print;
	private int health;
	private char icon;
	private String name;

	public Carrier()
	{
		print = 5;
		health = 1;
		icon = 'A';
		name = "Carrier";
	}

	public char get_icon()
	{
		return icon;
	}

	public int get_print()
	{
		return print;
	}

	public int get_health()
	{
		return health;
	}

	public String get_name()
	{
		return name;
	}
}
