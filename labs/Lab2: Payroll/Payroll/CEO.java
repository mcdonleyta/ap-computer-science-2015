package Payroll;
import java.util.*;
public class CEO extends Employee {

	public CEO(String empName, double empBaseSalary, boolean empHasStockOptions, int empShares) { //pretty barebones, can implement more CEO privlages 
		this.setName(empName);
		this.setPayGrade(7);
		this.setSalary(empBaseSalary);
		this.setStock(empHasStockOptions);
		this.setShares(empShares);
		
	}
	public CEO() {
		
		this.setPayGrade(7);
	}


}
