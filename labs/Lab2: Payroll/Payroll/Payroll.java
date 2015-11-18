package Payroll;
import java.util.*;
public class Payroll {
	public static double stockPrice;
	private List<Employee> payroll = new ArrayList<Employee>();
	public static int emps;
	
	public void addEmployee() {
			
			Scanner sc = new Scanner(System.in);
			String select;
			int newShares = 0;
			String newname ="";
			int payGradeLvl=0;
			double bs = 0.0;
			boolean stockOptions = false;
			System.out.println("Please input your information as follows:");
			System.out.print("Name: ");
			newname = sc.next();
			System.out.print("Paygrade level (0-7): ");
			payGradeLvl = sc.nextInt();
			System.out.println();
			System.out.print("Base Salary: ");
			bs = sc.nextDouble();
			System.out.print("Does this Employee have stock options? (y/n): ");
			select = sc.next();
			if (select.equals("y")) {
				stockOptions = true;
				System.out.println("How many shares?: ");
				newShares = sc.nextInt();
			}
			Employee addThis = new Employee(newname,payGradeLvl,bs,stockOptions,newShares);
			payroll.add(addThis);
			emps++;
		
		}
	public void subEmployee() {
		String searchName;
		System.out.println("Employee Name: ");
		Scanner sc = new Scanner(System.in);
		searchName= sc.next();
		int i = 0;
		for(Employee e: payroll) {
			if(e.getName().equals(searchName)) {
				payroll.remove(i);
				break;
			}
			i++;
		}
		emps--;
		System.out.println(searchName + " was removed from the database");
	}
	public void dispEmployee() { //bugged, cant find employee
		String searchName;
		System.out.println("Employee Name: ");
		Scanner sc = new Scanner(System.in);
		searchName= sc.next();
		for(Employee e:payroll) {
			if (e.getName().equals(searchName)) { 
			System.out.println("Name: " +  e.getName());
			System.out.println("Salary Per Month: "+ e.getSalary());
			System.out.println("Stock options: " + e.getShares());
		}
		else 
			System.out.println("Not Found!"); //always returning this dont know why
		
	}
}
	public Payroll () { //default constructor
	}

	
}
