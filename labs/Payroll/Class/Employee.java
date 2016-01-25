package Class;
import java.util.Scanner;

public class Employee extends People
{
	private int entry;
	private double salary;
	Scanner input = new Scanner(System.in);

	public void set_entry(int entry_level)
	{
		if(entry_level > 8)
		{
			System.out.println("Invalid entry level, please enter another one.");
			entry_level = input.nextInt();
		}

		entry = entry_level;
	}
	public int get_entry()
	{
		return entry;
	}

	public void set_salary(int entry_level)
	{
		double sal;
		int money = entry_level;
		switch (money)
		{
			case 1:
				sal = 150.50;
				salary = sal;
				break;
			case 2:
				sal = 301.00;
				salary = sal;
				break;
			case 3:
				sal = 451.50;
				salary = sal;
				break;
			case 4:
				sal = 602.00;
				salary = sal;
				break;
			case 5:
				sal = 752.50;
				salary = sal;
				break;
			case 6:
				sal = 903.00;
				salary = sal;
				break;
			case 7:
				sal = 1000.00;
				salary = sal;
				break;
			default:
				sal = 0;
				salary = sal;
				break;
		}
	}

	public double get_salary()
	{
		return salary;
	}

	public Employee()
	{
		set_entry(1);
		set_salary(1);
	}

	public Employee(int entry_level, String name)
	{
		super(name);
		set_entry(entry_level);
		set_salary(entry_level);
	}
}