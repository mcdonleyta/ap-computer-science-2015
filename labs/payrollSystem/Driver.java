import Payroll.*;

import java.util.*;
import java.util.Scanner;

public class Driver
{
	public static void main(String[] args)
	{
		CEO billGates = new CEO(20000,"Bill Gates");     //salary = $20k, name = Bill Gates
		Company microsoft = new Company(billGates,200000); //Bill Gates starts Microsoft, which has a starting value of $200k
		billGates.setShares(75,microsoft);					//Bill Gates gains 75 shares in Microsoft
		
		Employee jimWeiss = new Employee(true,0,1000,"Jim Weiss");
		jimWeiss.setShares(20,microsoft);						//new Microsoft employee Jim Weiss has stock options, 20 shares, $1000 salary, 0 paygrade
		microsoft.addEmployee(jimWeiss);
		Employee saraSullivan = new Employee(false,3,3500,"Sara Sullivan");  //doesn't have stock options, doesn't have any shares
		microsoft.addEmployee(saraSullivan);
		Employee ragathDesai = new Employee(true,6,6000,"Ragath Desai");
		ragathDesai.setShares(30,microsoft);
		microsoft.addEmployee(ragathDesai);
		Employee yanLao = new Employee(true,6,5500,"Yan Lao");
		yanLao.setShares(45,microsoft);
		microsoft.addEmployee(yanLao);
		
		Person katherineDvorak = new Person("Katherine Dvorak", 5);  //new stockholder named Katherine Dvorak with 8 shares
		katherineDvorak.setShares(8,microsoft);
		microsoft.addStockholder(katherineDvorak);
		Person arthurMcKellen = new Person ("Arthur KcKellen", 3);   //new stockholder with 10 shares
		arthurMcKellen.setShares(10,microsoft);
		microsoft.addStockholder(arthurMcKellen);
		
		microsoft.payAllEmployees();		//pay all the employees (incl. CEO)
		microsoft.payStockholders();		//pay all stockholders
		
		System.out.println(microsoft.getCompanyAssets());	
		System.out.println("Bill Gates currently has $" + billGates.getPersonalAssets());
	}
}
