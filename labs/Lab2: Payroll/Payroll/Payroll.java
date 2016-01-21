package Payroll;
import java.util.*;
public class Payroll {
	public static double stockPrice;
	public List<Employee> payroll = new ArrayList<Employee>();
	public List <Employee> liars = new ArrayList<Employee>();
	public static int emps;
	
	public void addEmployee() { //The input code (scanner) should be refactored out into the driver program.
			            //so the function becomes: addEmployee(name, paygrade, salary, stock, numShares)
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
			System.out.print("Paygrade level (1-7): ");
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
			if(payGradeLvl == 7) {
			System.out.println("This user appears to be a CEO!");
			for(int i = 0; i< payroll.size(); i++) {
				if(payroll.get(i).getPayGrd() == 7) {
					System.out.print("Previous CEO found. This incident will be reported."); //LOL
					liars.add(new Employee(newname));
					break;
			}
				
			}
			payroll.add(new CEO(newname,bs,stockOptions,newShares));
		}
			payroll.add(new Employee(newname,payGradeLvl,bs,stockOptions,newShares));
			emps++;
			
		}
	public void subEmployee() { //Refactor the scanner out into the driver and pass in the String searchName
		String searchName;
		System.out.println("Employee Name: ");
		Scanner sc = new Scanner(System.in);
		searchName= sc.next();
		for(int i =0; i<payroll.size(); i++) {
			if(payroll.get(i).getName().equals(searchName)) {
				payroll.remove(i);
				break;
			}
		}
		emps--;
		System.out.println(searchName + " was removed from the database");
	}
	public void dispEmployee() { //Refactor the scanner out into the driver and pass in the String searchName 
		
		String searchName;
		System.out.println("Employee Name: ");
		Scanner sc = new Scanner(System.in);
		searchName= sc.nextLine();
		for(int i = 0; i <payroll.size(); i++) {
			if (payroll.get(i).getName().equals(searchName)) { 
			payroll.get(i).calcWorth();
			System.out.println("Name: " +  payroll.get(i).getName());
			System.out.println("Salary Per Month: "+ payroll.get(i).getSalary());
			System.out.println("Stock options: " + payroll.get(i).getShares());
			System.out.println("Money this employee makes per unit time: " + payroll.get(i).getWorth());
			System.out.println();
		}	
	}
}
public double getBudget() {
	double empBudget = 0.0;
	for(int i = 0; i<payroll.size();i++) {
		payroll.get(i).calcWorth();
		empBudget += payroll.get(i).getWorth();
	}
	return empBudget;	
}

	public Payroll () { //default constructor
	}

	
}
