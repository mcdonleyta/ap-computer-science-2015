import PayRoll.*;
import java.util.Scanner;

public class OverView{
	public static void main(String []args)
	{
		boolean check = false;
		boolean IsCEO = false;
		int FirstChoiceInt;
		int SecondChoiceInt;
		String NameInputString;
		String NameInputSecondString;
		int PayGradeInt;
		double SalaryDouble;
		int SharesInt;
		boolean ShareChoiceBoolean = false;
		String ShareChoiceString;
		PayRollMain myPayRoll = new PayRollMain();
		while(check == false)
		{
		PayRollMain myPayroll = new PayRollMain();
		System.out.println("Options for entry are:");
		System.out.println("1. Add Employee");
		System.out.println("2. Info on Employee");
		System.out.println("3. Exit Payroll Program");
		Scanner FirstChoice = new Scanner(System.in);
		FirstChoiceInt = FirstChoice.nextInt();
		if(FirstChoiceInt == 1)
		{
			System.out.println("Type in the Employee's Name");
			Scanner NameInput = new Scanner(System.in);
			NameInputString = NameInput.nextLine();
			System.out.println("Type in Paygrade");
			Scanner PayGradeInput = new Scanner(System.in);
			PayGradeInt = PayGradeInput.nextInt();
			if(PayGradeInt == 7)
			{
				if(IsCEO == true)
				{
					System.out.println("Already a CEO Registered, Readjusting to 6");
				}
			}
			System.out.println("Type in Salary");
			Scanner SalaryInput = new Scanner(System.in);
			SalaryDouble = SalaryInput.nextDouble();
			System.out.println("How many Shares does this employee own?");
			Scanner SharesInput = new Scanner(System.in);
			SharesInt = SharesInput.nextInt();
			System.out.println("Does this person own stocks? (Type yes if so)");
			Scanner ShareChoiceInput = new Scanner (System.in);
			ShareChoiceString = ShareChoiceInput.nextLine();
			if(ShareChoiceString == "yes")
			{
				ShareChoiceBoolean = true;
			}
			Employee newEmployee = new Employee(PayGradeInt, SalaryDouble, SharesInt, NameInputString, ShareChoiceBoolean);
			myPayRoll.addEmployee(newEmployee);
		}
		else if(FirstChoiceInt == 2)
		{
			System.out.println("Option(s) are:");
			System.out.println("1. Get Employee Salary");
			Scanner SecondChoice = new Scanner(System.in);
			SecondChoiceInt = SecondChoice.nextInt();
			if(SecondChoiceInt == 1)
			{
				double SalaryTemp;
				System.out.println("What is the Name of the Employee?");
				Scanner NameInputSecond = new Scanner(System.in);
				NameInputSecondString = NameInputSecond.nextLine();
				SalaryTemp = myPayRoll.getSalary(NameInputSecondString);
				System.out.println("Salary: " + SalaryTemp);
			}
		}
		else
		{
			check = true;
		}
	}
	}
}
