package Payroll;
import java.util.*;

public class Employee extends Person
{
	private boolean stockOptions;
	protected int payGrade;
	protected float baseSalary;

	public Employee()
	{
		stockOptions=false;
		payGrade=0;
		baseSalary=0;
	}
	public Employee(boolean s, int pg, int bs, String n)
	{
		stockOptions = s;
		if(pg<7 && pg>0)
		{
			payGrade = pg;
		}else payGrade = 0;
		if(bs>0)
		{
			baseSalary = bs;
		}
		name = n;
	}
	
	public void giveRaise()
	{
		if(payGrade<6)
		{
			payGrade++;
		}
	}
	
	public float getBS()
	{
		return baseSalary;
	}
	public int getPG()
	{
		return payGrade;
	}
	public boolean getIfStockOpt()
	{
		return stockOptions;
	}

}
