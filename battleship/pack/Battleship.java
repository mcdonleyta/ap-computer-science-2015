package pack;

public class Battleship extends Ship
{
	private int health;
	private int print;
	private char icon;
	private String name;

	public Battleship()
	{
		print = 4;
		health = 1;
		icon = 'B';
		name = "Battleship";
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