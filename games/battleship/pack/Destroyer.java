package pack;

public class Destroyer extends Ship
{
	private int health;
	private int print;
	private char icon;
	private String name;
	
	public Destroyer()
	{
		print = 2;
		health = 1;
		icon = 'D';
		name = "Destroyer";
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