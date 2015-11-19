package Payroll;
import java.util.*;
public class Employee extends Person {
	private int payGrade; //1-7 could implement checks
	private double baseSalary;
	private boolean hasStockOptions;
	private double employeeWorthPerMonth; //how much the employee makes per month
	private static final double EMPLOYEE_SHARE_VALUE = 1.5;
	private String Name = this.getName(); //in case someone has a diffrent professional name/title ex. dr.richards as opposed to reed richards
	
	public Employee () {
		payGrade=0;
		baseSalary = 0.0;
		hasStockOptions = false;
	}
	public Employee (String empName, int empPayGrade, double empBaseSalary, boolean empHasStockOptions, int empShares) {
		Name = empName;
		payGrade = empPayGrade;
		baseSalary = empBaseSalary;
		hasStockOptions = empHasStockOptions;
		this.setShares(empShares);
		
	}
	public Employee(String empname) { //used if user wants to be CEO but there already is a CEO
		
		Name = empname;
	}

	public void calcWorth() {
		employeeWorthPerMonth = (baseSalary)+(payGrade*100)+(this.getShares())*(EMPLOYEE_SHARE_VALUE); //calculates the worth of an employee
	}
	public double getWorth() {
		return employeeWorthPerMonth //returns worth
	}
	public double getSalary() { //get and set fuctonality below
		return baseSalary;
	}
	public String getName() {
		return Name;
	}
	public int getPayGrd() {
		return payGrade;
		
	}
	public void setName (String newName){
	
		Name = newName;
	}
	public void setPayGrade(int newPG) {
		payGrade = newPG;
	}
	public void setSalary(double newSal) {
		baseSalary = newSal;
	}
	public void setStock(boolean setSto) {
		hasStockOptions = setSto;
	}
}
