package Payroll;
import java.util.*;

public class Person
{
	protected String name;
	protected int yearsOfExperience;
	protected int shares;
	protected float personalAssets;
	
	public Person()
	{
		name = "N/A";
		yearsOfExperience=0;
	}
	public Person(String n, int y)
	{
		name = n;
		yearsOfExperience=y;
	}
	
	public float getPersonalAssets()
	{
		return personalAssets;
	}
	
	public void changePersonalAssets(float p)
	{
		personalAssets+=p;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
	
	public void setShares(int s, Company company)
	{
		company.changeTotalDistShares(shares - s);
		shares = s;
	}
	public int getShares()
	{
		return shares;
	}
	
	public int getYears()
	{
		return yearsOfExperience;
	}
	public void setYears(int y)
	{
		yearsOfExperience=y;
	}

}
