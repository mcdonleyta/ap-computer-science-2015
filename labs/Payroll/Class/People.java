package Class;
import java.util.ArrayList;
import java.util.List;

public class People
{
	private String Pname;
	
	public void set_name(String name)
	{
		Pname = name;
	}

	public String get_name()
	{
		return Pname;
	}

	public People()
	{
		set_name("Peon");
		get_name();
	}

	public People(String name)
	{
		set_name(name);
		get_name();
	}
}