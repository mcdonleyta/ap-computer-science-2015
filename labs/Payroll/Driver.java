import Class.*;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Driver
{
	public static void main(String[] args)
	{
		Scanner name = new Scanner(System.in);
		Scanner integer = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		String input_name = name.next();
		int next_int = integer.nextInt();
		String next_input;
		boolean check = true;
		List <Employee> ofEmployees = new ArrayList <Employee>();

		System.out.println("Would you like to create an employee?");
		System.out.println("	Yes");
		System.out.println("	No");
		CEO boss = new CEO(7, "Steve Jobs");
		ofEmployees.add(boss);
		next_input = input.next();

		while(next_input.equals("yes") && check == true)
		{
			System.out.println("What is the name of the employee?");
			input_name = input.next();
			System.out.println("What is the entry level of the employee?");
			next_int = integer.nextInt();
			Employee people = new Employee(next_int, input_name);
			ofEmployees.add(people);
			System.out.println("Would you like to add another?");
			input_name.nextLine();
			if(next_input.equals("yes"))
			{
				System.out.println("Creating another one...");
				check = true;
			}else
			if(next_input.equals("no"))
			{
				System.out.println("Goodbye");
				check = false;
			}

		}
	}
}