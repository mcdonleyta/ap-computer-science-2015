import Payroll.*;
import java.util.*;
public class Driver{
	public static void main(String[] args) {
		Payroll currentPayroll = new Payroll();
		boolean cont = true;
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		while (cont) {
		System.out.println("Payroll: ");
		System.out.println("1) Add Emplyee");
		System.out.println("2) View Employee");
		System.out.println("3) Subtact Employee");
		System.out.println("4) Display employee budget");
		System.out.println("5) Other search/sort functonality");
		System.out.println("6) Terminate Program");
		System.out.print("Please select an action by its number: ");
		choice = sc.nextInt(); 
		if (choice == 1) { //add safety
		currentPayroll.addEmployee();
		System.out.println();
		}
		else if (choice ==3) {
			currentPayroll.subEmployee();
			System.out.println();
		}
		else if (choice == 2) {
			currentPayroll.dispEmployee(); 
			System.out.println();
		}
		else if (choice == 4) {
			System.out.println(" Total employee cost is " + currentPayroll.getBudget());
		}
		else if (choice == 5) {
			//TODO implement other search and sort functionality
		}
		else if (choice == 6) {
			break;
		}
		else 
			System.out.println("Please enter a valid input command from 1-4");	
	}
	
	}
}
