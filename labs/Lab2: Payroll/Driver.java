import Payroll.*;
import java.util.*;
public class Driver{
	
	
	//todo addPerson, lookUpEmployee,etc
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
		System.out.println("4) Terminate Program");
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
			currentPayroll.dispEmployee(); //currently bugged, cannot find any employees in the list (maybe error w/ add employee?)
			System.out.println();
		}
		
		System.out.println(currentPayroll.emps);
	}
	
	}
}
