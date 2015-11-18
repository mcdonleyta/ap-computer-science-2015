package Payroll;
import java.util.*;
public class Employee extends Person {
	private int payGrade; //1-7
	private double baseSalary;
	private boolean hasStockOptions;
	private double employeeWorthPerMonth; //how much the employee makes per month
	private static final double EMPLOYEE_SHARE_VALUE = 1.5;
	
	public Employee () {
		payGrade=0;
		baseSalary = 0.0;
		hasStockOptions = false;
	}
	public Employee (String empName, int empPayGrade, double empBaseSalary, boolean empHasStockOptions, int empShares) {
		this.setName(empName);
		payGrade = empPayGrade;
		baseSalary = empBaseSalary;
		hasStockOptions = empHasStockOptions;
		this.setShares(empShares);
		
	}
	public void calcWorth() {
		employeeWorthPerMonth = (baseSalary)+(payGrade*100)+(this.getShares())*(EMPLOYEE_SHARE_VALUE);
	}
	public double retWorth() {
		return employeeWorthPerMonth;
	}
	public double getSalary() {
		return baseSalary;
	}
	
}
