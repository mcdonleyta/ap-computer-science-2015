package Ship;

public class Submarine extends Ship
{
	private int health;
	private char icon;

	private Submarine()
	{
		health = 3;
		icon = 'S';
	}

	public int get_health()
	{
		return health;
	}

	public char get_icon()
	{
		return icon;
	}
}