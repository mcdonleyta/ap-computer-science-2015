package pack;

public abstract class Ship extends GridSpace
{
	private int health = 0;
	public abstract int get_health();
	public abstract int get_print();
	public abstract char get_icon();
	public abstract String get_name();
}
