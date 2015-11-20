package Class;

public class CEO extends Employee
{
	private String boss_name;

	public void set_boss(String name)
	{
		boss_name = name;
	}
	public void get_boss()
	{
		return boss_name;
	}

	public CEO()
	{
		set_boss("Boss");
		super(7, get_boss);
	}
	public CEO(int entry, int name)
	{
		super(entry, name);
	}
}