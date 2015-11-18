package Payroll;
import java.util.*;

public class Company
{
	private float stockValue;
	private float companyAssets;
	private int totalDistShares;
	private List<Employee> employees = new ArrayList<Employee>();
	private List<Person> stockholders = new ArrayList<Person>();
	
	public Company(CEO Gates,float ca)
	{
		addEmployee(Gates);
		stockValue=0;
		companyAssets=ca;
	}
	public void changeTotalDistShares(int s)
	{
		totalDistShares+=s;
		stockValue = companyAssets/totalDistShares;
	}
	public void addEmployee(Employee Claire)
	{
		employees.add(Claire);
	}
	public void removeEmployee(Employee Jim)
	{
		for(int i = 0; i<employees.size(); i++)
		{
			if(Jim==employees.get(i))
			{
				employees.remove(i);
			}
		}
	}
	public void addStockholder(Person Jaques)
	{
		stockholders.add(Jaques);
	}
	public void removeStockholder(Person Julie)
	{
		for(int i = 0; i<stockholders.size(); i++)
		{
			if(Julie==stockholders.get(i))
			{
				stockholders.remove(i);
			}
		}
	}
	
	public int getTotalDistShares()
	{
		return totalDistShares;
	}
	public void setStockValue(float sv)
	{
		if(sv>0)
		{
			stockValue = sv;
		}
	}
	public float getCompanyAssets()
	{
		System.out.print("Current company assets: $");
		return companyAssets;
	}
	public void changeCompanyAssets(float ca)
	{
		companyAssets+=ca;
	}
	
	public float getSalary(Employee Sue)
	{
		return Sue.getBS();
	}
	public float getSalary(CEO Cook)
	{
		return Cook.getBS();
	}
	public float getEffective(Employee Sue)
	{
		float stockPayout = 0;
		if(Sue.getIfStockOpt() == true)
		{
			stockPayout = stockValue * Sue.getShares();
		}
		return (Sue.getBS() + (Sue.getPG() * 5000) + stockPayout);
	}
	
	public void payStockholders()
	{
		for(Person s : stockholders)
		{
			companyAssets -= stockValue * s.getShares();
			s.changePersonalAssets(stockValue * s.getShares());
			System.out.println(s.getName() + " has been paid.");
		}
		if(companyAssets <= 0)
		{
			System.out.println("You're broke! Better find a way to pay it back. We're in 'Murica; no handouts here.");
		}
	}
	public void payAllEmployees()
	{
		for(Employee e : employees)
		{
			companyAssets -= getEffective(e);
			e.changePersonalAssets(getEffective(e));
			System.out.println(e.getName() + " has been paid.");
		}
		if(companyAssets <= 0)
		{
			System.out.println("You're broke! Better find a way to pay it back. We're in 'Murica; no handouts here.");
		}
	}
	
}
