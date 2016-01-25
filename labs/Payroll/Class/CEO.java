package Class;

public class CEO extends Employee
{
	private String boss_name;

	public void set_boss(String name)
	{
		boss_name = name;
	}
	public String get_boss()
	{
		return boss_name;
	}

	public CEO()
	{
		super(7, "Boss");
	}
	public CEO(int entry, String name)
	{
		super(entry, name);
	}
}